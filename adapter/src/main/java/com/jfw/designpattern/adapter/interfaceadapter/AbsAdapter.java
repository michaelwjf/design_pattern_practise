package com.jfw.designpattern.adapter.interfaceadapter;

/**
 * 抽象Adapter类，用空方法默认实现接口。
 * 这里一定要定义为abstract类，因为只有这样才能强制重写需要用到的方法。
 *
 * @author jfw
 * @date 2023-08-29
 */
public abstract class AbsAdapter implements ISourceInterface {
    /**
     * 接口方法1
     */
    @Override
    public void operation1() {

    }

    /**
     * 接口方法2
     */
    @Override
    public void operation2() {

    }

    /**
     * 接口方法3
     */
    @Override
    public void operation3() {

    }

    /**
     * 接口方法4
     */
    @Override
    public void operation4() {

    }
}
