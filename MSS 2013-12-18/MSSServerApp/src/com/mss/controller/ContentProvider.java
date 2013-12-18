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
@RequestMapping("/cp/*")
public class ContentProvider {
	
	final static Logger logger = LoggerFactory.getLogger(ContentProvider.class);
	
	@RequestMapping(value = { "products" }, method = RequestMethod.GET)
	public void handleGetProgramsRequest(HttpServletRequest req,
			HttpServletResponse res, Model model) throws Exception {
            
            
		logger.debug(" Get Product List");

                
                
                
                
		Item item1 = new Item();
		Item item2 = new Item();
		ArrayList<Item> list = new ArrayList<Item>();
		//list.add(item1);
		//list.add(item2);
		Items items = new Items(list);
                
                
                
                
                
		String json = JsonConverter.convertToJson(items);
		res.setContentType("application/json;");
                
                
		PrintWriter writer = res.getWriter();
		writer.print(json);
	}

        	@RequestMapping(value = { "testing" }, method = RequestMethod.GET)
	public void handleGettestRequest(HttpServletRequest req,
			HttpServletResponse res, Model model) throws Exception {
   
                    
		logger.debug(" Get Product List");
            //        System.out.println("bawwaaaaaaaa");
		String json = "{\"items\":[{\"itemName\":\"Banana\",\"itemPrice\":\"Rs 10\"},{\"itemName\":\"Rice\",\"itemPrice\":\"Rs 80\"},{\"itemName\":\"Rice\",\"itemPrice\":\"Rs 80\"}]}";
	//	res.setContentType("application/json;");
                
                
		PrintWriter writer = res.getWriter();
		writer.print(json);
	}
        
        
	@RequestMapping(value = { "product/{pid}" })
	public void getProduct(HttpServletRequest req,
			HttpServletResponse res, Model model,
			@PathVariable("pid") String pid) throws NumberFormatException, Exception {
		logger.debug(" +++handleGetContentRequest begin");


                
                
		Item item1 = new Item();
                

                
                
		String json = JsonConverter.convertToJson(item1);	   
		res.setContentType("application/json;");
		PrintWriter writer = res.getWriter();
		//writer.print(json);
	}
	
	@RequestMapping(value = "sample/{id}", method = RequestMethod.GET, produces = {"application/json" })
	public @ResponseBody Book test(HttpServletRequest req,HttpServletResponse res) throws Exception{
		res.setHeader("Location", "http://server:port/car/123");
		Book book=new Book(12, "Book1");
		return book;
	}
	
	class Book{
		private int id;
		private String name;
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public Book(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
	}

}
