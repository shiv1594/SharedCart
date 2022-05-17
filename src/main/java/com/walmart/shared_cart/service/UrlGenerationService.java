package com.walmart.shared_cart.service;

import com.walmart.shared_cart.dao.SharedCartRepository;
import com.walmart.shared_cart.model.SharedCart;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class UrlGenerationService {

    @Autowired
    SharedCartRepository sharedCartRepository;
    Random rand = new Random();

    private static String uniqueUrl = "http://walmart.sharedCart.";
    private static final int ID_LENGTH = 6;
    private final int id = rand.nextInt(99) & Integer.MAX_VALUE;

    public String generateUniqueUrl() {
        String uniqueId = String.format("%s-%s",
                RandomStringUtils.randomAlphanumeric(ID_LENGTH),
                UUID.randomUUID().toString().replace("-", "")
        );
        uniqueUrl = uniqueUrl.concat(uniqueId);
        SharedCart sharedCart = new SharedCart(id);
        sharedCartRepository.addSharedCartDetails(uniqueUrl, sharedCart);
        return uniqueUrl;
    }

    public SharedCart getSharedCart(String url) {
        return sharedCartRepository.getSharedCartDetails(url);
    }
}
