package com.jfw.designpattern.bridge;

/**
 * RefinedAbstraction类，继承Abstraction类，调度具体实现类
 *
 * @author jfw
 * @date 2023-09-25
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    /**
     * RefinedAbstraction类的打电话，具体调用的是其父类Abstraction类的打电话
     */
    public void call() {
        System.out.println("直板手机");
        super.call();
    }

    /**
     * RefinedAbstraction类的开机，具体调用的是其父类Abstraction类的开机
     */
    public void on() {
        System.out.println("直板手机");
        super.on();
    }

    /**
     * RefinedAbstraction类的关机，具体调用的是其父类Abstraction类的关机
     */
    public void off() {
        System.out.println("直板手机");
        super.off();
    }
}
