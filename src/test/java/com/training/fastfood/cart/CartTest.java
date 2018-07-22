package com.training.fastfood.cart;

import com.training.fastfood.item.drink.Pepsi;
import com.training.fastfood.item.drink.Water;
import com.training.fastfood.item.snack.Burger;
import com.training.fastfood.item.snack.Salad;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CartTest {

    private Cart cart;

    @Before
    public void setUp() {
        cart = new Cart();
    }

    @Test
    public void shouldAddAllItemsToCart() {
        cart.addItem(new Pepsi());
        cart.addItem(new Water());
        cart.addItem(new Burger());
        cart.addItem(new Salad());
        Assert.assertEquals(4, cart.getCartSize());
    }

    @Test
    public void shouldRemoveAllItemsFromCart() {
        cart.addItem(new Pepsi());
        cart.addItem(new Water());
        cart.addItem(new Burger());
        cart.addItem(new Salad());
        cart.removeItem("Pepsi");
        cart.removeItem("Water");
        cart.removeItem("Burger");
        cart.removeItem("Salad");
        Assert.assertEquals(0, cart.getCartSize());
    }

    @Test
    public void shouldRemoveAllItemsWhenSubmittingOrder() {
        cart.addItem(new Pepsi());
        cart.addItem(new Water());
        cart.addItem(new Burger());
        cart.addItem(new Salad());
        cart.submitOrder();
        Assert.assertEquals(0, cart.getCartSize());
    }
}
