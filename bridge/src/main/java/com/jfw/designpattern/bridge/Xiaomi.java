package com.jfw.designpattern.bridge;

/**
 * 具体实现类
 *
 * @author jfw
 * @date 2023-09-25
 */
public class Xiaomi implements Brand {

    /**
     * 开机
     */
    @Override
    public void on() {
        System.out.println("小米手机开机");
    }

    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    /**
     * 关机
     */
    @Override
    public void off() {
        System.out.println("小米手机关机");
    }
}
