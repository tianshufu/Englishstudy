package com.tianshu.entity;

public class User {
    private String Username;
    private String Password;
    private String email;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(String username, String password, String email) {
        Username = username;
        Password = password;
        this.email = email;
    }
}




