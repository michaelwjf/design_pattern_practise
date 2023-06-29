package com.jfw.designpattern.singleton;

/**
 * @author jfw
 * @date 2021-07-12
 * <p>
 * 单例模式，饿汉式 -- 静态常量
 * <p>
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步的问题。
 * <p>
 * 缺点：在类装载的时候就完成实例化，没有达到lazy loading的效果。如果从始至终从未使用过这个实例，
 * 则会造成内存的浪费
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
