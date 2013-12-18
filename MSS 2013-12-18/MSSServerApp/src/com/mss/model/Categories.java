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
    private ArrayList<Category> categories;

    public Categories() {
    }

    public Categories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    /**
     * @return the categories
     */
    public ArrayList<Category> getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
    
}
