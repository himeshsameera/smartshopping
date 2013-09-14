/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Palaa
 */
public class DB {
    private static final String URL = "jdbc:mysql://localhost:3306/mss";
    private static final String USERNAME="abc";
    private static final String PASSWORD="123";
    
    
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
    
    private static boolean verify(String user,String pass) throws Exception{
        ResultSet r=getDBResult("SELECT username,password FROM users WHERE username='"+user+"' AND password='"+pass+"'");
        if(r.next()){
            return true;
        }else{
            return false;
        }
    }
}
