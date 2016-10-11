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
public class Hop
{
    /**
     *
     * (Required)
     *
     */
    @SerializedName("dayChange")
    @Expose
    private Integer dayChange;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("depPlace")
    @Expose
    private Integer depPlace;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("arrPlace")
    @Expose
    private Integer arrPlace;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("depTerminal")
    @Expose
    private String depTerminal;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("arrTerminal")
    @Expose
    private String arrTerminal;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("depTime")
    @Expose
    private String depTime;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("arrTime")
    @Expose
    private String arrTime;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("flight")
    @Expose
    private String flight;
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
    @SerializedName("duration")
    @Expose
    private Integer duration;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("aircraft")
    @Expose
    private Integer aircraft;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("layoverDuration")
    @Expose
    private Integer layoverDuration;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("codeshares")
    @Expose
    private List<Codeshare> codeshares = new ArrayList<Codeshare>();
    /**
     *
     * (Required)
     *
     */
    @SerializedName("layoverDayChange")
    @Expose
    private Integer layoverDayChange;

    /**
     * No args constructor for use in serialization
     *
     */
    public Hop()
    {
    }

    /**
     *
     * @param depTime
     * @param flight
     * @param duration
     * @param layoverDuration
     * @param arrPlace
     * @param depTerminal
     * @param depPlace
     * @param layoverDayChange
     * @param arrTerminal
     * @param codeshares
     * @param aircraft
     * @param arrTime
     * @param airline
     */
    public Hop(Integer depPlace, Integer arrPlace, String depTerminal, String depTime, String arrTime, String flight, Integer airline, Integer duration, Integer aircraft, Integer layoverDuration, List<Codeshare> codeshares, Integer layoverDayChange, String arrTerminal, Integer dayChange)
    {
        this.depPlace = depPlace;
        this.arrPlace = arrPlace;
        this.depTerminal = depTerminal;
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.flight = flight;
        this.airline = airline;
        this.duration = duration;
        this.aircraft = aircraft;
        this.layoverDuration = layoverDuration;
        this.codeshares = codeshares;
        this.layoverDayChange = layoverDayChange;
        this.arrTerminal = arrTerminal;
        this.dayChange = dayChange;
    }

    public Integer getDayChange()
    {
        return dayChange;
    }

    public Hop setDayChange(Integer dayChange)
    {
        this.dayChange = dayChange;
        return this;
    }

    public String getArrTerminal()
    {
        return arrTerminal;
    }

    public Hop setArrTerminal(String arrTerminal)
    {
        this.arrTerminal = arrTerminal;
        return this;
    }

    public Integer getLayoverDayChange()
    {
        return layoverDayChange;
    }

