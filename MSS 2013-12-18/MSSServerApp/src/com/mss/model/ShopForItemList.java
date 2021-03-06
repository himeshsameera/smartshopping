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
    private String shopAddress;
    private String shopimageUrl;
    private int distance = 0;
    private int totalPrice =0;
    
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

    /**
     * @return the shopimageUrl
     */
    public String getShopimageUrl() {
        return shopimageUrl;
    }

    /**
     * @param shopimageUrl the shopimageUrl to set
     */
    public void setShopimageUrl(String shopimageUrl) {
        this.shopimageUrl = shopimageUrl;
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     * @return the totalPrice
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
