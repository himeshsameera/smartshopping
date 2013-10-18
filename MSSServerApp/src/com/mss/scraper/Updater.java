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
            FileReader fr = new FileReader("resources/test.txt");
            BufferedReader br = new BufferedReader(fr);
            String date = br.readLine();
            String location = br.readLine();
            while(br.ready()){
                String data = br.readLine();
                Scanner s = new Scanner(data);
                s.useDelimiter(Pattern.compile(":"));
                String ItemName = s.next();
                String unit = s.next();
                String price = s.next();
               
                /*
                 Code to add data to database
                 
                 */
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
}
