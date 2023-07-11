package com.jfw.designpattern.factories.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 抽象的OrderPizza类
 * <p>
 * 其中包含一个抽象的createPizza方法，由具体继承他的类来实现。
 * 这样就能根据不同的pizza种类返回不同的pizza类
 *
 * @author jfw
 * @date 2023-07-11
 */
public abstract class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        do {
            String orderType = getType();
            // 使用抽象方法createPizza来创建pizza类，具体抽象方法的实现由子类完成
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("invalid type, 订购失败");
                break;
            }
        } while (true);

    }

    /**
     * 创建Pizza
     * <p>
     * 具体实现方法由其继承的类根据不同的需求来实现，以返回不同类型的Pizza
     * @param orderType 输入pizza的种类
     * @return 不同类型的Pizza
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
