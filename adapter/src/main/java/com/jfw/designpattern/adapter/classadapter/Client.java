package com.jfw.designpattern.adapter.classadapter;

/**
 * Client调度，在这个里面用调用adapter给Phone充电
 *
 * @author jfw
 * @date 2023-08-28
 */
public final class Client {

    /**
     * 隐藏构造器
     */
    private Client() {

    }

    public static void main(String[] args) {
        Phone phone = new Phone();

        // charging本来是接受一个5V输出的电压充电的，但是现在给他一个adapter，里面将
        // 220V的电压转换为了5V
        phone.charging(new VoltageAdapter());
    }
}
