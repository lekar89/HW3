package com.vlad.progect24_06_16_fragment.model;

/**
 * Created by Влад on 24.09.2016.
 */
public class Tool {

    public Tool(){}

    private int id;
    private String brand;
    private String model;
    private String imageUrl;
    private String type;
    private double price;
    private int quantity;


    public Tool(int id, String brand, String model, String imageUrl, String type, double price, int quantity) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.imageUrl = imageUrl;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public Tool setId(int id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Tool setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Tool setModel(String model) {
        this.model = model;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Tool setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getType() {
        return type;
    }

    public Tool setType(String type) {
        this.type = type;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Tool setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Tool setQuantity(int quantity) {
        this.quantity = quantity;

        return this;
    }
}
