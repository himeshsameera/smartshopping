/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

import java.io.Serializable;

/**
 *
 * @author Palaa
 */
public class ItemPrice implements Serializable{
    private int itemId;
    private double price;
    private String itemName;
    private int amount = 0;
    private int subtotal = 0;
    
    
    public ItemPrice(){
    
    }
    
    public ItemPrice(int itemId,double price){
        this.itemId=itemId;
        this.price=price;
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
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the subtotal
     */
    public int getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
}
