/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import com.mss.DAO.DB;
import com.mss.model.Item;
import com.mss.model.ItemSearch;
import com.mss.model.JsonConverter;
import com.mss.model.ShopForItemList;
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
    public static void main(String[] args) throws Exception {
        ArrayList<ItemSearch> itemSearch = new ArrayList<ItemSearch>();
        ItemSearch itemSearch1 = new ItemSearch("cake",1,2,"kg");
        ItemSearch itemSearch2 = new ItemSearch("table",3,2,"kg");
        ItemSearch itemSearch3 = new ItemSearch("tomato",5,2,"kg");
        itemSearch.add(itemSearch1);
        itemSearch.add(itemSearch2);
        itemSearch.add(itemSearch3);
        ArrayList<ShopForItemList> list = DB.searchItemList(itemSearch);
        for(int i=0;i<list.size();i++){
            System.out.println("final result - "+list.get(i).getShopId());
        }
    }
}
