package com.arun.designpattern.bridge;

public abstract class Message {

    protected NotificationSender notificationSender;

    public Message(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    abstract void sendMessage();
}
