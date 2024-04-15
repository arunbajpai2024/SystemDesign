package com.arun.designpattern.rulebased;

import java.time.Month;

public class DussheraDiscountRule implements CartRule{

    String desc;

    public DussheraDiscountRule(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean matches(Cart input) {
        return input.createdOn.getMonth() == Month.SEPTEMBER && input.getTotalPrice() > 2000 && input.areAllItemsGrocery();
    }

    @Override
    public void apply(Cart input) {
        System.out.println("Applying rule: " + desc);
        double currentPrice = input.getTotalPrice();
        input.setTotalPrice(currentPrice*0.8);
        input.addItem(new Item("111","Sugar", 0, 1, true));
    }
}
