package com.arun.designpattern.bridge;

public class EmailNotificationSender implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Sending email notification");
    }
}
