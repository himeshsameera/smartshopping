/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Palaa
 */

public class DB {
    
//    private static final String URL = "jdbc:mysql://localhost:3306/mss";
//    private static final String USERNAME="abc";
//    private static final String PASSWORD="123";
//    
       private static final String URL = "jdbc:mysql://sql4.freemysqlhosting.net:3306/sql418593";
    private static final String USERNAME="sql418593";
    private static final String PASSWORD="yT2%iF7*"; 
    
    /**
     * Creates the connection to the database.
     **/
    
    private static Connection connect() throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        return con;
    }
    
    /*
    public static boolean executeQuery(String sql) throws Exception{
        Connection con = connect();
        PreparedStatement p =con.prepareStatement(sql);
        p.executeUpdate();
        p.close();
        return true;
    }
    */
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
    
    
}
