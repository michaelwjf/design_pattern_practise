package com.jfw.designpattern.factories.abstractfactory;

import com.jfw.designpattern.factories.commonfunction.StaticComFunc;

/**
 * 使用抽象工厂模式的PizzaStore
 *
 * @author jfw
 * @date 2023-07-13
 */
public class PizzaStore {
    public static void main(String[] args) {
        String location = "";
        do {
            location = StaticComFunc.getLocation();
            if ("Beijing".equals(location)) {
                new OrderPizza(new BeijingPizzaFactory());
            } else if ("London".equals(location)) {
                new OrderPizza(new LondonPizzaFactory());
            } else {
                System.out.println("invalid location, 订购失败");
                break;
            }
        } while (true);
    }
}

