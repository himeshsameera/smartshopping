package com.mss.model;

public class Item  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String itemName;
    private Double itemPrice;
    private String image;
    
    public Item(){
        
    }
    
     public Item(String name, Double price, String image){
    	this.itemPrice = price;
    	this.itemName = name;
        this.image=image;
    }
       
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getitemName() {
		return itemName;
	}
	public void setitemName(String name) {
		this.itemName = name;
	}

    /**
     * @return the price
     */
    public Double getitemPrice() {
        return itemPrice;
    }

    /**
     * @param price the price to set
     */
    public void setitemPrice(Double price) {
        this.itemPrice = price;
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
