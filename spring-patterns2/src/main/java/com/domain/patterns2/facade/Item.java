package com.domain.patterns2.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;


public class Item {
    private final Long productId;
    private final double qty;

    public Item(Long productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQty() {
        return qty;
    }
}
