package com.programacion_ii_login.data.model;

import java.io.Serializable;

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

    public Agent(String name, String title, int image, int missions, int success, int fails, String phone, String email, String address) {
        this.name = name;
        this.title = title;
        this.image = image;
        this.success = success;
        this.missions = missions;
        this.fails = fails;
        this.phone = phone;
        this.email = email;
        this.address = address;
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

    public String getAddress() {
        return address;
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
