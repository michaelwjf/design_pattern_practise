package com.jfw.designpattern.singleton;

/**
 * @author jfw
 * @date 2021-07-16
 * <p>
 * 单例模式，懒汉式，线程不安全写法。这种写法是有问题的，生产上不能用这种线程不安全的写法
 */
public class Singleton02 {
    /**
     * 先私有化构造器，避免new
     */
    private Singleton02(){}

    /**
     * 私有静态实例
     */
    private static Singleton02 instance;

    public static Singleton02 getInstance() {
        // 当调用getInstance后，检查到instance为空时才创建新的实例
        // 线程不安全的问题就出在这里，当有多个线程同时走到这一步，一个线程还没有创建好实例，
        // 另一个线程又已经开始检查的时候，就会创建多个实例，违反了单例的规定
        if (instance == null) {
            instance = new Singleton02();
        }

        return instance;
    }
}
