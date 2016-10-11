package com.sbham.kia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.tomcat.util.buf.StringCache;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Place
{

    /**
     *
     * (Required)
     *
     */
    @SerializedName("lat")
    @Expose
    private Double lat;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("lng")
    @Expose
    private Double lng;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("kind")
    @Expose
    private String kind;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("shortName")
    @Expose
    private String shortName;

    /**
     *
     * (Required)
     *
     */
    @SerializedName("longName")
    @Expose
    private String longName;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("canonicalName")
    @Expose
    private String canonicalName;
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
    @SerializedName("regionCode")
    @Expose
    private String regionCode;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("timeZone")
    @Expose
    private String timeZone;

    /**
     * No args constructor for use in serialization
     *
     */
    public Place()
    {
    }

    /**
     *
     * @param regionCode
     * @param countryCode
     * @param timeZone
     * @param lng
     * @param shortName
     * @param kind
     * @param lat
     */
    public Place(Double lat, Double lng, String kind, String shortName, String regionCode, String countryCode, String timeZone, String longName, String canonicalName, String code)
    {
        this.lat = lat;
        this.lng = lng;
        this.kind = kind;
        this.shortName = shortName;
        this.regionCode = regionCode;
        this.countryCode = countryCode;
        this.timeZone = timeZone;
        this.canonicalName = canonicalName;
        this.longName = longName;
        this.code = code;
    }

    public String getLongName()
    {
        return longName;
    }

    public Place setLongName(String longName)
    {
        this.longName = longName;
        return this;
    }

    public String getCanonicalName()
    {
        return canonicalName;
    }

    public Place setCanonicalName(String canonicalName)
    {
        this.canonicalName = canonicalName;
        return this;
    }

    public String getCode()
    {
        return code;
    }

    public Place setCode(String code)
    {
        this.code = code;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The lat
     */
    public Double getLat()
    {
        return lat;
    }

    /**
     *
     * (Required)
     *
     * @param lat
     *     The lat
     */
    public void setLat(Double lat)
    {
        this.lat = lat;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The lng
     */
    public Double getLng()
    {
        return lng;
    }

    /**
     *
     * (Required)
     *
     * @param lng
     *     The lng
     */
    public void setLng(Double lng)
    {
        this.lng = lng;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The kind
     */
    public String getKind()
    {
        return kind;
    }

    /**
     *
     * (Required)
     *
     * @param kind
     *     The kind
     */
    public void setKind(String kind)
    {
        this.kind = kind;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The shortName
     */
    public String getShortName()
    {
        return shortName;
    }

    /**
     *
     * (Required)
     *
     * @param shortName
     *     The shortName
     */
    public void setShortName(String shortName)
    {
        this.shortName = shortName;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The regionCode
     */
    public String getRegionCode()
    {
        return regionCode;
    }

    /**
     *
     * (Required)
     *
     * @param regionCode
     *     The regionCode
     */
    public void setRegionCode(String regionCode)
    {
        this.regionCode = regionCode;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The countryCode
     */
    public String getCountryCode()
    {
        return countryCode;
    }

    /**
     *
     * (Required)
     *
     * @param countryCode
     *     The countryCode
     */
    public void setCountryCode(String countryCode)
    {
        this.countryCode = countryCode;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The timeZone
     */
    public String getTimeZone()
    {
        return timeZone;
    }

    /**
     *
     * (Required)
     *
     * @param timeZone
     *     The timeZone
     */
    public void setTimeZone(String timeZone)
    {
        this.timeZone = timeZone;
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(lat).append(lng).append(kind).append(shortName).append(regionCode).append(countryCode).append(timeZone).append(longName).append(canonicalName).append(code).toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Place) == false)
        {
            return false;
        }
        Place rhs = ((Place) other);
        return new EqualsBuilder().append(lat, rhs.lat).append(lng, rhs.lng).append(kind, rhs.kind).append(shortName, rhs.shortName).append(regionCode, rhs.regionCode).append(countryCode, rhs.countryCode).append(timeZone, rhs.timeZone).append(longName, rhs.longName).append(canonicalName, rhs.canonicalName).append(code, rhs.code).isEquals();
    }

}
