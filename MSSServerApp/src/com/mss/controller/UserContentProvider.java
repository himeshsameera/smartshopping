package com.mss.controller;


import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user/*")
public class UserContentProvider {
	
	final static Logger logger = LoggerFactory.getLogger(UserContentProvider.class);
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public @ResponseBody String processLogin(HttpServletRequest req,HttpServletResponse res) throws Exception{

            
            res.setContentType("plain/text");
            String user = req.getParameter("user");
            String pass = req.getParameter("pass");
            if(com.mss.DAO.DB.verifyLogin(user, pass)){
                req.getSession().setAttribute("UserId", 1);
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
        
        
        // todo - Implement this
         @RequestMapping(value = "addItem", method = RequestMethod.GET)
	public @ResponseBody String addItem(HttpServletRequest req,HttpServletResponse res) throws Exception{
            res.setContentType("plain/text");
            return "Not Implemented yet";
	}
 
        // todo - Implement this
        @RequestMapping(value = "viewMyItems", method = RequestMethod.GET)
	public @ResponseBody String viewMyItems(HttpServletRequest req,HttpServletResponse res) throws Exception{
            res.setContentType("plain/text");
            return "{items:[{'id':1,'name':'Banana','price':100},{'id':1,'name':'Banana','price':100}]}";
	}
        
        // todo - Implement this
        @RequestMapping(value = "removeItem", method = RequestMethod.GET)
	public @ResponseBody String removeItem(HttpServletRequest req,HttpServletResponse res) throws Exception{
            res.setContentType("plain/text");
            
            return "Not Implemented yet";
	}
  
}
