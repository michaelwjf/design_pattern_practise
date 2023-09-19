package com.jfw.designpattern.adapter.classadapter;

/**
 * dst类，输出电压为5V，适配接口
 *
 * @author jfw
 * @date 2023-08-28
 */
public interface IVoltage5V {
    /**
     * 输出5V
     * @return 输出电压5V
     */
    int output5V();
}
