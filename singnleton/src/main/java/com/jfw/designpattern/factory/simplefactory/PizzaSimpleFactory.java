package com.jfw.designpattern.factory.simplefactory;

/**
 * @author jfw
 * @date 2021-08-23
 */
public class PizzaSimpleFactory {
    public Pizza build(String name) {
        System.out.println(" 使用简单工厂模式 ");
        Pizza pizza = null;
        switch (name.toLowerCase()) {
            case "greek":
                pizza = new GreekPizza();
                pizza.setName(name);
                return pizza;
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName(name);
                return pizza;
            default:
                return pizza;
        }
    }
}
