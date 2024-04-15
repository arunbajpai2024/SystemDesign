package com.arun.designpattern.rulebased;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cart {
    Customer customer;
    List<Item> items = new ArrayList<>();

    double totalPrice;

    LocalDateTime createdOn;

    void addItem(Item item){
        items.add(item);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    double calculateCartPrice(){
        return items.stream().map(item -> item.price*item.quantity).reduce(Double::sum).orElse(0.0);
    }

    void checkoutCart(){

    }

    boolean areAllItemsGrocery(){
        Optional<Item> groceryItem = items.stream().filter(item -> item.isGroceryItem).findAny();
        return !groceryItem.isPresent();
    }

    @Override
    public String toString() {
        return "Cart price : " + this.getTotalPrice();
    }

    void checkOutCart(RuleEngine ruleEngine){
        System.out.println("Check if any offer applicable on the final cart");
        System.out.println("Before offer " + this);
        ruleEngine.cartRules.stream().filter(cartRule -> cartRule.matches(this)).forEach(rule -> rule.apply(this));
        System.out.println("After offer " + this);
    }
}
