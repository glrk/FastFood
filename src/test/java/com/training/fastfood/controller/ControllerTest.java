package com.training.fastfood.controller;

import com.training.fastfood.cart.Cart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ControllerTest {

    private Controller controller;

    @Before
    public void setUp() {
        controller = new Controller(new Cart());
    }

    @Test
    public void shouldAddAllItemsToCartViaController() {
        controller.doAction("add Pepsi");
        controller.doAction("add Water");
        controller.doAction("add Salad");
        controller.doAction("add Burger");
        Assert.assertEquals(4, controller.getControllerCartSize());
    }

    @Test
    public void shouldRemoveAllItemsFromCartViaController() {
        controller.doAction("add Pepsi");
        controller.doAction("add Water");
        controller.doAction("add Salad");
        controller.doAction("add Burger");
        controller.doAction("remove Pepsi");
        controller.doAction("remove Water");
        controller.doAction("remove Salad");
        controller.doAction("remove Burger");
        Assert.assertEquals(0, controller.getControllerCartSize());
    }

    @Test
    public void shouldSubmitOrderViaController() {
        controller.doAction("add Pepsi");
        controller.doAction("add Water");
        controller.doAction("add Salad");
        controller.doAction("add Burger");
        controller.doAction("order");
        Assert.assertEquals(0, controller.getControllerCartSize());
    }

    @Test
    public void shouldShowCartWithoutAnyTrouble() {
        controller.doAction("show");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldThrowExceptionForRemoveWithoutItemName() {
        controller.doAction("remove");
    }
}
