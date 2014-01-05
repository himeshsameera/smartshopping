/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

/**
 *
 * @author Himesh_2
 */
public class ItemName {
    private String name;
    private String image;
    private int id;

    public ItemName() {
        
    }

    public ItemName( int id,String name) {
        this.name = name;
        this.id = id;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
    
}
