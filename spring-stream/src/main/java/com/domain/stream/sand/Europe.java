package com.domain.stream.sand;

import java.math.BigDecimal;

/**
 * @author mbaranowicz
 */
public final class Europe implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("12345678901234567890");
        return sandQuantity;
    }
}
