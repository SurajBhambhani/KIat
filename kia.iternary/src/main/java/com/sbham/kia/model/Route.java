
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
public class Route {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
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
    @SerializedName("distance")
    @Expose
    private Double distance;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("totalDuration")
    @Expose
    private Integer totalDuration;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("totalTransitDuration")
    @Expose
    private Integer totalTransitDuration;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("totalTransferDuration")
    @Expose
    private Integer totalTransferDuration;
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
    @SerializedName("segments")
    @Expose
    private List<Segment> segments = new ArrayList<Segment>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("alternatives")
    @Expose
    private List<Alternative> alternatives = new ArrayList<Alternative>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Route() {
    }

    /**
     * 
     * @param totalTransitDuration
     * @param distance
     * @param totalDuration
     * @param arrPlace
     * @param segments
     * @param totalTransferDuration
     * @param depPlace
     * @param alternatives
     * @param name
     * @param indicativePrices
     */
    public Route(String name, Integer depPlace, Integer arrPlace, Double distance, Integer totalDuration, Integer totalTransitDuration, Integer totalTransferDuration, List<IndicativePrice> indicativePrices, List<Segment> segments, List<Alternative> alternatives) {
        this.name = name;
        this.depPlace = depPlace;
        this.arrPlace = arrPlace;
        this.distance = distance;
        this.totalDuration = totalDuration;
        this.totalTransitDuration = totalTransitDuration;
        this.totalTransferDuration = totalTransferDuration;
        this.indicativePrices = indicativePrices;
        this.segments = segments;
        this.alternatives = alternatives;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The depPlace
     */
    public Integer getDepPlace() {
        return depPlace;
    }

    /**
     * 
     * (Required)
     * 
     * @param depPlace
     *     The depPlace
     */
    public void setDepPlace(Integer depPlace) {
        this.depPlace = depPlace;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The arrPlace
     */
    public Integer getArrPlace() {
        return arrPlace;
    }

    /**
     * 
     * (Required)
     * 
     * @param arrPlace
     *     The arrPlace
     */
    public void setArrPlace(Integer arrPlace) {
        this.arrPlace = arrPlace;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The distance
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * 
     * (Required)
     * 
     * @param distance
     *     The distance
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The totalDuration
     */
    public Integer getTotalDuration() {
        return totalDuration;
    }

    /**
     * 
     * (Required)
     * 
     * @param totalDuration
     *     The totalDuration
     */
    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The totalTransitDuration
     */
    public Integer getTotalTransitDuration() {
        return totalTransitDuration;
    }

    /**
     * 
     * (Required)
     * 
     * @param totalTransitDuration
     *     The totalTransitDuration
     */
    public void setTotalTransitDuration(Integer totalTransitDuration) {
        this.totalTransitDuration = totalTransitDuration;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The totalTransferDuration
     */
    public Integer getTotalTransferDuration() {
        return totalTransferDuration;
    }

    /**
     * 
     * (Required)
     * 
     * @param totalTransferDuration
     *     The totalTransferDuration
     */
    public void setTotalTransferDuration(Integer totalTransferDuration) {
        this.totalTransferDuration = totalTransferDuration;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The indicativePrices
     */
    public List<IndicativePrice> getIndicativePrices() {
        return indicativePrices;
    }

    /**
     * 
     * (Required)
     * 
     * @param indicativePrices
     *     The indicativePrices
     */
    public void setIndicativePrices(List<IndicativePrice> indicativePrices) {
        this.indicativePrices = indicativePrices;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The segments
     */
    public List<Segment> getSegments() {
        return segments;
    }

    /**
     * 
     * (Required)
     * 
     * @param segments
     *     The segments
     */
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The alternatives
     */
    public List<Alternative> getAlternatives() {
        return alternatives;
    }

    /**
     * 
     * (Required)
     * 
     * @param alternatives
     *     The alternatives
     */
    public void setAlternatives(List<Alternative> alternatives) {
        this.alternatives = alternatives;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(depPlace).append(arrPlace).append(distance).append(totalDuration).append(totalTransitDuration).append(totalTransferDuration).append(indicativePrices).append(segments).append(alternatives).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Route) == false) {
            return false;
        }
        Route rhs = ((Route) other);
        return new EqualsBuilder().append(name, rhs.name).append(depPlace, rhs.depPlace).append(arrPlace, rhs.arrPlace).append(distance, rhs.distance).append(totalDuration, rhs.totalDuration).append(totalTransitDuration, rhs.totalTransitDuration).append(totalTransferDuration, rhs.totalTransferDuration).append(indicativePrices, rhs.indicativePrices).append(segments, rhs.segments).append(alternatives, rhs.alternatives).isEquals();
    }

}
