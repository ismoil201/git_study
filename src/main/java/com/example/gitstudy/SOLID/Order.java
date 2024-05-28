package com.example.gitstudy.SOLID;

import ch.qos.logback.core.util.AggregationType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private  final List<AbstractItem> items;
    private BigDecimal totalPrice;
    private final PriceCalculate priceCalculate;

    public Order(List<AbstractItem> items, BigDecimal totalPrice) {
        this.items = new ArrayList<>();
        this.totalPrice = BigDecimal.ZERO;

        this.priceCalculate = new PriceCalculate();

    }

    public void addItem(AbstractItem item){
        this.items.add(item);
        this.totalPrice = priceCalculate.calculateTotalPrice(this.totalPrice,item);
    }

    private void calculateTotalPrice(AbstractItem item) {

        this.totalPrice = this.totalPrice.add(item.getPrice());
    }

    public  BigDecimal getTotalPrice(){
        return this.totalPrice;
    }
}
