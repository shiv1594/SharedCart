package com.walmart.shared_cart.repository;

import com.walmart.shared_cart.model.SharedCart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SharedCartRepository {
    Map<String, SharedCart> sharedCartMap = new HashMap<>();

    public void addSharedCartDetails(String url, SharedCart sharedCart) {
        sharedCartMap.put(url,sharedCart);
    }

    public SharedCart getSharedCartDetails(String url) {
        return sharedCartMap.get(url);
    }
}
