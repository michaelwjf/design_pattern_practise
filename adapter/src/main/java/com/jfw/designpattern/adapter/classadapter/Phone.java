package com.jfw.designpattern.adapter.classadapter;

/**
 * 需要依赖5V直流电进行充电
 *
 * @author jfw
 * @date 2023-08-28
 */
public class Phone {

    /**
     * 正常的充电电压为5V
     */
    private static final int CHARGE_VOL = 5;

    /**
     * 充电
     * @param voltage5V 接受一个5V的电压
     */
    public void charging(IVoltage5V voltage5V) {
        int chargeVoltage = voltage5V.output5V();
        // 判断一下电压能不能充电
        if (chargeVoltage == CHARGE_VOL) {
            System.out.println("电压为5V，可以充电");
        } else {
            System.out.printf("电压不正常 (电压为%dV)，不能充电", chargeVoltage);
        }
    }
}

