/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.model;

import java.util.ArrayList;

/**
 *
 * @author Himesh_2
 */
public class ShopResults {
    private ArrayList<ShopResult> results;

    public ShopResults() {
    }

    public ShopResults(ArrayList<ShopResult> results) {
        this.results = results;
    }

    /**
     * @return the results
     */
    public ArrayList<ShopResult> getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(ArrayList<ShopResult> results) {
        this.results = results;
    }
    
    
}
