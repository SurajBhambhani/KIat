
package com.sbham.kia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Icon {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("url")
    @Expose
    private String url;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("x")
    @Expose
    private Integer x;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("y")
    @Expose
    private Integer y;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("w")
    @Expose
    private Integer w;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("h")
    @Expose
    private Integer h;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Icon() {
    }

    /**
     * 
     * @param w
     * @param h
     * @param y
     * @param url
     * @param x
     */
    public Icon(String url, Integer x, Integer y, Integer w, Integer h) {
        this.url = url;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The x
     */
    public Integer getX() {
        return x;
    }

    /**
     * 
     * (Required)
     * 
     * @param x
     *     The x
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The y
     */
    public Integer getY() {
        return y;
    }

    /**
     * 
     * (Required)
     * 
     * @param y
     *     The y
     */
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The w
     */
    public Integer getW() {
        return w;
    }

    /**
     * 
     * (Required)
     * 
     * @param w
     *     The w
     */
    public void setW(Integer w) {
        this.w = w;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The h
     */
    public Integer getH() {
        return h;
    }

    /**
     * 
     * (Required)
     * 
     * @param h
     *     The h
     */
    public void setH(Integer h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(url).append(x).append(y).append(w).append(h).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Icon) == false) {
            return false;
        }
        Icon rhs = ((Icon) other);
        return new EqualsBuilder().append(url, rhs.url).append(x, rhs.x).append(y, rhs.y).append(w, rhs.w).append(h, rhs.h).isEquals();
    }

}
