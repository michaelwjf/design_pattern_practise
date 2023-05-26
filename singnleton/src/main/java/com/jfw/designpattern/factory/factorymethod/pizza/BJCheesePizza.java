package com.jfw.designpattern.factory.factorymethod.pizza;

/**
 * @author jfw
 * @date 2021-08-31
 */
public class BJCheesePizza extends Pizza {

    /**
     * 准备原材料
     */
    @Override
    public void prepare() {
        setName("北京Cheese Pizza");
        System.out.println("为制作北京Cheese Pizza准备原材料");
    }
}
