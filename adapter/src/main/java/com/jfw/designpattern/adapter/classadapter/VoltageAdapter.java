package com.jfw.designpattern.adapter.classadapter;

/**
 * 类适配器，Adapter类，继承src类，实现dst接口
 *
 * @author jfw
 * @date 2023-08-28
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    /**
     * 实现dst接口，需要将src中的输出220V电压转换为dst中的输出5V电压
     *
     * @return 输出电压5V
     */
    @Override
    public int output5V() {

        System.out.println("adapter开始转换");
        int srcVoltage = output220V();
        System.out.printf("src输出电压为: %d V %n", srcVoltage);

        int dstVoltage = srcVoltage / 44;
        System.out.println("adapter转换结束");
        System.out.printf("转换后的输出电压为: %d V %n", dstVoltage);

        return dstVoltage;
    }
}
