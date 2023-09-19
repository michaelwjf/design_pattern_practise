package com.jfw.designpattern.adapter.interfaceadapter;

/**
 * src接口，里面定义了一些方法。但不一定全部方法都需要被适配器使用。
 *
 * @author jfw
 * @date 2023-08-29
 */
public interface ISourceInterface {
    /**
     * 接口方法1
     */
    void operation1();

    /**
     * 接口方法2
     */
    void operation2();

    /**
     * 接口方法3
     */
    void operation3();

    /**
     * 接口方法4
     */
    void operation4();
}
