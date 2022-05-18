package com.walmart.shared_cart.service;

import com.walmart.shared_cart.dao.ItemsRepo;
import com.walmart.shared_cart.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class ItemService {

    @Autowired
    ItemsRepo itemsRepo;

    public Collection<Item> getAllItems() {return itemsRepo.getAllItems();}

    public Item getItemById(int id) {return itemsRepo.getItemById(id);}

    public Item addItem(Item item) {return itemsRepo.addItem(item);}

    public Item deleteItem(int id) {
        Item item = null;
        try {
          item = itemsRepo.deleteItem(id);
        } catch (Exception e) {
            System.out.println("Failed to delete item" +e);
        }
        return item;
    }
}
