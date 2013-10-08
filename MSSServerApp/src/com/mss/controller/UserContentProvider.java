package com.mss.controller;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mss.model.Item;
import com.mss.model.Items;
import com.mss.model.JsonConverter;


@Controller
@RequestMapping("/user/*")
public class UserContentProvider {
	
	final static Logger logger = LoggerFactory.getLogger(UserContentProvider.class);
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public @ResponseBody String processLogin(HttpServletRequest req,HttpServletResponse res) throws Exception{

            
            res.setContentType("plain/text");
            String user = req.getParameter("user");
            String pass = req.getParameter("pass");
          //  System.out.println(".....................Processing request.................");
            if(com.mss.DAO.DB.verifyLogin(user, pass)){
                return "true";
            }
            return "false";
	}
        
        @RequestMapping(value = "profile", method = RequestMethod.GET)
	public @ResponseBody String profileFetch(HttpServletRequest req,HttpServletResponse res) throws Exception{

            
            res.setContentType("plain/text");
            String Id = req.getParameter("user");
            System.out.println(".....................Processing request.................");
            if(com.mss.DAO.DB.fetchingProfile(Id)){
                return "true";
            }
            return "false";
	}
}
