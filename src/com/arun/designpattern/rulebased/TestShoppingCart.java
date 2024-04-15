package com.arun.designpattern.rulebased;

import java.time.LocalDateTime;

public class TestShoppingCart {
    public static void main(String[] args) {
        RuleEngine ruleEngine = new RuleEngine();
        DiwaliDiscountRule diwaliDiscountRule = new DiwaliDiscountRule("Diwali offer");
        DussheraDiscountRule dussheraDiscountRule = new DussheraDiscountRule("Dusserhra offer");
        ruleEngine.addRule(diwaliDiscountRule);
        ruleEngine.addRule(dussheraDiscountRule);
        Cart cart1 = new Cart();
        cart1.createdOn = LocalDateTime.now().plusMonths(7);
        buildItemsForCustomer1(cart1);
        double totalPrice = cart1.calculateCartPrice();
        cart1.setTotalPrice(totalPrice);
        cart1.checkOutCart(ruleEngine);
    }

    static void buildItemsForCustomer1(Cart cart) {
        Item item1 = new Item("1", "Iphone", 65000, 1, false);
        Item item2 = new Item("2", "TV", 35000, 1, false);
        Item item3 = new Item("3", "Vegetable Oil", 500, 1, true);
        Item item4 = new Item("4", "Maida", 100, 2, true);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
    }
}
