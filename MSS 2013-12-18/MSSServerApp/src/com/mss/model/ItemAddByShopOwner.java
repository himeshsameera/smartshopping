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
    
    private String itemName;
    private String itemCategoryName;
    private String itemUnit;
    private int itemCategoryId;
    private int itemUnitId;
    private double itemDouble;
    
    public ItemAddByShopOwner(){
        
    }
    
    public ItemAddByShopOwner(String name, String categoryName, int categoryId,String unit, int unitId, double price){
        this.itemName = name;
        this.itemCategoryName = categoryName;
        this.itemCategoryId = categoryId;
        this.itemUnitId = unitId;
        this.itemUnit = unit;
        this.itemDouble = price;
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
     * @return the itemCategoryName
     */
    public String getItemCategoryName() {
        return itemCategoryName;
    }

    /**
     * @param itemCategoryName the itemCategoryName to set
     */
    public void setItemCategoryName(String itemCategoryName) {
        this.itemCategoryName = itemCategoryName;
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

    /**
     * @return the itemCategoryId
     */
    public int getItemCategoryId() {
        return itemCategoryId;
    }

    /**
     * @param itemCategoryId the itemCategoryId to set
     */
    public void setItemCategoryId(int itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    /**
     * @return the itemUnitId
     */
    public int getItemUnitId() {
        return itemUnitId;
    }

    /**
     * @param itemUnitId the itemUnitId to set
     */
    public void setItemUnitId(int itemUnitId) {
        this.itemUnitId = itemUnitId;
    }
}

