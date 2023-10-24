package com.jfw.designpattern.bridge;

/**
 * 实现类接口，对应于Implementor
 *
 * @author jfw
 * @date 2023-09-25
 */
public interface Brand {
    /**
     * 开机
     */
    void on();

    /**
     * 打电话
     */
    void call();

    /**
     * 关机
     */
    void off();
}
