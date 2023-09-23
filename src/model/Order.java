package model;

import java.time.LocalDateTime;

public class Order {
    private long orderId;
    private String PizzaName;
    private String sauce;
    private double price;
    private LocalDateTime startTime;
    private LocalDateTime deliveryTime;
    private boolean deliveryStatus;
    private Customer customer;
    private Courier courier;
}
