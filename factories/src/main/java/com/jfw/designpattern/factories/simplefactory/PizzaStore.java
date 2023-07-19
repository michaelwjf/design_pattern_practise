package com.jfw.designpattern.factories.simplefactory;

/**
 * 改进为SimpleFactory模式后的PizzaStore
 *
 * @author jfw
 * @date 2023-07-05
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }
}
