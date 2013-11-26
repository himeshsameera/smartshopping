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
public class Categories {
    private ArrayList<Category> catagories;

    public Categories() {
    }

    public Categories(ArrayList<Category> catagories) {
        this.catagories = catagories;
    }

    /**
     * @return the catagories
     */
    public ArrayList<Category> getCatagories() {
        return catagories;
    }

    /**
     * @param catagories the catagories to set
     */
    public void setCatagories(ArrayList<Category> catagories) {
        this.catagories = catagories;
    }
    
}
