/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.DAO;

import com.mss.model.Item;
import com.mss.model.Items;
import com.mysql.jdbc.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author Palaa
 */

public class DB {
   
    private static final String URL = "jdbc:mysql://localhost:3306/mssystem";
    private static final String USERNAME="root";
    private static final String PASSWORD="";
//    
      // private static final String URL = "jdbc:mysql://sql4.freemysqlhosting.net:3306/sql418593";
   // private static final String USERNAME="sql418593";
   // private static final String PASSWORD="yT2%iF7*"; 
    
    /**
     * Creates the connection to the database.
     **/
    
    private static Connection connect() throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        return con;
    }
    

    private static boolean executeQuery(String sql) throws Exception{
        Connection con = connect();
        PreparedStatement p =con.prepareStatement(sql);
        p.executeUpdate();
        p.close();
        return true;
    }
 
    public static ResultSet getDBResult(String sql) throws Exception{
            Connection con = connect();
            ResultSet r = con.createStatement().executeQuery(sql);
            return r;
    }
    
    public static boolean verifyLogin(String user,String pass) throws Exception{
        ResultSet r=getDBResult("SELECT user,pass FROM users WHERE user='"+user+"' AND pass='"+pass+"'");
        if(r.next()){
            return true;
        }else{
            return false;
        } 
    }
    
    
    public static Items searchItem(String itemName,int categoryID,int cityID) throws Exception{
        //System.out.println("333");
        ResultSet r=getDBResult("SELECT itemName,itemPrice,itemImage from ITEMS where itemName='"+itemName+"' AND categoryID="+categoryID+" AND cityID="+cityID+";");
        ArrayList<Item> itemList= null; 
        while(r.next()){
            Item item=new Item(r.getString("itemName"), r.getDouble("itemPrice"), r.getString("itemImage"));
            //System.out.println(r.getString("itemImage"));
            //System.out.println(r.getDouble("itemPrice"));
            itemList.add(item);
        }
        //System.out.println("444");
        Items items=new Items(itemList);
        //System.out.println(itemList);
        return items;
        
    }

    public static boolean fetchingProfile(String Id) throws Exception{
        ResultSet r=getDBResult("SELECT user,pass FROM users WHERE user='"+Id+"'");
        if(r.next()){
            return true;
        }else{
            return false;
        }
    }

    public static void editPrice(int shopid, int id, double d) {
        try {
            String sql ="UPDATE shop_item_unit_price set price = "+d+" WHERE shop_id = "+shopid+" AND item_unit_id ="+id+";";
            System.out.println("SQL is : "+sql);
            executeQuery(sql);
          //  throw new UnsupportedOperationException("Not yet implemented");
        } catch (Exception ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Item getItem(int id){
         try {
            String sql ="SELECT * FROM WHERE itemid='"+id+"';";
            System.out.println("SQL is : "+sql);
            ResultSet r = getDBResult(sql);
            if(r.next()){
                return new Item(r.getString("index"), r.getDouble("price"), r.getString("image"));
            }
          //  throw new UnsupportedOperationException("Not yet implemented");
        } catch (Exception ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return null;
    }
}
//r.getString("itemName"), r.getDouble("itemPrice"), r.getBlob("itemImage")
