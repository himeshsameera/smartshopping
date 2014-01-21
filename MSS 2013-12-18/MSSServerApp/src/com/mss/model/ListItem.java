/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

import java.io.Serializable;

/**
 *
 * @author Himesh_2
 */
public class ListItem implements Serializable{
    private int id;
    private String name;
    private int amount;
    private String unit;

    public ListItem() {
    }

    
    public ListItem(int id) {
        this.id = id;
    }
    
    public ListItem(String name, int id,int amount,String unit) {
        this.name = name;
        this.id = id;
        this.amount = amount;
        this.unit = unit;
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
