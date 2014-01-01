/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

/**
 *
 * @author Palaa
 */
public class ItemAddByShopOwner {
    
    private int itemId;
    private double itemPrice;
    
    public ItemAddByShopOwner(){
        
    }
    
    public ItemAddByShopOwner(int itemId, double price){
        this.itemId = itemId;
        this.itemPrice = price;
    }

    /**
     * @return the itemId
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
