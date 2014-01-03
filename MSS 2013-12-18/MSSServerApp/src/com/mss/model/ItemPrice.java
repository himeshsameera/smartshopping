/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

/**
 *
 * @author Palaa
 */
public class ItemPrice {
    private int itemId;
    private double price;
    
    public ItemPrice(){
    
    }
    
    public ItemPrice(int itemId,double price){
        this.itemId=itemId;
        this.price=price;
    }
}
