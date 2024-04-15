package com.arun.designpattern.rulebased;

public class Item {
    String itemId;
    String itemName;
    double price;
    int quantity;

    boolean isGroceryItem;

    public Item(String itemId, String itemName, double price, int quantity, boolean isGroceryItem) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.isGroceryItem = isGroceryItem;
    }
}
