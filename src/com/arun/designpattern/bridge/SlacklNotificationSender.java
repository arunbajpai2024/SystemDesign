package com.arun.designpattern.bridge;

public class SlacklNotificationSender implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Sending slack notification");
    }
}
