package com.platzi.market.domain;

import lombok.Data;

@Data
public class PurchaseItem {
    private Integer productId;
    private Integer quantity;
    private Double total;
    private Boolean activate;
}
