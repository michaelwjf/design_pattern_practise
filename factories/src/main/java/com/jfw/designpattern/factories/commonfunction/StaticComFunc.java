package com.jfw.designpattern.factories.commonfunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 这里放一些静态的公用方法
 *
 * @author jfw
 * @date 2023-07-13
 */
public final class StaticComFunc {
    /**
     * 隐藏构造方法
     */
    private StaticComFunc() {

    }

    /**
     * input pizza flavor from the keyboard
     * @return the flavor of the pizza, e.g. cheese, pepper, etc.
     */
    public static String getType() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("input pizza flavor: ");
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * input location from the keyboard
     * @return the location of the pizza order, e.g. Beijing, London
     */
    public static String getLocation() {
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
