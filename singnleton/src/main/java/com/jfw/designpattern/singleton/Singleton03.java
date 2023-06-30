package com.jfw.designpattern.singleton;

/**
 * 单例模式，懒汉式，线程不安全写法。这种写法是有问题的，生产上不能用这种线程不安全的写法
 * <p>
 * 优点： 起到了lazy loading的效果，但是只能在单线程下使用。
 * <p>
 * 缺点： 在多线程下，一个线程进入了if(instance == null)判断语句，还未来得及往下执行，
 * 另一个线程也通过了这个判断语句，这时就会产生多个实例。所以在多线程环境下不可以使用这种方式。
 *
 * @author jfw
 * @date 2021-07-16
 */
public class Singleton03 {
    /**
     * 先私有化构造器，避免new
     */
    private Singleton03() {

    }

    /**
     * 私有静态实例
     */
    private static Singleton03 instance;

    public static Singleton03 getInstance() {
        // 当调用getInstance后，检查到instance为空时才创建新的实例
        // 线程不安全的问题就出在这里，当有多个线程同时走到这一步，一个线程还没有创建好实例，
        // 另一个线程又已经开始检查的时候，就会创建多个实例，违反了单例的规定
        if (instance == null) {
            instance = new Singleton03();
        }

        return instance;
    }
}
