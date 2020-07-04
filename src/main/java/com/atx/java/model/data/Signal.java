package com.atx.java.model.data;

import com.atx.java.model.enums.OrderType;
import com.atx.java.model.enums.TradeType;
import lombok.Data;

import java.util.Date;

@Data
public class Signal {

    private String symbol;

    private double entry;

    private double target;

    private double stopLoss;

    private Date signalEntryTime;

    private Date squareOffTime;

    private OrderType orderType;

    private TradeType tradeType;
}
