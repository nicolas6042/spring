package com.domain.stream.sand;

import java.math.BigDecimal;

/**
 * @author mbaranowicz
 */
public final class Asia implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity= new BigDecimal("98765432101234567890");
        return sandQuantity;
    }
}
