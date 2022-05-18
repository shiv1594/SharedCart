package com.walmart.shared_cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class APIController {

    @GetMapping("/aboutSharedCart")
    public void aboutSharedCart() {
        // logic
    }

    @GetMapping("/getAddressbyUserID")
    public void getAddressbyUserID() {
        // logic
    }

    @GetMapping("/getItemDetailsByUserIdAndCartId")
    public void getItemDetailsByUserIdAndCartId() {
        // logic
    }

    @PostMapping("/addItemToCart")
    public void addItemToCart() {
        // logic
    }

    @PostMapping("/notifyUsersOfFreeShipping")
    public void notifyUsersOfFreeShipping() {
        // logic
    }

    @PostMapping("/lockCartByUSerId")
    public void lockCartByUSerId() {
        // logic
    }

    @PostMapping("/lockSharedCart")
    public void lockSharedCart() {
        // logic
    }

    @PostMapping("/placeOrder")
    public void placeOrder() {
        // logic
    }

    @PostMapping("/addToFavorite")
    public void addToFavorite() {
        // logic
    }

    @PostMapping("/deleteCart")
    public void deleteCart() {
        // logic
    }

    @PostMapping("/updateEndDateOfCart")
    public void updateEndDateOfCart() {
        // logic
    }

    @PostMapping("/getEndDateOfCart")
    public void getEndDateOfCart() {
        // logic
    }
}
