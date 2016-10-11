
package com.sbham.kia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class IndicativePrice {

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
    @SerializedName("price")
    @Expose
    private Integer price;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("priceLow")
    @Expose
    private Integer priceLow;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("priceHigh")
    @Expose
    private Integer priceHigh;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("nativePrice")
    @Expose
    private Integer nativePrice;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("nativePriceLow")
    @Expose
    private Integer nativePriceLow;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("nativePriceHigh")
    @Expose
    private Integer nativePriceHigh;
    /**
     *
     * (Required)
     *
     */
    @SerializedName("nativeCurrency")
    @Expose
    private String nativeCurrency;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IndicativePrice() {
    }

    /**
     *
     * @param price
     * @param priceHigh
     * @param name
     * @param nativeCurrency
     * @param nativePriceHigh
     * @param nativePriceLow
     * @param nativePrice
     * @param priceLow
     * @param currency
     */
    public IndicativePrice(String name, Integer price, Integer priceLow, Integer priceHigh, String currency, Integer nativePrice, Integer nativePriceLow, Integer nativePriceHigh, String nativeCurrency) {
        this.name = name;
        this.price = price;
        this.priceLow = priceLow;
        this.priceHigh = priceHigh;
        this.currency = currency;
        this.nativePrice = nativePrice;
        this.nativePriceLow = nativePriceLow;
        this.nativePriceHigh = nativePriceHigh;
        this.nativeCurrency = nativeCurrency;
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
     *     The price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 
     * (Required)
     * 
     * @param price
     *     The price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The priceLow
     */
    public Integer getPriceLow() {
        return priceLow;
    }

    /**
     * 
     * (Required)
     * 
     * @param priceLow
     *     The priceLow
     */
    public void setPriceLow(Integer priceLow) {
        this.priceLow = priceLow;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The priceHigh
     */
    public Integer getPriceHigh() {
        return priceHigh;
    }

    /**
     * 
     * (Required)
     * 
     * @param priceHigh
     *     The priceHigh
     */
    public void setPriceHigh(Integer priceHigh) {
        this.priceHigh = priceHigh;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * (Required)
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The nativePrice
     */
    public Integer getNativePrice() {
        return nativePrice;
    }

    /**
     *
     * (Required)
     *
     * @param nativePrice
     *     The nativePrice
     */
    public void setNativePrice(Integer nativePrice) {
        this.nativePrice = nativePrice;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The nativePriceLow
     */
    public Integer getNativePriceLow() {
        return nativePriceLow;
    }

    /**
     *
     * (Required)
     *
     * @param nativePriceLow
     *     The nativePriceLow
     */
    public void setNativePriceLow(Integer nativePriceLow) {
        this.nativePriceLow = nativePriceLow;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The nativePriceHigh
     */
    public Integer getNativePriceHigh() {
        return nativePriceHigh;
    }

    /**
     *
     * (Required)
     *
     * @param nativePriceHigh
     *     The nativePriceHigh
     */
    public void setNativePriceHigh(Integer nativePriceHigh) {
        this.nativePriceHigh = nativePriceHigh;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The nativeCurrency
     */
    public String getNativeCurrency() {
        return nativeCurrency;
    }

    /**
     *
     * (Required)
     *
     * @param nativeCurrency
     *     The nativeCurrency
     */
    public void setNativeCurrency(String nativeCurrency) {
        this.nativeCurrency = nativeCurrency;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(price).append(priceLow).append(priceHigh).append(currency).append(nativePrice).append(nativePriceLow).append(nativePriceHigh).append(nativeCurrency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IndicativePrice) == false) {
            return false;
        }
        IndicativePrice rhs = ((IndicativePrice) other);
        return new EqualsBuilder().append(name, rhs.name).append(price, rhs.price).append(priceLow, rhs.priceLow).append(priceHigh, rhs.priceHigh).append(currency, rhs.currency).append(nativePrice, rhs.nativePrice).append(nativePriceLow, rhs.nativePriceLow).append(nativePriceHigh, rhs.nativePriceHigh).append(nativeCurrency, rhs.nativeCurrency).isEquals();
    }

}
