package com.platzi.market.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Purchase {
    private Integer purchaseId;
    private String clientId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<PurchaseItem> item;
}
