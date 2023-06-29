package com.jfw.designpattern.singleton;

/**
 * 单例模式，懒汉式，同步方法。
 * <p>
 * 优点： 解决了线程不安全的问题。
 * <p>
 * 缺点： 这种方法给getInstance方法加上同步，保证了线程安全。但是因为每次调用方法都会同步，
 * 无论需不需要创建instance，效率大大降低，所以实际开发中不推荐
 *
 * @author jfw
 * @date 2021-07-21
 */
public class Singleton04 {
    /**
     * 私有化构造器，避免new
     */
    private Singleton04() {

    }

    private static Singleton04 instance;

    /**
     * 这里加了synchronized之后，所有线程到这里都会等待同步，即使instance已经有了，
     * 也会阻断。所以性能极低
     */
    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }

        return instance;
    }

}
