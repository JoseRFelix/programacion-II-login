package com.programacion_ii_login.data.model;

public class Agent {
    String name;
    String title;

    public Agent(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
