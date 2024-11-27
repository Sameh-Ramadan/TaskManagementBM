/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.taskmanagement.auth.dto;

/**
 *
 *
 */
public class AuthResponse {

    private String jwtToken;

    // Constructors, getters, and setters
    public AuthResponse() {}

    public AuthResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    // Getters and setters
    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
