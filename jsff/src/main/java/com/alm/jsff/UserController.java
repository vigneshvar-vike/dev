/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alm.jsff;

/**
 *
 * @author Mavensi Lap062
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class UserController {

    @Inject
    private UserService userService;

    private User user = new User();

    public void createUser() {
        userService.createUser(user);
        user = new User(); // Clear the form after creating a user
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Getters and setters

    // Other methods for handling user actions
}