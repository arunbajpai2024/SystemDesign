package com.arun.designpattern.bridge;

public class TestBridgePattern {

    public static void main(String[] args) {
        NotificationSender notificationSender = new EmailNotificationSender();
        Message textMessage = new TextMessage(notificationSender);
        textMessage.sendMessage();
    }
}
