package com.walmart.shared_cart.dao;

import com.walmart.shared_cart.models.Item;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemsRepo {

    Map<String, Item> itemMap = new HashMap<>();

    @PostConstruct
    public void postConstruct() {

    }
}
