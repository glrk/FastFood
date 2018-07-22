package com.training.fastfood.cart;

import com.training.fastfood.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items = new ArrayList<>();

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }
        for (Item item : items) {
            System.out.println(item.getFullName());
        }
    }

    public void removeItem(String itemName) {
        for (Item item : items) {
            if (item.getShortName().equals(itemName)) {
                items.remove(item);
                return;
            }
        }
    }

    public void submitOrder() {
        int totalCalories = calculateTotalCalories();
        float totalPrice = calculateTotalPrice();
        System.out.println("Total amount of calories in your order: " + totalCalories);
        System.out.println("Total price of your order: " + totalPrice);
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int getCartSize() {
        return items.size();
    }

    private float calculateTotalPrice() {
        float result = 0;
        for (int i = 0; i < items.size(); i++) {
            result += items.get(i).getPrice();
        }
        return result;
    }

    private int calculateTotalCalories() {
        int result = 0;
        for (int i = 0; i < items.size(); i++) {
            result += items.get(i).getCalories();
        }
        return result;
    }
}
