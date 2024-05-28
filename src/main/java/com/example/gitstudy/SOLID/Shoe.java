package com.example.gitstudy.SOLID;

import java.math.BigDecimal;

public class Shoe extends AbstractItem{

    private final int size;
    private final String brand;
    private final String color;


    protected Shoe(int size, String brand, String  color,
                   String name, BigDecimal price, BigDecimal discount) {
        super(name, price, discount);
        this.size = size;
        this.brand = brand;
        this.color = color;
    }


    public int getSize(){
        return  size;
    }
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
