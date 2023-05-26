package com.jfw.designpattern.singleton;

/**
 * @author jfw
 * @date 2021-07-21
 *
 * 单例模式，静态内部类。
 * 使用静态内部类来实现单例模式。
 * 在类加载的时候，其内部类不会被立即加载，只有在调用初始化这个内部类的方法的时候才会加载内部类。
 * 同时，JVM的机制保证了，当类在加载的时候，其他的线程无法进入这个类，所以可以利用JVM的这个机制
 * 来保证创建内部类时的线程安全。
 */
public class Singleton05 {
    /**
     * 私有化构造器
     */
    private Singleton05(){}

    /**
     * 声明一个私有的静态内部类，在外层的类加载时，这个内部类不会立即加载
     */
    private static class SingleTonInstance {
        // 这里声明一个静态内部类的成员常量，当内部类加载的时候会初始化这个常量
        // 同时，JVM保证了在类加载的时候其他线程无法进入这个类来初始化这个常量
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    /**
     * 这里只需要返回静态内部类的常量即可。
     * 即，在调用这个方法的时候，如果静态内部类没有加载，那么JVM会去加载内部类，初始化常量
     * 并返回。如果已经加载了，那么会直接返回内部类的常量。
     */
    public static Singleton05 getInstance() {
        return SingleTonInstance.INSTANCE;
    }
}
