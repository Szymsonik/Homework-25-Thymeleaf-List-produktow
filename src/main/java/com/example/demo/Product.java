package com.example.demo;

public class Product {
    private String name;
    private String priceOnString;
    private double price;

    public Product() {
    }


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceOnString(String priceOnString) {
        this.priceOnString = priceOnString;
    }

    public String getPriceOnString() {
        return priceOnString;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
