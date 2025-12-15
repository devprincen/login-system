package com.app.model;

public class User {
    
    private String username;
    private String email;
    private String password;

    public User (String username, String email, String password) { 
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String setUsername() { return username; }
    public String setEmail() { return email; }
    public String setPassword() { return password; }

}
