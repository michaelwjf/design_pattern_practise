package com.jfw.designpattern.singleton;

/**
 * @author jfw
 * @date 2021-07-21
 * <p>
 * 单例模式，懒汉式，双重检查同时代码块同步。
 * 这种方式可以解决方法同步造成的效率低下的问题，同时又可以通过双重检查来保证有且仅有一个
 * 线程在创建实例。
 */
public class Singleton04 {
    /**
     * 私有化构造器，避免new
     */
    private Singleton04(){}

    /**
     * 加入volatile声明，使得当instance实例一旦发生变化就立即刷新主存
     */
    private static volatile Singleton04 instance;

    public static Singleton04 getInstance() {
        // 第一次判断instance是否为空
        // 只要当instance不为空，所有线程不会再进去了
        if (instance == null) {
            // 这里开始代码块同步，只有当instance为空的时候才会进来这里同步
            // 所以这里影响的只是当instance还没创建的时候同时进入的那少数几个线程
            synchronized (Singleton04.class) {
                // 进入同步块之后再判断一次，为空才创建，因为这里的代码是同步的，所以
                // 每次只有一个线程会进来判断，当有一个线程已经创建好实例之后，排队的
                // 线程再来判断的时候就已经不为空了，不会重复创建实例
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }

        return instance;
    }
}