    public Hop setLayoverDayChange(Integer layoverDayChange)
    {
        this.layoverDayChange = layoverDayChange;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The depPlace
     */
    public Integer getDepPlace()
    {
        return depPlace;
    }

    /**
     *
     * (Required)
     *
     * @param depPlace
     *     The depPlace
     */
    public void setDepPlace(Integer depPlace)
    {
        this.depPlace = depPlace;
    }

    public Hop withDepPlace(Integer depPlace)
    {
        this.depPlace = depPlace;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The arrPlace
     */
    public Integer getArrPlace()
    {
        return arrPlace;
    }

    /**
     *
     * (Required)
     *
     * @param arrPlace
     *     The arrPlace
     */
    public void setArrPlace(Integer arrPlace)
    {
        this.arrPlace = arrPlace;
    }

    public Hop withArrPlace(Integer arrPlace)
    {
        this.arrPlace = arrPlace;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The depTerminal
     */
    public String getDepTerminal()
    {
        return depTerminal;
    }

    /**
     *
     * (Required)
     *
     * @param depTerminal
     *     The depTerminal
     */
    public void setDepTerminal(String depTerminal)
    {
        this.depTerminal = depTerminal;
    }

    public Hop withDepTerminal(String depTerminal)
    {
        this.depTerminal = depTerminal;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The depTime
     */
    public String getDepTime()
    {
        return depTime;
    }

    /**
     *
     * (Required)
     *
     * @param depTime
     *     The depTime
     */
    public void setDepTime(String depTime)
    {
        this.depTime = depTime;
    }

    public Hop withDepTime(String depTime)
    {
        this.depTime = depTime;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The arrTime
     */
    public String getArrTime()
    {
        return arrTime;
    }

    /**
     *
     * (Required)
     *
     * @param arrTime
     *     The arrTime
     */
    public void setArrTime(String arrTime)
    {
        this.arrTime = arrTime;
    }

    public Hop withArrTime(String arrTime)
    {
        this.arrTime = arrTime;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The flight
     */
    public String getFlight()
    {
        return flight;
    }

    /**
     *
     * (Required)
     *
     * @param flight
     *     The flight
     */
    public void setFlight(String flight)
    {
        this.flight = flight;
    }

    public Hop withFlight(String flight)
    {
        this.flight = flight;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The airline
     */
    public Integer getAirline()
    {
        return airline;
    }

    /**
     *
     * (Required)
     *
     * @param airline
     *     The airline
     */
    public void setAirline(Integer airline)
    {
        this.airline = airline;
    }

    public Hop withAirline(Integer airline)
    {
        this.airline = airline;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The duration
     */
    public Integer getDuration()
    {
        return duration;
    }

    /**
     *
     * (Required)
     *
     * @param duration
     *     The duration
     */
    public void setDuration(Integer duration)
    {
        this.duration = duration;
    }

    public Hop withDuration(Integer duration)
    {
        this.duration = duration;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The aircraft
     */
    public Integer getAircraft()
    {
        return aircraft;
    }

    /**
     *
     * (Required)
     *
     * @param aircraft
     *     The aircraft
     */
    public void setAircraft(Integer aircraft)
    {
        this.aircraft = aircraft;
    }

    public Hop withAircraft(Integer aircraft)
    {
        this.aircraft = aircraft;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The layoverDuration
     */
    public Integer getLayoverDuration()
    {
        return layoverDuration;
    }

    /**
     *
     * (Required)
     *
     * @param layoverDuration
     *     The layoverDuration
     */
    public void setLayoverDuration(Integer layoverDuration)
    {
        this.layoverDuration = layoverDuration;
    }

    public Hop withLayoverDuration(Integer layoverDuration)
    {
        this.layoverDuration = layoverDuration;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The codeshares
     */
    public List<Codeshare> getCodeshares()
    {
        return codeshares;
    }

    /**
     *
     * (Required)
     *
     * @param codeshares
     *     The codeshares
     */
    public void setCodeshares(List<Codeshare> codeshares)
    {
        this.codeshares = codeshares;
    }

    public Hop withCodeshares(List<Codeshare> codeshares)
    {
        this.codeshares = codeshares;
        return this;
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(depPlace).append(arrPlace).append(depTerminal).append(depTime).append(arrTime).append(flight).append(airline).append(duration).append(aircraft).append(layoverDuration).append(codeshares).append(layoverDayChange).append(arrTerminal).append(dayChange).toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Hop) == false)
        {
            return false;
        }
        Hop rhs = ((Hop) other);
        return new EqualsBuilder().append(depPlace, rhs.depPlace)
                .append(arrPlace, rhs.arrPlace)
                .append(depTerminal, rhs.depTerminal)
                .append(depTime, rhs.depTime)
                .append(arrTime, rhs.arrTime)
                .append(flight, rhs.flight)
                .append(airline, rhs.airline)
                .append(duration, rhs.duration)
                .append(aircraft, rhs.aircraft)
                .append(layoverDuration, rhs.layoverDuration)
                .append(codeshares, rhs.codeshares)
                .append(layoverDayChange, rhs.layoverDayChange)
                .append(arrTerminal, rhs.arrTerminal)
                .append(dayChange, rhs.dayChange)
                .isEquals();
    }

}
