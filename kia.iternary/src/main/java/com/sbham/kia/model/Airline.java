
package com.sbham.kia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Airline {

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
    @SerializedName("icon")
    @Expose
    private Icon icon;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Airline() {
    }

    /**
     * 
     * @param icon
     * @param name
     * @param code
     * @param url
     */
    public Airline(String code, String name, String url, Icon icon) {
        this.code = code;
        this.name = name;
        this.url = url;
        this.icon = icon;
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
     *     The icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * 
     * (Required)
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(name).append(url).append(icon).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Airline) == false) {
            return false;
        }
        Airline rhs = ((Airline) other);
        return new EqualsBuilder().append(code, rhs.code).append(name, rhs.name).append(url, rhs.url).append(icon, rhs.icon).isEquals();
    }

}
