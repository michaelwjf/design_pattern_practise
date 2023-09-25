package com.jfw.designpattern.bridge;

/**
 * RefinedAbstraction类，继承Abstraction类，调度具体实现类。
 *
 * @author jfw
 * @date 2023-09-25
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    /**
     * 具体调用的是其父类的call()
     */
    public void call() {
        System.out.println("折叠手机");
        super.call();
    }

    /**
     * 具体调用的是其父类的on()
     */
    public void on() {
        System.out.println("折叠手机");
        super.on();
    }

    /**
     * 具体调用的是其父类的off()
     */
    public void off() {
        System.out.println("折叠手机");
        super.off();
    }


}
