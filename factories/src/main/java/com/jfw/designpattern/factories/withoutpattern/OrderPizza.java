package com.jfw.designpattern.factories.withoutpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
            String orderType = getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
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

    /**
     * 通过键盘输入获取pizza的类型
     * @return String Pizza类型
     */
    private String getType() {
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input the pizza type: ");
            return bufferedReader.readLine();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
            return null;
        }
    }
}
