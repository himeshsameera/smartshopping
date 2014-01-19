/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.controller;

import com.mss.DAO.DB;
import com.mss.model.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
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
 * @author Palaa
 */
@Controller
@RequestMapping("/item/*")

public class ItemContentProvider {
    final static Logger logger = LoggerFactory.getLogger(ContentProvider.class);

    @Deprecated
    @RequestMapping(value = { "search" }, method = RequestMethod.GET)
    public void processSearch(HttpServletRequest req,HttpServletResponse res, Model model) throws Exception {


            logger.debug(" Get item List");
            String name=req.getParameter("name");
            Items items=DB.searchItem(name,0,0);
            String json = JsonConverter.convertToJson(items);
            PrintWriter writer = res.getWriter();
            writer.print(json);
    }

    @RequestMapping(value = { "item" }, method = RequestMethod.GET)
    public void processItem(HttpServletRequest req,HttpServletResponse res, Model model) throws Exception {


            logger.debug(" Get item");
            int itemid=Integer.parseInt(req.getParameter("id"));
            Item item=DB.getItem(itemid);
            String json = JsonConverter.convertToJson(item);
            res.setContentType("application/json;");	
            PrintWriter writer = res.getWriter();
            writer.print(json);
    }
@Deprecated
    @RequestMapping(value = { "processList" }, method = RequestMethod.GET)
    public void processList(HttpServletRequest req,HttpServletResponse res, Model model) throws Exception {
		logger.debug("Processing list - Not implemented yet");
		res.setContentType("application/json;");	
                
                
                
                ShopResult sr1 = new ShopResult(2, "Weerasinghe Stores", "Nugegoda");
                ShopResult sr2 = new ShopResult(2, "Weerasinghe Stores", "Nugegoda");
                ShopResult sr3 = new ShopResult(2, "Weerasinghe Stores", "Nugegoda");
                
                ArrayList <ShopResult> results = new ArrayList<ShopResult>();
                results.add(sr1);
                results.add(sr2);
                results.add(sr3);
                
                ShopResults out = new ShopResults(results);
                
                String json = JsonConverter.convertToJson(out);
                
		PrintWriter writer = res.getWriter();
		writer.print("Use /list/process instead");
        }
    
    @RequestMapping(value = { "categories" }, method = RequestMethod.GET)
    public void getCategories(HttpServletRequest req,HttpServletResponse res, Model model) throws Exception {
		logger.debug("Processing categories");
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		res.setContentType("text/HTML;");	
                
                Categories c = DB.getCategories();
                String output = JsonConverter.convertToJson(c);
                
		PrintWriter writer = res.getWriter();
		writer.print(output);
   }
    
    //return itemnames for the given  categoryId
    @RequestMapping(value = { "itemNames" }, method = RequestMethod.GET)
    public void getItemNames(HttpServletRequest req,HttpServletResponse res, Model model) throws Exception {
            
            res.setContentType("text/html");
            int categoryId = Integer.parseInt(req.getParameter("categoryId"));
            ArrayList<ItemName> itemNameList = new ArrayList<ItemName>();
            ResultSet r = DB.getDBResult("SELECT * FROM item INNER JOIN unit ON item.unit_id=unit.id WHERE category_id="+categoryId+";");
            while(r.next()){
                ItemName itemName = new ItemName();
                itemName.setId(r.getInt("id"));
                itemName.setName(r.getString("name"));
                itemName.setImage(r.getString("image"));
                itemName.setUnit(r.getString("unitname"));
                itemNameList.add(itemName);
            }
            ItemNames itemNames = new ItemNames(itemNameList);
            String output = JsonConverter.convertToJson(itemNames);
   //         String deb = "{\"myitems\":[{\"itemName\":\"malupaan\",\"itemid\":\"1\"},{\"itemName\":\"roospaan\",\"itemid\":\"5\"}]}";
            PrintWriter writer = res.getWriter();
            writer.print(output);

    }    
    
    @RequestMapping(value = { "addItem" }, method = RequestMethod.GET)
    public void addItem(HttpServletRequest req,HttpServletResponse res, Model model) throws Exception {
        res.setContentType("text/html");
        String s = req.getParameter("json");
        ObjectMapper mapper = new ObjectMapper();
        ItemAddByShopOwner addingItem = mapper.readValue(s, ItemAddByShopOwner.class);
        DB.addItemByShopOwner(1, addingItem.getItemId(), addingItem.getItemPrice());
    }
}

        

