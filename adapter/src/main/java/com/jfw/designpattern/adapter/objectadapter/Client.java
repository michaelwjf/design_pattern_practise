package com.jfw.designpattern.adapter.objectadapter;

import com.jfw.designpattern.adapter.classadapter.Phone;
import com.jfw.designpattern.adapter.classadapter.Voltage220V;

/**
 * Client调度，在这个里面用调用adapter给Phone充电
 *
 * @author jfw
 * @date 2023-08-29
 */
public final class Client {

    private Client() {

    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        Voltage220V srcVoltage = new Voltage220V();
        phone.charging(new VoltageAdapter(srcVoltage));
    }
}
