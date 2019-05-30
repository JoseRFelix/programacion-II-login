package com.programacion_ii_login.data.model;

public class User {
    private Integer userId;
    private String displayName;
    private String password;

    public User (Integer userId, String displayName, String password) {
        this.userId = userId;
        this.displayName = displayName;
        this.password = password;
    }

    public String getDisplayName() { return this.displayName;}
    public Integer getUserId() { return this.userId; }
    public String getPassword() { return this.password;}
}
