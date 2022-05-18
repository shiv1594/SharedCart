package com.walmart.shared_cart.controllers;

import com.walmart.shared_cart.models.Address;
import com.walmart.shared_cart.models.Item;
import com.walmart.shared_cart.models.SharedCart;
import com.walmart.shared_cart.models.User;
import com.walmart.shared_cart.service.ItemService;
import com.walmart.shared_cart.service.SharedCartService;
import com.walmart.shared_cart.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/sharedCart")
public class SharedCartController {

    @Autowired
    private SharedCartService sharedCartService;

    @Autowired
    private UserService userService;

    @Autowired
    private ItemService itemService;

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

    @PostMapping("/{userId}/{itemId}/create")
    public String createSharedCart(@PathVariable Long userId, @PathVariable int itemId) {
        User user = userService.getUser(userId);
        Item item = itemService.getItemById(itemId);
        if (user == null || item == null) {
            return "ERROR";
        }
        return sharedCartService.createSharedCart(user, item);
    }

    @PostMapping("/{cartUrl}/{userId}/add")
    public SharedCart addUserToCart(@PathVariable String cartUrl, @PathVariable Long userId) {
        User user = userService.getUser(userId);
        if (user == null) {
            return sharedCartService.getSharedCartDetails(cartUrl);
        }
        return sharedCartService.addUser(cartUrl, user);
    }

    @PostMapping("/{cartUrl}/add")
    public SharedCart addItemToCart(@PathVariable String cartUrl, @RequestParam int itemId) {
        Item item = itemService.getItemById(itemId);
        if (item == null) {
            return sharedCartService.getSharedCartDetails(cartUrl);
        }
        return sharedCartService.addItem(cartUrl, item);
    }

}
