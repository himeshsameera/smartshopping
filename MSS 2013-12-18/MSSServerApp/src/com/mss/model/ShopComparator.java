/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

import java.util.Comparator;

/**
 *
 * @author Himesh_2
 */
public class ShopComparator implements Comparator<ShopForItemList> {
    
    @Override
    public int compare(ShopForItemList o1, ShopForItemList o2) {
        if(o1.getItempriceList().size()>o2.getItempriceList().size()){
            return 0;
        }
        return 1;
    }

}
