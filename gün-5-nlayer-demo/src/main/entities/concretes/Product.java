package main.entities.concretes;

import main.entities.abstracts.Entity;


public class Product implements Entity {
    private int ID;
    private int categoryID;
    private String name;
    private double unitPrice;
    private int unitInStock;

    public Product() {}

    public Product(int ID, int categoryID, String name, double unitPrice, int unitInStock) {
        super();
        this.ID = ID;
        this.categoryID = categoryID;
        this.name = name;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
    }

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }
    public int getCategoryID() { return categoryID; }
    public void setCategoryID(int categoryID) { this.categoryID = categoryID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
    public int getUnitInStock() { return unitInStock; }
    public void setUnitInStock(int unitInStock) { this.unitInStock = unitInStock;
    }
}
