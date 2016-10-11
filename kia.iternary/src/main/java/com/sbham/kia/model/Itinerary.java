
package com.sbham.kia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Itinerary
{

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("languageCode")
    @Expose
    private String languageCode;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("elapsedTime")
    @Expose
    private Integer elapsedTime;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("places")
    @Expose
    private List<Place> places = new ArrayList<Place>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("airlines")
    @Expose
    private List<Airline> airlines = new ArrayList<Airline>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("aircrafts")
    @Expose
    private List<Aircraft> aircrafts = new ArrayList<Aircraft>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("agencies")
    @Expose
    private List<Agency> agencies = new ArrayList<Agency>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("vehicles")
    @Expose
    private List<Vehicle> vehicles = new ArrayList<Vehicle>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("routes")
    @Expose
    private List<Route> routes = new ArrayList<Route>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Itinerary() {
    }

    /**
     * 
     * @param languageCode
     * @param currencyCode
     * @param routes
     * @param airlines
     * @param agencies
     * @param vehicles
     * @param places
     * @param aircrafts
     * @param elapsedTime
     */
    public Itinerary(String languageCode, String currencyCode, Integer elapsedTime, List<Place> places, List<Airline> airlines, List<Aircraft> aircrafts, List<Agency> agencies, List<Vehicle> vehicles, List<Route> routes) {
        this.languageCode = languageCode;
        this.currencyCode = currencyCode;
        this.elapsedTime = elapsedTime;
        this.places = places;
        this.airlines = airlines;
        this.aircrafts = aircrafts;
        this.agencies = agencies;
        this.vehicles = vehicles;
        this.routes = routes;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The languageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param languageCode
     *     The languageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param currencyCode
     *     The currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The elapsedTime
     */
    public Integer getElapsedTime() {
        return elapsedTime;
    }

    /**
     * 
     * (Required)
     * 
     * @param elapsedTime
     *     The elapsedTime
     */
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The places
     */
    public List<Place> getPlaces() {
        return places;
    }

    /**
     * 
     * (Required)
     * 
     * @param places
     *     The places
     */
    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The airlines
     */
    public List<Airline> getAirlines() {
        return airlines;
    }

    /**
     * 
     * (Required)
     * 
     * @param airlines
     *     The airlines
     */
    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The aircrafts
     */
    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    /**
     * 
     * (Required)
     * 
     * @param aircrafts
     *     The aircrafts
     */
    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The agencies
     */
    public List<Agency> getAgencies() {
        return agencies;
    }

    /**
     * 
     * (Required)
     * 
     * @param agencies
     *     The agencies
     */
    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The vehicles
     */
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     * 
     * (Required)
     * 
     * @param vehicles
     *     The vehicles
     */
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The routes
     */
    public List<Route> getRoutes() {
        return routes;
    }

    /**
     * 
     * (Required)
     * 
     * @param routes
     *     The routes
     */
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(languageCode).append(currencyCode).append(elapsedTime).append(places).append(airlines).append(aircrafts).append(agencies).append(vehicles).append(routes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Itinerary) == false) {
            return false;
        }
        Itinerary rhs = ((Itinerary) other);
        return new EqualsBuilder().append(languageCode, rhs.languageCode).append(currencyCode, rhs.currencyCode).append(elapsedTime, rhs.elapsedTime).append(places, rhs.places).append(airlines, rhs.airlines).append(aircrafts, rhs.aircrafts).append(agencies, rhs.agencies).append(vehicles, rhs.vehicles).append(routes, rhs.routes).isEquals();
    }

}
