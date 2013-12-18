/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

/**
 *
 * @author Himesh_2
 */
public class ShopResult {
 
    private int shopID;
    private String shopName;
    private String shopAddress;

    public ShopResult() {
    }

    public ShopResult(int shopID, String shopName, String shopAddress) {
        this.shopID = shopID;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
    }

    
    /**
     * @return the shopID
     */
    public int getShopID() {
        return shopID;
    }

    /**
     * @param shopID the shopID to set
     */
    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    /**
     * @return the shopName
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * @param shopName the shopName to set
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * @return the shopAddress
     */
    public String getShopAddress() {
        return shopAddress;
    }

    /**
     * @param shopAddress the shopAddress to set
     */
    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }
    
    
}
