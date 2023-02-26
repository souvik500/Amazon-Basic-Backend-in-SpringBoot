package com.driver;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.id = id;
        int hour = Integer.parseInt(deliveryTime.substring(0,2));
        int min = Integer.parseInt(deliveryTime.substring(3));
        int time = (hour*60)+min;
        this.deliveryTime = time;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }
}
