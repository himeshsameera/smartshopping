/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

import java.util.ArrayList;

/**
 *
 * @author Himesh_2
 */
public class ItemNames {
    private ArrayList<ItemName> items;

    public ItemNames() {
    }

    public ItemNames(ArrayList<ItemName> items) {
        this.items = items;
    }
    
    

    /**
     * @return the items
     */
    public ArrayList<ItemName> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<ItemName> items) {
        this.items = items;
    }
    
}
