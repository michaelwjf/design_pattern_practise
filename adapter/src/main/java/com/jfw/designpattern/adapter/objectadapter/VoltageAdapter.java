package com.jfw.designpattern.adapter.objectadapter;

import com.jfw.designpattern.adapter.classadapter.IVoltage5V;
import com.jfw.designpattern.adapter.classadapter.Voltage220V;

/**
 * 对象适配器，Adapter类，持有src对象，实现dst接口
 *
 * @author jfw
 * @date 2023-08-29
 */
public class VoltageAdapter implements IVoltage5V {

    /**
     * 对象适配器中持有的src对象
     */
    private final Voltage220V srcVoltage;

    /**
     * 通过构造方法传入src
     */
    public VoltageAdapter(Voltage220V srcVoltage) {
        this.srcVoltage = srcVoltage;
    }

    /**
     * 实现dst接口，需要将src中的输出220V电压转换为dst中的输出5V电压
     *
     * @return 输出电压5V
     */
    @Override
    public int output5V() {
        System.out.println("使用对象适配器开始转换");
        if (srcVoltage != null) {
            int inputVoltage = srcVoltage.output220V();
            System.out.printf("src输出电压为: %d V %n", inputVoltage);

            int outputVoltage = inputVoltage / 44;
            System.out.println("adapter转换结束");
            System.out.printf("转换后的输出电压为: %d V %n", outputVoltage);

            return outputVoltage;
        } else {
            System.out.println("src初始化失败，adapter转换失败");
            return -1;
        }
    }
}
