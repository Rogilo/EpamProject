package com.epam.cably.model.entity;

import java.io.Serializable;
import java.util.Objects;

public class Location extends Entity implements Serializable {

    private String city;

    private int district;

    public Location(int id, String city, int district) {
        super(id);
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Location location = (Location) o;
        return district == location.district && Objects.equals(city, location.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), city, district);
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", district=" + district +
                '}';
    }
}
