package com.sbham.kia.model;

public class LocationTO
{
    private String firstLocation;
    private String secondLocation;

    public String getFirstLocation()
    {
        return firstLocation;
    }

    public LocationTO setFirstLocation(String firstLocation)
    {
        this.firstLocation = firstLocation;
        return this;
    }

    public String getSecondLocation()
    {
        return secondLocation;
    }

    public LocationTO setSecondLocation(String secondLocation)
    {
        this.secondLocation = secondLocation;
        return this;
    }

    @Override public String toString()
    {
        return "LocationTO{" +
                "firstLocation='" + firstLocation + '\'' +
                ", secondLocation='" + secondLocation + '\'' +
                '}';
    }
}
