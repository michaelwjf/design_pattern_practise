package com.jfw.designpattern.factories.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用工厂方法模式实现新需求的PizzaStore
 *
 * @author jfw
 * @date 2023-07-11
 */
public class PizzaStore {
    public static void main(String[] args) {
        do {
            String location = getLoc();
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

    private static String getLoc() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("input the location...");
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
