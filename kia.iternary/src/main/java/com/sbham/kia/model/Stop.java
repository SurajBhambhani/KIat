
package com.sbham.kia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Stop {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("place")
    @Expose
    private Integer place;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("transitDuration")
    @Expose
    private Integer transitDuration;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stop() {
    }

    /**
     * 
     * @param transitDuration
     * @param place
     */
    public Stop(Integer place, Integer transitDuration) {
        this.place = place;
        this.transitDuration = transitDuration;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The place
     */
    public Integer getPlace() {
        return place;
    }

    /**
     * 
     * (Required)
     * 
     * @param place
     *     The place
     */
    public void setPlace(Integer place) {
        this.place = place;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The transitDuration
     */
    public Integer getTransitDuration() {
        return transitDuration;
    }

    /**
     * 
     * (Required)
     * 
     * @param transitDuration
     *     The transitDuration
     */
    public void setTransitDuration(Integer transitDuration) {
        this.transitDuration = transitDuration;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(place).append(transitDuration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stop) == false) {
            return false;
        }
        Stop rhs = ((Stop) other);
        return new EqualsBuilder().append(place, rhs.place).append(transitDuration, rhs.transitDuration).isEquals();
    }

}
