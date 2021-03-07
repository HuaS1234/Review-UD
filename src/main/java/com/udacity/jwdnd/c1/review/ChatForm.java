package com.udacity.jwdnd.c1.review;

public class ChatForm {
    private String userName = "name";
    private String messageText = "text";
    private String messageType = "type";

    public String getUserName() {
        return this.userName;
    }

    public String getMessageText() {
        return this.messageText;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setMessageText(String str) {
         this.messageText = str;
    }

    public void setMessageType(String str) {
         this.messageType = str;
    }



}
