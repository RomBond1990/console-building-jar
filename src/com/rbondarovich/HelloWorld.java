package com.rbondarovich;

import org.apache.commons.validator.routines.UrlValidator;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        String[] schemes = {"http", "https"};
        UrlValidator urlValidator = new UrlValidator(schemes);
        if (urlValidator.isValid("https://github.com/RomBond1990")) {
            System.out.println("Library is working");
        }
    }
}