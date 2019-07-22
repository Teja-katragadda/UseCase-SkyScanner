package com.example.skyscannerflightdetails.SkyScannerModel;

import com.google.gson.annotations.SerializedName;

public class Quote {
    @SerializedName("QuoteId")
    private Integer quoteId;

    @SerializedName("MinPrice")
    private Integer minPrice;

    @SerializedName("Direct")
    private Boolean direct;

    @SerializedName("OutboundLeg")
    private OutboundLeg outboundLeg;

    @SerializedName("QuoteDateTime")
    private String quoteDateTime;

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Boolean getDirect() {
        return direct;
    }

    public void setDirect(Boolean direct) {
        this.direct = direct;
    }

    public OutboundLeg getOutboundLeg() {
        return outboundLeg;
    }

    public void setOutboundLeg(OutboundLeg outboundLeg) {
        this.outboundLeg = outboundLeg;
    }

    public String getQuoteDateTime() {
        return quoteDateTime;
    }

    public void setQuoteDateTime(String quoteDateTime) {
        this.quoteDateTime = quoteDateTime;
    }
}
