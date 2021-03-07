package com.udacity.jwdnd.c1.review;

public class ChatMessage {
    public String userName;
    public String message;

    public ChatMessage(String userName, String message) {
        this.message = message;
        this.userName = userName;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String message) {
        this.userName = userName;
    }

}
