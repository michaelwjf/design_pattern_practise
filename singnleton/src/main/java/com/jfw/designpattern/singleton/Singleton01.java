package com.jfw.designpattern.singleton;

/**
 * @author jfw
 * @date 2021-07-12
 * <p>
 * 单例模式，饿汉式 -- 静态常量
 */
public class Singleton01 {

    /**
     * 私有化构造函数，避免new
     */
    private Singleton01() {
    }

    /**
     * 使用静态常量来实例化单例类，这样可以保证每个拿到这个实例的对象拿到的都是同一个实例
     */
    private static final Singleton01 INSTANCE = new Singleton01();

    // 获取实例
    public static Singleton01 getInstance() {
        return INSTANCE;
    }

}
