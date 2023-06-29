package com.jfw.designpattern.singleton;

/**
 * 单例模式，饿汉式 -- 静态代码块
 * <p>
 * 这种方式只是把类的实例化过程放在了静态代码块中，也是在类装载的时候就执行静态代码块中的代码，
 * 初始化类的实例。所以他的优缺点跟静态常量的方法是一样的
 *
 * @author jfw
 * @date 2023-06-29
 *
 */
public class Singleton01a {

    /**
     * 私有化构造函数，避免new
     */
    private Singleton01a() {

    }

    /**
     * 在类内部创建对象实例
     */
    private static Singleton01a instance;

    /*
     * 把实例化对象实例的动作放到一个静态代码块中
     */
    static {
        instance = new Singleton01a();
    }

    // 获取实例
    public static Singleton01a getInstance() {
        return instance;
    }
}
