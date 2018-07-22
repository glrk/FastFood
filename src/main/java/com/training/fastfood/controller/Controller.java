package com.training.fastfood.controller;

import com.training.fastfood.cart.Cart;
import com.training.fastfood.item.drink.Pepsi;
import com.training.fastfood.item.drink.Water;
import com.training.fastfood.item.snack.Burger;
import com.training.fastfood.item.snack.Salad;

public class Controller {

    private Cart cart;

    public Controller(Cart cart) {
        this.cart = cart;
    }

    public void doAction(String input) {
        String[] inputParts = prepareInputParts(input);
        switch (inputParts[0]) {
            case "add":
                addToCart(inputParts[1]);
                break;
            case "remove":
                removeFromCart(inputParts[1]);
                break;
            case "show":
                showCart();
                break;
            case "order":
                order();
                break;
            case "exit":
                System.exit(0);
            default:
                System.out.println("Unsupported command: " + input);
        }
    }

    int getControllerCartSize() {
        return cart.getCartSize();
    }

    private String[] prepareInputParts(String input) {
        final String[] inputParts = input.split(" ");
        if (inputParts.length > 2 || inputParts.length < 1) {
            throw new IllegalArgumentException("The input should have 1 or 2 parts separated by space!");
        }
        return inputParts;
    }

    private void order() {
        System.out.println("Your order has been submitted. Please go to the register to pick it up!");
        cart.submitOrder();
    }

    private void showCart() {
        System.out.println("Here's your cart content:");
        cart.showCart();
    }

    private void removeFromCart(String itemName) {
        System.out.println("Removing the " + itemName + " from cart, as long as it exists there");
        cart.removeItem(itemName);
    }

    private void addToCart(String itemName) {
        switch (itemName) {
            case "Pepsi":
                cart.addItem(new Pepsi());
                System.out.println("Added " + itemName + " to cart!");
                break;
            case "Water":
                cart.addItem(new Water());
                System.out.println("Added " + itemName + " to cart!");
                break;
            case "Burger":
                cart.addItem(new Burger());
                System.out.println("Added " + itemName + " to cart!");
                break;
            case "Salad":
                cart.addItem(new Salad());
                System.out.println("Added " + itemName + " to cart!");
                break;
            default:
                System.out.println("The " + itemName + " could not be added to cart!");
        }
    }
}
