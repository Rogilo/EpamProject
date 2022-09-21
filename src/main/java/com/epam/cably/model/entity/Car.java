package com.epam.cably.model.entity;

import com.epam.cably.model.enums.CarStatus;

import java.io.Serializable;
import java.util.Objects;

public class Car extends Entity implements Serializable {

    private int driverID;

    private CarStatus status;

    private String type;

    private int capacity;

    private int currentLocation;

    public Car(int id, int driverID, CarStatus status, String type, int capacity, int currentLocation) {
        super(id);
        this.driverID = driverID;
        this.status = status;
        this.type = type;
        this.capacity = capacity;
        this.currentLocation = currentLocation;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return driverID == car.driverID && capacity == car.capacity && currentLocation == car.currentLocation &&
                status == car.status && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), driverID, status, type, capacity, currentLocation);
    }

    @Override
    public String toString() {
        return "Car{" +
                "driverID=" + driverID +
                ", status=" + status +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", currentLocation=" + currentLocation +
                '}';
    }
}