/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.taskmanagement;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 */
@RestController
public class SimpleController {
    
    @RolesAllowed("ADMIN")
    @GetMapping("/admin")
    public ResponseEntity<String> testAdmin() {
        return ResponseEntity.ok("This is the Admin role");
    }

    @RolesAllowed("USER")
    @GetMapping("/user")
    public ResponseEntity<String> testUser() {
        return ResponseEntity.ok("This is the User role");
    }
}
