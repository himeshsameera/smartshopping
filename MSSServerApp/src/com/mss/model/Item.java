package com.mss.model;

import com.mysql.jdbc.Blob;



public class Item  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private Double price;
    private String image;
    
    public Item(){
        
    }
    
     public Item(String name, Double price, String image){
    	this.price = price;
    	this.name = name;
        this.image=image;
    }
       
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the image
     */
	


}
