/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.controller;

import com.mss.model.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Himesh_2
 */

@Controller
@RequestMapping("/list/*")
public class ShoppingListController {
    
    final static Logger logger = LoggerFactory.getLogger(ShoppingListController.class);
	
    @RequestMapping(value = { "process" }, method = RequestMethod.GET)
    public void handleShoppingList(HttpServletRequest req,
                    HttpServletResponse res, Model model) throws Exception {

        
        // sample data
        // http://localhost:8084/MSSServerApp/list/process?json={%22listItems%22:[{%22id%22:1},{%22id%22:8},{%22id%22:3}]}
        // json={"listItems":[{"id":1},{"id":8},{"id":3}]}

            logger.debug("Processing Shopping List");

            String s = req.getParameter("json");
            
            System.out.println(s);
            ObjectMapper mapper = new ObjectMapper();
            ListItems shoppingList = mapper.readValue(s, ListItems.class);

            ArrayList <ShopResult> results = new ArrayList<ShopResult>();
         
            
            // Get the eligable shop ids from the database. 
            for (ListItem item : shoppingList.getListItems()) {
                int id = item.getId();
                ArrayList<Integer> shopIDs = new ArrayList<Integer>();
                
                ShopResult sr = new ShopResult(2, "Weerasinghe Stores", "Nugegoda");
                results.add(sr);
            }
            
            
            // create the result using the shop ids.   

                
                ShopResults out = new ShopResults(results);
                
                String json = JsonConverter.convertToJson(out);
                
		PrintWriter writer = res.getWriter();
		writer.print(json);
    }

    
    @RequestMapping(value = { "generate" }, method = RequestMethod.GET)
    public void handleGetProgramsRequest(HttpServletRequest req,
                    HttpServletResponse res, Model model) throws Exception {


            logger.debug(" Get Product List");


            ListItem item1 = new ListItem(5);
            ListItem item2 = new ListItem(8);            
            ArrayList<ListItem> list = new ArrayList<ListItem>();
            list.add(item1);
            list.add(item2);
            ListItems items = new ListItems(list);


            String json = JsonConverter.convertToJson(items);
            res.setContentType("application/json;");

            PrintWriter writer = res.getWriter();
            writer.print(json);
    }

    
}
