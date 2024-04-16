package com.arun.designpattern.bridge;

public class TextMessage extends Message{

    public TextMessage(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    void sendMessage() {
        System.out.println("Sending text message");
        this.notificationSender.sendNotification();
    }
}
