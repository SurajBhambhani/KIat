
package com.sbham.kia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Vehicle {

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
    @SerializedName("kind")
    @Expose
    private String kind;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Vehicle() {
    }

    /**
     * 
     * @param name
     * @param kind
     */
    public Vehicle(String name, String kind) {
        this.name = name;
        this.kind = kind;
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
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * (Required)
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(kind).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Vehicle) == false) {
            return false;
        }
        Vehicle rhs = ((Vehicle) other);
        return new EqualsBuilder().append(name, rhs.name).append(kind, rhs.kind).isEquals();
    }

}
