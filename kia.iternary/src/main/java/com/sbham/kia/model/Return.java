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
public class Return
{

    /**
     *
     * (Required)
     *
     */
    @SerializedName("operatingDays")
    @Expose
    private Integer operatingDays;
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
    @SerializedName("hops")
    @Expose
    private List<Hop> hops = new ArrayList<Hop>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Return()
    {
    }

    /**
     *
     * @param operatingDays
     * @param indicativePrices
     * @param hops
     */
    public Return(Integer operatingDays, List<IndicativePrice> indicativePrices, List<Hop> hops)
    {
        this.operatingDays = operatingDays;
        this.indicativePrices = indicativePrices;
        this.hops = hops;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The operatingDays
     */
    public Integer getOperatingDays()
    {
        return operatingDays;
    }

    /**
     *
     * (Required)
     *
     * @param operatingDays
     *     The operatingDays
     */
    public void setOperatingDays(Integer operatingDays)
    {
        this.operatingDays = operatingDays;
    }

    public Return withOperatingDays(Integer operatingDays)
    {
        this.operatingDays = operatingDays;
        return this;
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

    public Return withIndicativePrices(List<IndicativePrice> indicativePrices)
    {
        this.indicativePrices = indicativePrices;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The hops
     */
    public List<Hop> getHops()
    {
        return hops;
    }

    /**
     *
     * (Required)
     *
     * @param hops
     *     The hops
     */
    public void setHops(List<Hop> hops)
    {
        this.hops = hops;
    }

    public Return withHops(List<Hop> hops)
    {
        this.hops = hops;
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
        return new HashCodeBuilder().append(operatingDays).append(indicativePrices).append(hops).toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Return) == false)
        {
            return false;
        }
        Return rhs = ((Return) other);
        return new EqualsBuilder().append(operatingDays, rhs.operatingDays).append(indicativePrices, rhs.indicativePrices).append(hops, rhs.hops).isEquals();
    }

}
