package com.jfw.designpattern.singleton;

/**
 * 单例模式，懒汉式，双重检查同时代码块同步。
 * 这种方式可以解决方法同步造成的效率低下的问题，同时又可以通过双重检查来保证有且仅有一个
 * 线程在创建实例。
 * <p>
 * double check的概念是多线程开发中常使用到的，进行两次if(instance == null)的判断，
 * 并且在第二次判断之前同步代码块，这样实例化就可以只进行一次，就可以保证线程安全了。
 * <p>
 * 优点： 线程安全，懒加载，效率较高，推荐使用
 *
 * @author jfw
 * @date 2021-07-21
 */
public class Singleton06 {
    /**
     * 私有化构造器，避免new
     */
    private Singleton06() {

    }

    /**
     * 加入volatile声明，使得当instance实例一旦发生变化就立即刷新主存
     */
    private static volatile Singleton06 instance;

    /**
     * 提供一个静态公有方法，加入双重检查和同步代码，解决线程安全问题，同时解决懒加载问题
     */
    public static Singleton06 getInstance() {
        // 加入双重检查
        // 第一次判断instance是否为空
        // 只要当instance不为空，所有线程不会再进去了
        if (instance == null) {
            // 这里开始代码块同步，只有当instance为空的时候才会进来这里同步
            // 所以这里影响的只是当instance还没创建的时候同时进入的那少数几个线程
            synchronized (Singleton06.class) {
                // 进入同步块之后再判断一次，为空才创建，因为这里的代码是同步的，所以
                // 每次只有一个线程会进来判断，当有一个线程已经创建好实例之后，排队的
                // 线程再来判断的时候就已经不为空了，不会重复创建实例
                if (instance == null) {
                    instance = new Singleton06();
                }
            }
        }

        return instance;
    }
}
