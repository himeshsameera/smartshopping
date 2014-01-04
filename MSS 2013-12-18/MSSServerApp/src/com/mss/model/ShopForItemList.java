/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Palaa
 */
public class ShopForItemList implements Serializable{
    private int shopId;
    private ArrayList<ItemPrice> itempriceList;
    private String shopName;
    
    public ShopForItemList(){
    
    }
    
    public ShopForItemList(int shopId, ArrayList<ItemPrice> itempriceList){
        this.shopId=shopId;
        this.itempriceList=itempriceList;
    }

    /**
     * @return the shopId
     */
    public int getShopId() {
        return shopId;
    }

    /**
     * @param shopId the shopId to set
     */
    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    /**
     * @return the itempriceList
     */
    public ArrayList<ItemPrice> getItempriceList() {
        return itempriceList;
    }

    /**
     * @param itempriceList the itempriceList to set
     */
    public void setItempriceList(ArrayList<ItemPrice> itempriceList) {
        this.itempriceList = itempriceList;
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
}
