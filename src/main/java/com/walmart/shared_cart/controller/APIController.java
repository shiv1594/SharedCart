package com.walmart.shared_cart.controller;

import com.walmart.shared_cart.model.SharedCart;
import com.walmart.shared_cart.service.UrlGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
public class APIController {

    @Autowired
    UrlGenerationService urlGenerationService;

    @GetMapping("/aboutSharedCart")
    public void aboutSharedCart() {
        // logic
    }

    @GetMapping("/getAddressbyUserID")
    public void getAddressbyUserID() {
        // logic
    }

    @PostMapping("/createSharedCart")
    public String createSharedCart() {
        return urlGenerationService.generateUniqueUrl();
    }

    @GetMapping("/getSharedCart")
    public SharedCart getSharedCart(@RequestParam String url) {
        return urlGenerationService.getSharedCart(url);
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
    public  void placeOrder() {
        // logic
    }

    @PostMapping("/addToFavorite")
    public  void addToFavorite() {
        // logic
    }

    @PostMapping("/deleteCart")
    public  void deleteCart() {
        // logic
    }

    @PostMapping("/updateEndDateOfCart")
    public  void updateEndDateOfCart() {
        // logic
    }

    @PostMapping("/getEndDateOfCart")
    public void getEndDateOfCart() {
        // logic
    }
}
