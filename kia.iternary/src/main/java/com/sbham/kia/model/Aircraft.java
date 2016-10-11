
package com.sbham.kia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Aircraft {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("code")
    @Expose
    private String code;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("manufacturer")
    @Expose
    private String manufacturer;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("model")
    @Expose
    private String model;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Aircraft() {
    }

    /**
     * 
     * @param model
     * @param manufacturer
     * @param code
     */
    public Aircraft(String code, String manufacturer, String model) {
        this.code = code;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * (Required)
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 
     * (Required)
     * 
     * @param manufacturer
     *     The manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The model
     */
    public String getModel() {
        return model;
    }

    /**
     * 
     * (Required)
     * 
     * @param model
     *     The model
     */
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(manufacturer).append(model).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Aircraft) == false) {
            return false;
        }
        Aircraft rhs = ((Aircraft) other);
        return new EqualsBuilder().append(code, rhs.code).append(manufacturer, rhs.manufacturer).append(model, rhs.model).isEquals();
    }

}
