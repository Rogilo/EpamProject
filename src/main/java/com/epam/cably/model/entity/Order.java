package com.epam.cably.model.entity;

import com.epam.cably.model.enums.OrderStatus;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Order extends Entity implements Serializable {

    private int userId;

    private int carId;

    private int startLocation;

    private int destinationLocation;

    private double Price;

    private OrderStatus status;

    private Date date;

    public Order(int id, int userId, int carId, int startLocation, int destinationLocation, double price, OrderStatus status, Date date) {
        super(id);
        this.userId = userId;
        this.carId = carId;
        this.startLocation = startLocation;
        this.destinationLocation = destinationLocation;
        Price = price;
        this.status = status;
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(int startLocation) {
        this.startLocation = startLocation;
    }

    public int getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(int destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Order order = (Order) o;
        return userId == order.userId && carId == order.carId && startLocation == order.startLocation &&
                destinationLocation == order.destinationLocation && Double.compare(order.Price, Price) == 0 &&
                status == order.status && Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userId, carId, startLocation, destinationLocation, Price, status, date);
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", carId=" + carId +
                ", startLocation=" + startLocation +
                ", destinationLocation=" + destinationLocation +
                ", Price=" + Price +
                ", status=" + status +
                ", date=" + date +
                '}';
    }
}
