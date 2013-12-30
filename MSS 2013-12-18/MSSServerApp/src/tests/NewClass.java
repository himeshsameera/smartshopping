/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import com.mss.DAO.DB;
import com.mss.model.Item;
import com.mss.model.JsonConverter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.util.JSONPObject;

/**
 *
 * @author Himesh_2
 */


public class NewClass {
    public static void main(String[] args) {
        System.out.println("Starting...");
           ArrayList<Integer> a = DB.minimalSearch(1);
           for (Integer integer : a) {
               System.out.println(integer);
           }
           System.out.println("end");
    }
}
