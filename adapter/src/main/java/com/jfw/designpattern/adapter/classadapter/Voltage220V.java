package com.jfw.designpattern.adapter.classadapter;

/**
 * src类，原始的220V交流电，被适配的类
 *
 * @author jfw
 * @date 2023-08-28
 */
public class Voltage220V {

    /**
     * 输出220V电压
     */
    public int output220V() {
        int srcVoltage = 220;

        System.out.printf("原始电压输出: %d V%n", srcVoltage);

        return srcVoltage;
    }
}
