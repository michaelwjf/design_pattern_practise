package com.jfw.designpattern.singleton;

/**
 * @author jfw
 * @date 2021-07-21
 *
 * 单例模式。枚举。
 * 使用枚举的方式来获得单例实例。
 * 因为枚举本身的特性决定了其属性有且仅有一个实例。所以可以利用这个特性来创建单例类。同时，
 * 枚举可以保证线程安全。并且，枚举类型只有在调用的时候才会加载，不会出现饿汉式那种不管有没有
 * 使用这个类都会先加载到内存中的浪费。
 * 枚举写法也是最简单的写法，强烈推荐使用。
 */
public enum Singleton06 {
    // 枚举的实例，只创建一个属性就可以了
    INSTANCE;

    /**
     * 在枚举中创建方法，枚举的实例就可以调用这些方法
     */
    public void sayHello() {
        System.out.println("hello");
    }
}
