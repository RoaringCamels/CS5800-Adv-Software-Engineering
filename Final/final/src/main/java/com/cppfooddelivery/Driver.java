package com.cppfooddelivery;

import java.time.LocalTime;

public class Driver{
    private String name;
    private String address;
    private String county;
    private String shift;

    public Driver(String name, String address, String county, String shift) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.shift = shift;
    }

    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getCounty() {return county;}
    public String getShift() {return shift;}

    public boolean isAvailable(LocalTime time, OperatingHours restaurantHours, Restaurant restaurant) {
        LocalTime shiftStart;
        LocalTime shiftEnd;

        switch (shift) {
            case "1st Shift":
                shiftStart = LocalTime.of(8, 0);
                shiftEnd = LocalTime.of(16, 0);
                break;
            case "2nd Shift":
                shiftStart = LocalTime.of(16, 0);
                shiftEnd = LocalTime.MIDNIGHT;
                break;
            case "3rd Shift":
                shiftStart = LocalTime.MIDNIGHT;
                shiftEnd = LocalTime.of(8, 0);
                break;
            default:
                return false;
        }

        if (shiftEnd.isAfter(shiftStart)) {
            return (!time.isBefore(shiftStart) && time.isBefore(shiftEnd)) && restaurant.getCounty().equals(this.county);
        } else {
            return (!time.isBefore(shiftStart) || time.isBefore(shiftEnd)) && restaurant.getCounty().equals(this.county);
        }
        
    }
    
    
}

