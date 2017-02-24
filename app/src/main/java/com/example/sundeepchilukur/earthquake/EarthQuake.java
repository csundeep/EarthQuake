package com.example.sundeepchilukur.earthquake;

/**
 * Created by Sundeep.Chilukur on 2/24/2017.
 */
public class EarthQuake {

    private String magnitude;
    private String location;
    private String date;

    public EarthQuake(String magnitude, String location, String date) {
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }
}
