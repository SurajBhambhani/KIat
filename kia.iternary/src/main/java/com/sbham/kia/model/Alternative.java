
package com.sbham.kia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Alternative {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("firstSegment")
    @Expose
    private Integer firstSegment;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("lastSegment")
    @Expose
    private Integer lastSegment;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("route")
    @Expose
    private Route route;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Alternative() {
    }

    /**
     * 
     * @param route
     * @param firstSegment
     * @param lastSegment
     */
    public Alternative(Integer firstSegment, Integer lastSegment, Route route) {
        this.firstSegment = firstSegment;
        this.lastSegment = lastSegment;
        this.route = route;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The firstSegment
     */
    public Integer getFirstSegment() {
        return firstSegment;
    }

    /**
     * 
     * (Required)
     * 
     * @param firstSegment
     *     The firstSegment
     */
    public void setFirstSegment(Integer firstSegment) {
        this.firstSegment = firstSegment;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The lastSegment
     */
    public Integer getLastSegment() {
        return lastSegment;
    }

    /**
     * 
     * (Required)
     * 
     * @param lastSegment
     *     The lastSegment
     */
    public void setLastSegment(Integer lastSegment) {
        this.lastSegment = lastSegment;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The route
     */
    public Route getRoute() {
        return route;
    }

    /**
     * 
     * (Required)
     * 
     * @param route
     *     The route
     */
    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(firstSegment).append(lastSegment).append(route).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Alternative) == false) {
            return false;
        }
        Alternative rhs = ((Alternative) other);
        return new EqualsBuilder().append(firstSegment, rhs.firstSegment).append(lastSegment, rhs.lastSegment).append(route, rhs.route).isEquals();
    }

}
