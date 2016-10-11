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
public class Agency
{

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
    @SerializedName("url")
    @Expose
    private String url;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("phone")
    @Expose
    private String phone;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("agency")
    @Expose
    private Integer agency;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("frequency")
    @Expose
    private Integer frequency;
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
    @SerializedName("operatingDays")
    @Expose
    private Integer operatingDays;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("lineNames")
    @Expose
    private List<String> lineNames = new ArrayList<String>();
    /**
     *
     * (Required)
     *
     */
    @SerializedName("lineCodes")
    @Expose
    private List<String> lineCodes = new ArrayList<String>();
    /**
     *
     * (Required)
     *
     */
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<Link>();
    /**
     *
     * (Required)
     *
     */
    @SerializedName("icon")
    @Expose
    private Icon icon;

    /**
     * No args constructor for use in serialization
     *
     */
    public Agency()
    {
    }

    /**
     *
     * @param lineCodes
     * @param duration
     * @param operatingDays
     * @param agency
     * @param links
     * @param lineNames
     * @param frequency
     * @param phone
     * @param name
     * @param url
     * @param icon
     */
    public Agency(Integer agency, Integer frequency, Integer duration, Integer operatingDays, List<String> lineNames, List<String> lineCodes, List<Link> links, String name, String url, String phone, Icon icon)
    {
        this.agency = agency;
        this.frequency = frequency;
        this.duration = duration;
        this.operatingDays = operatingDays;
        this.lineNames = lineNames;
        this.lineCodes = lineCodes;
        this.links = links;
        this.name = name;
        this.url = url;
        this.phone = phone;
        this.icon = icon;
    }

    public Icon getIcon()
    {
        return icon;
    }

    public Agency setIcon(Icon icon)
    {
        this.icon = icon;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The agency
     */
    public Integer getAgency()
    {
        return agency;
    }

    /**
     *
     * (Required)
     *
     * @param agency
     *     The agency
     */
    public void setAgency(Integer agency)
    {
        this.agency = agency;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The frequency
     */
    public Integer getFrequency()
    {
        return frequency;
    }

    /**
     *
     * (Required)
     *
     * @param frequency
     *     The frequency
     */
    public void setFrequency(Integer frequency)
    {
        this.frequency = frequency;
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

    /**
     *
     * (Required)
     *
     * @return
     *     The lineNames
     */
    public List<String> getLineNames()
    {
        return lineNames;
    }

    /**
     *
     * (Required)
     *
     * @param lineNames
     *     The lineNames
     */
    public void setLineNames(List<String> lineNames)
    {
        this.lineNames = lineNames;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The lineCodes
     */
    public List<String> getLineCodes()
    {
        return lineCodes;
    }

    /**
     *
     * (Required)
     *
     * @param lineCodes
     *     The lineCodes
     */
    public void setLineCodes(List<String> lineCodes)
    {
        this.lineCodes = lineCodes;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The links
     */
    public List<Link> getLinks()
    {
        return links;
    }

    /**
     *
     * (Required)
     *
     * @param links
     *     The links
     */
    public void setLinks(List<Link> links)
    {
        this.links = links;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The name
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * (Required)
     *
     * @param name
     *     The name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The url
     */
    public String getUrl()
    {
        return url;
    }

    /**
     *
     * (Required)
     *
     * @param url
     *     The url
     */
    public void setUrl(String url)
    {
        this.url = url;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The phone
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     *
     * (Required)
     *
     * @param phone
     *     The phone
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(agency).append(frequency).append(duration).append(operatingDays).append(lineNames).append(lineCodes).append(links).append(name).append(url).append(phone).append(icon).toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Agency) == false)
        {
            return false;
        }
        Agency rhs = ((Agency) other);
        return new EqualsBuilder().append(agency, rhs.agency).append(frequency, rhs.frequency).append(duration, rhs.duration).append(operatingDays, rhs.operatingDays).append(lineNames, rhs.lineNames).append(lineCodes, rhs.lineCodes).append(links, rhs.links).append(name, rhs.name).append(url, rhs.url).append(phone, rhs.phone).append(icon, rhs.icon).isEquals();
    }

}
