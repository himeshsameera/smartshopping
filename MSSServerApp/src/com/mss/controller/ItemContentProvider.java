/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.controller;

import com.mss.DAO.DB;
import com.mss.model.Item;
import com.mss.model.Items;
import com.mss.model.JsonConverter;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	
	@RequestMapping(value = { "search" }, method = RequestMethod.GET)
	public void processSearch(HttpServletRequest req,HttpServletResponse res, Model model) throws Exception {
            
                
		logger.debug(" Get item List");
                String name=req.getParameter("name");
                int city=Integer.parseInt(req.getParameter("city"));
                int category=Integer.parseInt(req.getParameter("category"));
                //System.out.println("111");
                Items items=DB.searchItem(name, category, city);
                //System.out.println("222");
		String json = JsonConverter.convertToJson(items);
		res.setContentType("application/json;");	
		PrintWriter writer = res.getWriter();
		writer.print(json);
        }
}
