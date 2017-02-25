package com.example.sundeepchilukur.earthquake;

/**
 * Created by Sundeep.Chilukur on 2/24/2017.
 */
public class EarthQuake {

    private double magnitude;
    private String location;
    private long timeInMilliSec;
    private String url;

    public EarthQuake(double magnitude, String location, long timeInMilliSec, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliSec = timeInMilliSec;
        this.url = url;
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

    public String getUrl() {
        return url;
    }
}
