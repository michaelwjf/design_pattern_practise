package com.jfw.designpattern.buider.withoutpattern;

/**
 * @author jfw
 * @date 2021-09-28
 * <p/>
 * 客户端，用来调用不同的房子类
 */
public class Client {
    public static void main(String[] args) {
        // 建造普通房子
        CommonBuilding commonBuilding = new CommonBuilding();
        commonBuilding.build();
    }
}
