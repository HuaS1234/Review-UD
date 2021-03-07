package com.udacity.jwdnd.c1.review;

import org.springframework.security.access.method.P;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class MessageService {
    private String message = "start";
    private List<ChatMessage> chatHistory;

    @PostConstruct
    public void postConstruct() {
        this.chatHistory = new ArrayList<>();
    }

    public void addMessage(ChatForm chatForm) {
        ChatMessage chatMessage = new ChatMessage(chatForm.getUserName(), chatForm.getMessageText());
        switch (chatForm.getMessageType()) {
            case "Say":
                chatMessage.setMessage(chatForm.getMessageText());
                break;
            case "Shout":
                chatMessage.setMessage(chatForm.getMessageText().toUpperCase());
                break;
            case "Whisper":
                chatMessage.setMessage(chatForm.getMessageText().toLowerCase());
                break;
        }
        this.chatHistory.add(chatMessage);
    }

    public List<ChatMessage> getMessage() {
        return chatHistory;
    }

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
