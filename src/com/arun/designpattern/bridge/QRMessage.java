package com.arun.designpattern.bridge;

public class QRMessage extends Message{

    public QRMessage(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    void sendMessage() {
        System.out.println("Sending QR message");
        this.notificationSender.sendNotification();
    }
}
