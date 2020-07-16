package 代码篇_超市运转代码实现.supermarket.impl;

import 代码篇_超市运转代码实现.supermarket.interfaces.Card;
import 代码篇_超市运转代码实现.supermarket.interfaces.Customer;
import 代码篇_超市运转代码实现.supermarket.interfaces.ShoppingCart;

public enum VIPCard implements Card {
    Level0(1),
    Level1(0.99),
    Level2(0.95),
    Level3(0.9),
    Level4(0.85),
    Level5(0.8);

    private final double discount;

    VIPCard(double discount) {
        this.discount = discount;
    }


    @Override
    public double processCardDiscount(double totalCost, double totalCostAfterDiscount, Customer customer, ShoppingCart shoppingCart) {
        return totalCostAfterDiscount * (1 - discount);
    }
}
