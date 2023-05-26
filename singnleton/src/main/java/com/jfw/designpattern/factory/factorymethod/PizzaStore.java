package com.jfw.designpattern.factory.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jfw.designpattern.factory.factorymethod.order.BJOrderPizza;
import com.jfw.designpattern.factory.factorymethod.order.LondonOrderPizza;

/**
 * @author jfw
 * @date 2021-08-31
 */
public class PizzaStore {
    public static void main(String[] args) {
        do {
            String location = getLocation();
            switch (location.toLowerCase()) {
                case "bj":
                    new BJOrderPizza();
                    break;
                case "london":
                    new LondonOrderPizza();
                    break;
                default:
                    System.out.println("无效location");
                    return;
            }
        } while (true);

    }

    private static String getLocation() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("input lcoation");
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
