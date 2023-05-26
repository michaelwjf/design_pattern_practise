package com.jfw.designpattern.factory.simplefactory;

/**
 * @author jfw
 * @date 2021-08-23
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new PizzaSimpleFactory());
    }
}
