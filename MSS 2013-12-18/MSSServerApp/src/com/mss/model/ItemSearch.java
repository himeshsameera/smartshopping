/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

/**
 *
 * @author Palaa
 */
public class ItemSearch {
    private String itemName;
    private int itemId;
    private int amount;
    
    public ItemSearch(){
    
    }
    
    public ItemSearch(String itemName, int itemId, int amount){
        this.itemName=itemName;
        this.itemId=itemId;
        this.amount=amount;
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
}
