package com.programacion_ii_login.data.model;

public class Agent {
    private String name;
    private String title;
    private int image;

    public Agent(String name, String title, int image) {
        this.name = name;
        this.title = title;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {return image;}

    public String getTitle() { return title; }
}
