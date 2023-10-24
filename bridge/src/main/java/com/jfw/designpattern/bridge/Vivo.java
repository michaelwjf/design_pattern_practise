package com.jfw.designpattern.bridge;

/**
 * 具体实现类
 *
 * @author jfw
 * @date 2023-09-25
 */
public class Vivo implements Brand {
    /**
     * 开机
     */
    @Override
    public void on() {
        System.out.println("Vivo手机开机");
    }

    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }

    /**
     * 关机
     */
    @Override
    public void off() {
        System.out.println("Vivo手机关机");
    }
}
