/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Himesh_2
 */
public class ListItems implements Serializable{

    private static final long serialVersionUID = 1L;
    private ArrayList<ListItem> listItems;

    public ListItems() {
    }

    
    
    public ListItems(ArrayList<ListItem> listItems) {
        this.listItems = listItems;
    }

    /**
     * @return the listItems
     */
    public ArrayList<ListItem> getListItems() {
        return listItems;
    }

    /**
     * @param listItems the listItems to set
     */
    public void setListItems(ArrayList<ListItem> listItems) {
        this.listItems = listItems;
    }

}
