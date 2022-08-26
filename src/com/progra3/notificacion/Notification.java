package com.progra3.notificacion;

import java.time.ZonedDateTime;

public class Notification {
    private String message;
    private ZonedDateTime timestamp;

    public Notification(String message, ZonedDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public Notification() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public static void main(String[] args) {

        printMessage("hola como estas");
        printMessage("Estoy bien");
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

}
