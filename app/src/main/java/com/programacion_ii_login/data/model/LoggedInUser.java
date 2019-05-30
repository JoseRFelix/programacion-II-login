package com.programacion_ii_login.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private Integer userId;
    private String displayName;

    public LoggedInUser(Integer userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
}
