package com.tech.magalutech.controller.dto;

import java.time.LocalDateTime;

import com.tech.magalutech.entity.Channel;
import com.tech.magalutech.entity.Notification;
import com.tech.magalutech.entity.Status;

public record ScheduleNotificationDto(LocalDateTime dateTime,
        String destination,
        String message,
        Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus());
    }
}
