package com.arun.designpattern.rulebased;

import java.time.Month;

public class DiwaliDiscountRule implements CartRule{

    String desc;

    public DiwaliDiscountRule(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean matches(Cart input) {
        return input.createdOn.getMonth() == Month.NOVEMBER && input.getTotalPrice() > 5000;
    }

    @Override
    public void apply(Cart input) {
        System.out.println("Applying rule: " + desc);
        double currentPrice = input.getTotalPrice();
        input.setTotalPrice(currentPrice*0.9);
    }
}
