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
public class Segment
{

    /**
     *
     * (Required)
     *
     */
    @SerializedName("segmentKind")
    @Expose
    private String segmentKind;
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
    @SerializedName("vehicle")
    @Expose
    private Integer vehicle;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("distance")
    @Expose
    private Double distance;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("transitDuration")
    @Expose
    private Integer transitDuration;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("transferDuration")
    @Expose
    private Integer transferDuration;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("path")
    @Expose
    private String path;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("indicativePrices")
    @Expose
    private List<IndicativePrice> indicativePrices = new ArrayList<IndicativePrice>();
    /**
     *
     * (Required)
     *
     */
    @SerializedName("stops")
    @Expose
    private List<Stop> stops = new ArrayList<Stop>();
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
    @SerializedName("outbound")
    @Expose
    private List<Outbound> outbound = new ArrayList<Outbound>();
    /**
     *
     * (Required)
     *
     */
    @SerializedName("return")
    @Expose
    private List<Return> returnSegment = new ArrayList<Return>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Segment()
    {
    }

    /**
     *
     * @param stops
     * @param distance
     * @param arrPlace
     * @param transferDuration
     * @param depPlace
     * @param transitDuration
     * @param vehicle
     * @param path
     * @param agencies
     * @param indicativePrices
     * @param segmentKind
     * @param return
     * @param outbound
     */
    public Segment(String segmentKind, Integer depPlace, Integer arrPlace, Integer vehicle, Double distance, Integer transitDuration, Integer transferDuration, String path, List<IndicativePrice> indicativePrices, List<Stop> stops, List<Agency> agencies,List<Return> returnSegment , List<Outbound> outbound)
    {
        this.segmentKind = segmentKind;
        this.depPlace = depPlace;
        this.arrPlace = arrPlace;
        this.vehicle = vehicle;
        this.distance = distance;
        this.transitDuration = transitDuration;
        this.transferDuration = transferDuration;
        this.path = path;
        this.indicativePrices = indicativePrices;
        this.stops = stops;
        this.agencies = agencies;
        this.returnSegment = returnSegment;
        this.outbound = outbound;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The segmentKind
     */
    public String getSegmentKind()
    {
        return segmentKind;
    }

    /**
     *
     * (Required)
     *
     * @param segmentKind
     *     The segmentKind
     */
    public void setSegmentKind(String segmentKind)
    {
        this.segmentKind = segmentKind;
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

    /**
     *
     * (Required)
     *
     * @return
     *     The vehicle
     */
    public Integer getVehicle()
    {
        return vehicle;
    }

    /**
     *
     * (Required)
     *
     * @param vehicle
     *     The vehicle
     */
    public void setVehicle(Integer vehicle)
    {
        this.vehicle = vehicle;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The distance
     */
    public Double getDistance()
    {
        return distance;
    }

    /**
     *
     * (Required)
     *
     * @param distance
     *     The distance
     */
    public void setDistance(Double distance)
    {
        this.distance = distance;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The transitDuration
     */
    public Integer getTransitDuration()
    {
        return transitDuration;
    }

    /**
     *
     * (Required)
     *
     * @param transitDuration
     *     The transitDuration
     */
    public void setTransitDuration(Integer transitDuration)
    {
        this.transitDuration = transitDuration;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The transferDuration
     */
    public Integer getTransferDuration()
    {
        return transferDuration;
    }

    /**
     *
     * (Required)
     *
     * @param transferDuration
     *     The transferDuration
     */
    public void setTransferDuration(Integer transferDuration)
    {
        this.transferDuration = transferDuration;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The path
     */
    public String getPath()
    {
        return path;
    }

    /**
     *
     * (Required)
     *
     * @param path
     *     The path
     */
    public void setPath(String path)
    {
        this.path = path;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The indicativePrices
     */
    public List<IndicativePrice> getIndicativePrices()
    {
        return indicativePrices;
    }

    /**
     *
     * (Required)
     *
     * @param indicativePrices
     *     The indicativePrices
     */
    public void setIndicativePrices(List<IndicativePrice> indicativePrices)
    {
        this.indicativePrices = indicativePrices;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The stops
     */
    public List<Stop> getStops()
    {
        return stops;
    }

    /**
     *
     * (Required)
     *
     * @param stops
     *     The stops
     */
    public void setStops(List<Stop> stops)
    {
        this.stops = stops;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The agencies
     */
    public List<Agency> getAgencies()
    {
        return agencies;
    }

    /**
     *
     * (Required)
     *
     * @param agencies
     *     The agencies
     */
    public void setAgencies(List<Agency> agencies)
    {
        this.agencies = agencies;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The outbound
     */
    public List<Outbound> getOutbound()
    {
        return outbound;
    }

    /**
     *
     * (Required)
     *
     * @param outbound
     *     The outbound
     */
    public void setOutbound(List<Outbound> outbound)
    {
        this.outbound = outbound;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The returnSegment
     */
    public List<Return> getReturnSegment()
    {
        return returnSegment;
    }

    /**
     *
     * (Required)
     *
     * @param _return
     *     The return
     */
    public void setReturnSegment(List<Return> returnSegment)
    {
        this.returnSegment = returnSegment;
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(segmentKind).append(depPlace).append(arrPlace).append(vehicle).append(distance).append(transitDuration).append(transferDuration).append(path).append(indicativePrices).append(stops).append(agencies).append(outbound).append(returnSegment).toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Segment) == false)
        {
            return false;
        }
        Segment rhs = ((Segment) other);
        return new EqualsBuilder().append(segmentKind, rhs.segmentKind)
                .append(depPlace, rhs.depPlace)
                .append(arrPlace, rhs.arrPlace)
                .append(vehicle, rhs.vehicle)
                .append(distance, rhs.distance)
                .append(transitDuration, rhs.transitDuration)
                .append(transferDuration, rhs.transferDuration)
                .append(path, rhs.path)
                .append(indicativePrices, rhs.indicativePrices)
                .append(stops, rhs.stops)
                .append(agencies, rhs.agencies)
                .append(outbound, rhs.outbound)
                .append(returnSegment, rhs.returnSegment)
                .isEquals();
    }

}
