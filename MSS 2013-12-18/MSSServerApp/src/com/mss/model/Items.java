package com.mss.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Items implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	ArrayList<Item> items;


	public Items() {
		
	}

	public Items(ArrayList<Item> itemList) {
		
		this.items = itemList;
	}

	
	public ArrayList<Item> getitems() {
		return items;
	}


	public void setitems(ArrayList<Item> itemList) {
		this.items = itemList;
	}
}
