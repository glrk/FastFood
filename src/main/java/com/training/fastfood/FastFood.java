package com.training.fastfood;

import com.training.fastfood.cart.Cart;
import com.training.fastfood.controller.Controller;

import java.util.Scanner;

public class FastFood {

    public static void main(String[] args) {
        Controller controller = new Controller(new Cart());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to McFast! How may I help you?");

        while (true) {
            String inputFromUser = scanner.nextLine();
            controller.doAction(inputFromUser);
            System.out.println("How may I further help you?");
        }
    }
}
