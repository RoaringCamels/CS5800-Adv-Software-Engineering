package com.cppfooddelivery;
import java.time.*;

public class OperatingHours {
    private LocalTime openTime;
    private LocalTime closeTime;

    public OperatingHours(LocalTime openTime, LocalTime closeTime){
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public LocalTime getOpenTime() {return openTime;}
    public LocalTime getCloseTime() {return closeTime;}

    public boolean isOpen(LocalTime currentTime){
        return currentTime.isAfter(openTime) && currentTime.isBefore(closeTime);
    }
}
