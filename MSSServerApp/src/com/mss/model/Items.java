package com.mss.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Items implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	ArrayList<Item> itemList;


	public Items() {
		
	}

	public Items(ArrayList<Item> itemList) {
		
		this.itemList = itemList;
	}

	
	public ArrayList<Item> getItemList() {
		return itemList;
	}


	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
}
