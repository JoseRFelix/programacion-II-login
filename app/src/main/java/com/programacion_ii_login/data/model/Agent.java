package com.programacion_ii_login.data.model;

import java.io.Serializable;
import java.util.Map;

public class Agent implements Serializable {
    private String name;
    private String title;
    private int image;
    private int success;
    private int missions;
    private int fails;
    private String phone;
    private String email;
    private String address;
    private Map<String, Double> coordinates;

    public Agent(String name, String title, int image, int missions, int success, int fails, String phone, String email, String address, Map<String, Double> coordinates) {
        this.name = name;
        this.title = title;
        this.image = image;
        this.success = success;
        this.missions = missions;
        this.fails = fails;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {return address;}

    public Map<String, Double> getCoordinates() {
        return coordinates;
    }

    public int getMissions() {
        return missions;
    }

    public int getFails() {
        return fails;
    }

    public String getPhone() {
        return phone;
    }

    public int getSuccess() {
        return success;
    }
}
