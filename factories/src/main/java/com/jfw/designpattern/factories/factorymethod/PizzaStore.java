package com.jfw.designpattern.factories.factorymethod;

import com.jfw.designpattern.factories.commonfunction.StaticComFunc;

/**
 * 使用工厂方法模式实现新需求的PizzaStore
 *
 * @author jfw
 * @date 2023-07-11
 */
public class PizzaStore {
    public static void main(String[] args) {
        do {
            String location = StaticComFunc.getLocation();
            if ("Beijing".equals(location)) {
                System.out.println("start to order Beijing Pizza");
                new BeijingOrderPizza();
            } else if ("London".equals(location)) {
                System.out.println("start to order London Pizza");
                new LondonOrderPizza();
            } else {
                System.out.println("invalid location，订购失败");
                break;
            }
        } while (true);
    }
}
