package com.domain.stream.sand;

import java.math.BigDecimal;

/**
 * @author mbaranowicz
 */
public final class Africa implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("99999999901234567890");
        return sandQuantity;
    }
}
