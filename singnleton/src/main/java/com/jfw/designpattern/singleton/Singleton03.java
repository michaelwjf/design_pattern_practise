package com.jfw.designpattern.singleton;

/**
 * @author jfw
 * @date 2021-07-21
 * <p>
 * 单例模式，懒汉式，同步方法。这种方法给getInstance方法加上同步，保证了线程安全。
 * 但是因为每次调用方法都会同步，无论需不需要创建instance，效率大大降低，所以实际开发中不推荐
 */
public class Singleton03 {
    /**
     * 私有化构造器，避免new
     */
    private Singleton03(){}

    private static Singleton03 instance;

    /**
     * 这里加了synchronized之后，所有线程到这里都会等待同步，即使instance已经有了，
     * 也会阻断。所以性能极低
     */
    public static synchronized Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }

        return instance;
    }

}
