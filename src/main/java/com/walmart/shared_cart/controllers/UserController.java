package com.walmart.shared_cart.controllers;

import com.walmart.shared_cart.models.Address;
import com.walmart.shared_cart.models.User;
import com.walmart.shared_cart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Collection<User> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUser(userId);
    }

    @GetMapping("/{userId}/address")
    public Address getUserAddress(@PathVariable Long userId) {
        return userService.getUser(userId).getAddress();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/delete/{userId}")
    public User removeUser(@PathVariable int userId) { return userService.deleteUser(userId);}

    @PostMapping("/{userId}/pay")
    public void payBill(@PathVariable Long userId) {
        //After checkout from sharedCart each user can pay their individual cart total. Existing walmart API is called
    }

    @GetMapping("/{orderId}/trackOrder")
    public void getOrderStatus(@PathVariable String orderId) {
        //After the order has been placed from shared cart each user can track their individual orders. Existing walmart API is called.
    }
}
