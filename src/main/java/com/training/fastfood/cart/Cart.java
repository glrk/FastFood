package com.training.fastfood.cart;

import com.training.fastfood.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Object> items = new ArrayList<>();

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }
        for (Object item : items) {
            System.out.println(item.toString());
        }
    }

    public void removeItem(String itemName) {
        for (Object item : items) {
            if(item.toString().equals(itemName)) {
                items.remove(item);
            }
        }
    }

    public void emptyCart() {
        items = new ArrayList<>();
    }

    public void addItem(Object item) {
        items.add(item);
    }

    public int getCartSize() {
        return items.size();
    }
}
