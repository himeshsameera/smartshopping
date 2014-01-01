/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.scraper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author Himesh_2
 */
public class Updater {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:/test.txt");
            BufferedReader br = new BufferedReader(fr);

            int shopid = 2;
            
            while(br.ready()){
                String data = br.readLine();              // TIARA ROLLO SWISS ROLL 30G
                int id = com.mss.DAO.update.getItemUnitbyScrapedName(data);
                String value = br.readLine();               // Rs.25.00    (US$0.20)
                Scanner s = new Scanner(value.replaceAll("Rs.", ""));
                double d = s.nextDouble();
                System.out.println("Adding item "+ data +"price : " +d);
                com.mss.DAO.DB.editPrice(shopid,id,d);
               
                /*
                 Code to add data to database
                 
                 */
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
}
