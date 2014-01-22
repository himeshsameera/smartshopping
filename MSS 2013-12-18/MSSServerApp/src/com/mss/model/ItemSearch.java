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
public class ItemSearch implements Serializable {
    private String itemName;
    private int itemId;
    private int amount;
    private String itemUnit;
    
    public ItemSearch(){
    
    }
    
    public ItemSearch(String itemName, int itemId, int amount, String itemUnit){
        this.itemName=itemName;
        this.itemId=itemId;
        this.amount=amount;
        this.itemUnit=itemUnit;
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

    /**
     * @return the itemUnit
     */
    public String getItemUnit() {
        return itemUnit;
    }

    /**
     * @param itemUnit the itemUnit to set
     */
    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }
}
