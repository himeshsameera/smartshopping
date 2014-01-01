/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.scraper;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mss.DAO.DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 *
 * @author Palaa
 */
public class ScraperKeels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException, InterruptedException, Exception {
        String content = readFile("C:/Users/Palaa/Desktop/keels/aa.htm");
        Document doc = Jsoup.parse(content);
        String title = doc.title();
        
        Element spans = doc.select("span.fixedfont2").get(1);
        String categoryName = spans.select("font[color=#000000]").get(0).text().toString();
        System.out.println(categoryName);
        
        ResultSet r1 = DB.getDBResult("SELECT * FROM category;");
        boolean hasCategory = false;
        while(r1.next()){
            if(categoryName.equalsIgnoreCase(r1.getString("name"))){
                hasCategory = true;
                break;
            }else{
                hasCategory = false;
            }
        }
        
        if(!hasCategory){
            DB.executeQuery("INSERT INTO category (name) VALUES ('"+categoryName+"');");
        }
        
        Element tables = doc.select("table[width=100%][border=0][cellspacing=0][cellpadding=3]").get(1);
        Elements trs=tables.select("tr");
        int i=0,j=0;
        Element tr =trs.get(i);
        
        int categoryId = 0;
        ResultSet r2 = DB.getDBResult("SELECT * FROM category WHERE name='"+categoryName+"';");
        while(r2.next()){
            categoryId = r2.getInt("id");
        }
        
        PrintWriter writer = new PrintWriter("keelsData.txt", "UTF-8");
        
        int itemId = 0;
        while(tr!=null){
            if(i<trs.size()-1){
                tr=trs.get(i);
                Elements tds=tr.select("td");
                Element td=tds.get(j);
   
                ResultSet r3 = DB.getDBResult("SELECT * FROM item;");
                ResultSet r4 = DB.getDBResult("SELECT * FROM shop_item_unit_price"); 
   
                while(td!=null){
                    if(j<tds.size()-1){
                        td=tds.get(j);
                        Element fonttag=td.select("font").get(0);
                        Element price=fonttag.select("font[color=red]").get(0);
                        String itemname=fonttag.select("b").get(0).text().toString();
                        String itemprice=price.text();
                        String[] itemPriceSplit = itemprice.split(" ");
                        double itemPriceDouble = Double.parseDouble(itemPriceSplit[0].substring(3));
                        boolean hasItem = false;
                        while(r3.next()){
                            if(itemname.equals(r3.getString("name"))){
                                hasItem = true;
                                break;
                            }
                        }
                        if(!hasItem){
                            DB.executeQuery("INSERT INTO item (name,category_id,unit_id) VALUES ('"+itemname+"',"+categoryId+",2);");
                        }
                        
                        ResultSet r5 = DB.getDBResult("SELECT * FROM item WHERE name='"+itemname+"';");
                        while(r5.next()){
                            itemId = r5.getInt("id");
                        }
                        
                        boolean hasPrice = false;
                        while(r4.next()){
                            if(itemId == r4.getInt("item_id")){
                                DB.executeQuery("UPDATE shop_item_unit_price SET price="+itemPriceDouble+";");
                                hasPrice = true;
                            }
                        }
                        
                        if(!hasPrice){
                            DB.executeQuery("INSERT INTO shop_item_unit_price (shop_id,item_id,price) VALUES (5,"+itemId+","+itemPriceDouble+");");
                        }
                        
                        writer.println(itemname);
                        writer.println(itemprice);
                        System.out.println("zz"+itemname+"zz");
                        System.out.println("cc"+itemprice+"cc");
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
    private static String readFile(String path) throws IOException{
        
        FileReader fr = new FileReader(path);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(fr);
        String s;
        while( (s= br.readLine())!=null){
            sb.append(s);
            sb.append('\n');
        }
        return sb.toString();
    }
    
}
