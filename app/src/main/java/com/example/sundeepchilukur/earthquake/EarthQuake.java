package com.example.sundeepchilukur.earthquake;

/**
 * Created by Sundeep.Chilukur on 2/24/2017.
 */
public class EarthQuake {

    private double magnitude;
    private String location;
    long timeInMilliSec;

    public EarthQuake(double magnitude, String location, long timeInMilliSec) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliSec = timeInMilliSec;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliSec() {
        return timeInMilliSec;
    }
}
