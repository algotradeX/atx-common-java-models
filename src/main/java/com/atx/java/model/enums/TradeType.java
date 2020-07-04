package com.atx.java.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TradeType {
    @JsonProperty("short")
    SHORT,
    @JsonProperty("long")
    LONG;
}
