package com.training.fastfood.controller;

import com.training.fastfood.cart.Cart;

public class Controller {

    private Cart cart;

    public Controller(Cart cart) {
        this.cart = cart;
    }

    public void doAction(String input) {
        String itemName = "Pepsi";
        switch (input) {
            case "add":
                addToCart(itemName);
                break;
            case "remove":
                removeFromCart(itemName);
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

    private void order() {
        System.out.println("Your order has been submitted. Please go to the register to pick it up!");
        cart.emptyCart();
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
                cart.addItem(itemName);
                System.out.println("Added " + itemName + " to cart!");
                break;
            case "Water":
                cart.addItem(itemName);
                System.out.println("Added " + itemName + " to cart!");
                break;
            case "Burger":
                cart.addItem(itemName);
                System.out.println("Added " + itemName + " to cart!");
                break;
            case "Salad":
                cart.addItem(itemName);
                System.out.println("Added " + itemName + " to cart!");
                break;
            default:
                System.out.println("The " + itemName + " could not be added to cart!");
        }
    }
}
