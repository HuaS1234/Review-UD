package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {
    private String message = "start";

    // message is a string from bean
    public MessageService(String message) {
        System.out.println("Creating MessageService");
        System.out.println(message + "/Created");
        this.message = message;
    }

    public String uppercase() {
        System.out.println("Creating upper case");
        return this.message.toUpperCase();
    }

    public String lowercase() {
        System.out.println("Creating lower case");
        return this.message.toLowerCase();
    }
}
