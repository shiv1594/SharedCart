package com.walmart.shared_cart.controllers;

import com.walmart.shared_cart.models.SharedCart;
import com.walmart.shared_cart.models.User;
import com.walmart.shared_cart.service.SharedCartService;
import com.walmart.shared_cart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/sharedCart")
public class SharedCartController {

    @Autowired
    private SharedCartService sharedCartService;

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public Collection<SharedCart> getAllSharedCarts() {
        return sharedCartService.getAllSharedCarts();
    }

    @GetMapping("/{url}")
    public SharedCart getSharedCartDetails(@PathVariable String url) {
        return sharedCartService.getSharedCartDetails(url);
    }

    @GetMapping("/user/{userId}")
    public Collection<SharedCart> getUsersSharedCarts() {
        return sharedCartService.getAllSharedCarts();
    }

    @PostMapping("/{userId}/create")
    public String createSharedCart(@PathVariable Long userId) {
        User user = userService.getUser(userId);
        if (user == null) {
            return "ERROR";
        }
        return sharedCartService.createSharedCart(user);
    }

    @PostMapping("/{cartUrl}/{userId}/add")
    public SharedCart addUserToCart(@PathVariable String cartUrl, @PathVariable Long userId) {
        User user = userService.getUser(userId);
        if (user == null) {
            return null;
        }
        return sharedCartService.addUser(cartUrl, user);
    }

}
