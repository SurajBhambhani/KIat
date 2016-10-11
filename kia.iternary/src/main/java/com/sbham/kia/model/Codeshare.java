package com.sbham.kia.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Codeshare {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("airline")
    @Expose
    private Integer airline;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("flight")
    @Expose
    private String flight;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Codeshare() {
    }

    /**
     * 
     * @param flight
     * @param airline
     */
    public Codeshare(Integer airline, String flight) {
        this.airline = airline;
        this.flight = flight;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The airline
     */
    public Integer getAirline() {
        return airline;
    }

    /**
     * 
     * (Required)
     * 
     * @param airline
     *     The airline
     */
    public void setAirline(Integer airline) {
        this.airline = airline;
    }

    public Codeshare withAirline(Integer airline) {
        this.airline = airline;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The flight
     */
    public String getFlight() {
        return flight;
    }

    /**
     * 
     * (Required)
     * 
     * @param flight
     *     The flight
     */
    public void setFlight(String flight) {
        this.flight = flight;
    }

    public Codeshare withFlight(String flight) {
        this.flight = flight;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(airline).append(flight).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Codeshare) == false) {
            return false;
        }
        Codeshare rhs = ((Codeshare) other);
        return new EqualsBuilder().append(airline, rhs.airline).append(flight, rhs.flight).isEquals();
    }

}
