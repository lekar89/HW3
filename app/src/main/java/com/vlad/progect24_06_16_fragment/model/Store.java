package com.vlad.progect24_06_16_fragment.model;

/**
 * Created by Влад on 24.09.2016.
 */
public class Store {

    public Store()
    {}

    private int id;
    private String name;
    private String address;
    private String phone;
    private Location location;

    public Store(int id, String name, String address,
                     String phone, Location location) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public Store setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Store setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Store setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Store setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public Store setLocation(Location location) {
        this.location = location;
        return this;
    }
}
