package com.walmart.services;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class UrlGenerationService {

    private static String uniqueUrl = "http://walmart.sharedCart.";
    private static final int ID_LENGTH = 10;

    public String generateUniqueUrl() {
        String uniqueCode = RandomStringUtils.randomAlphanumeric(ID_LENGTH);
        uniqueUrl = uniqueUrl.concat(uniqueCode);
        return uniqueUrl;
    }
}
