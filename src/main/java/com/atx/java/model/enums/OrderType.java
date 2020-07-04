package com.atx.java.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderType {
    @JsonProperty("limitOrder")
    LIMIT_ORDER,
    @JsonProperty("marketOrder")
    MARKET_ORDER;
}
