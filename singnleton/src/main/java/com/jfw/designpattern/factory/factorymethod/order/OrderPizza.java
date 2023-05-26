package com.jfw.designpattern.factory.factorymethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jfw.designpattern.factory.factorymethod.pizza.Pizza;

/**
 * @author jfw
 * @date 2021-08-31
 */
public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        do {
            String orderType = getType();
            // 抽象方法由工厂子类完成
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    /**
     * 创建Pizza类
     * @param orderType String类型的pizza口味
     * @return Pizza
     */
    abstract Pizza createPizza(String orderType);

    private String getType() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("input pizza flavor: ");
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
