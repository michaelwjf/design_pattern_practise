package com.jfw.designpattern.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jfw
 * @date 2021-08-23
 */
public class OrderPizza {
    private PizzaSimpleFactory factory;
    private Pizza pizza;

    public OrderPizza(PizzaSimpleFactory factory) {
        setFactory(factory);
    }

    private void setFactory(PizzaSimpleFactory simpleFactory) {
        System.out.println("使用简单工厂模式");
        this.factory = simpleFactory;
        do {
            String pizzaName = getName();
            this.pizza = factory.build(pizzaName);
            if (this.pizza != null) {
                this.pizza.prepare();
                this.pizza.bake();
                this.pizza.cut();
                this.pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    private String getName() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
