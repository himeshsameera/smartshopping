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

    public ListItem() {
    }

    
    public ListItem(int id) {
        this.id = id;
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
