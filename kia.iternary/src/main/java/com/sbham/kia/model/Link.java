
package com.sbham.kia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Link {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("text")
    @Expose
    private String text;
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
    @SerializedName("displayUrl")
    @Expose
    private String displayUrl;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("moustacheUrl")
    @Expose
    private String moustacheUrl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Link() {
    }

    /**
     * 
     * @param displayUrl
     * @param text
     * @param moustacheUrl
     * @param url
     */
    public Link(String text, String url, String displayUrl, String moustacheUrl) {
        this.text = text;
        this.url = url;
        this.displayUrl = displayUrl;
        this.moustacheUrl = moustacheUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * (Required)
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
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
     *     The displayUrl
     */
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param displayUrl
     *     The displayUrl
     */
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The moustacheUrl
     */
    public String getMoustacheUrl() {
        return moustacheUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param moustacheUrl
     *     The moustacheUrl
     */
    public void setMoustacheUrl(String moustacheUrl) {
        this.moustacheUrl = moustacheUrl;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(url).append(displayUrl).append(moustacheUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Link) == false) {
            return false;
        }
        Link rhs = ((Link) other);
        return new EqualsBuilder().append(text, rhs.text).append(url, rhs.url).append(displayUrl, rhs.displayUrl).append(moustacheUrl, rhs.moustacheUrl).isEquals();
    }

}
