/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.scraper;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;


/**
 *
 * @author Palaa
 */
public class ScraperKeels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException, InterruptedException {
        //FileReader fr = new FileReader("");
        String content = readFile("C:/Users/Palaa/Desktop/keels/aa.htm", StandardCharsets.UTF_8);
         Document doc = Jsoup.parse(content);
        //BufferedReader br = new BufferedReader(fr);
  //      System.out.println(content);
//        Document doc = Jsoup.connect("file:///").get();
        String title = doc.title();
        Element tables = doc.select("table[width=100%][border=0][cellspacing=0][cellpadding=3]").get(1);
        Elements trs=tables.select("tr");
        int i=0,j=0;
        Element tr =trs.get(i);
        PrintWriter writer = new PrintWriter("keelsData.txt", "UTF-8");
        while(tr!=null){
            if(i<trs.size()-1){
                //System.out.println("11");
                tr=trs.get(i);
                //System.out.println("i is "+i);
                Elements tds=tr.select("td");
                Element td=tds.get(j);
                while(td!=null){
                    if(j<tds.size()-1){
                        td=tds.get(j);
                        Element fonttag=td.select("font").get(0);
                        Element price=fonttag.select("font[color=red]").get(0);
                        String itemname=fonttag.select("b").get(0).text().toString();
                        String itemprice=price.text();
                        writer.println(itemname);
                        writer.println(itemprice);
                        System.out.println(itemname);
                        System.out.println(itemprice);
                        j=j+2;
                    }else{
                        j=0;
                        break;
                    }
                }
            i=i+2;
            }else{
                
                break;
            } 
        }
        writer.close();
         
}
    private static String readFile(String path, Charset encoding) throws IOException{
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return encoding.decode(ByteBuffer.wrap(encoded)).toString();
    }
    
}
