package com.jfw.designpattern.factories.withoutpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jfw.designpattern.factories.commonfunction.StaticComFunc;

/**
 * @author jfw
 * @date 2023-07-03
 */
public class OrderPizza {

    /**
     * 根据不同的输入，构造不同类型的Pizza
     */
    public OrderPizza() {
        Pizza pizza = null;
        do {
            String orderType = StaticComFunc.getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
            } else if ("pepper".equals(orderType)) {
                // 当新增一个peper pizza的时候，就需要在这里改动代码，把新增加的类新给加进去
                pizza = new PepperPizza();
            } else {
                System.out.printf("%s pizza can not found , exit%n", orderType);

                break;
            }

            // 输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);

    }
}
