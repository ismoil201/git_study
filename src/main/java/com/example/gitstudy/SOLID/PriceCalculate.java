package com.example.gitstudy.SOLID;

import java.math.BigDecimal;

public class PriceCalculate {

    public BigDecimal calculateTotalPrice(BigDecimal totalPrice, AbstractItem item){
        return totalPrice.add(item.getPrice()
                .multiply(BigDecimal.ONE
                        .subtract(item
                                .getDiscountPrice())
                )
        );
    }
}
