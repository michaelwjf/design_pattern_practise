package com.jfw.designpattern.bridge;

/**
 * Abstraction类，聚合一个Implementor
 *
 * @author jfw
 * @date 2023-09-25
 */
public class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    /**
     * Abstraction类的开机，具体调用的是Implementor里面的实现方式。
     * 使用protected，只给其子类调用
     */
    protected void on() {
        brand.on();
    }

    /**
     * Abstraction类的关机，具体调用的是Implementor里面的实现方式
     * 使用protected，只给其子类调用
     */
    protected void off() {
        brand.off();
    }

    /**
     * Abstraction类的打电话，具体调用的是Implementor里面的实现方式
     * 使用protected，只给其子类调用
     */
    protected void call() {
        brand.call();
    }

}
