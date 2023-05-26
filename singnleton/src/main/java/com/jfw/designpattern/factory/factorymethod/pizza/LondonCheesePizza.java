package com.jfw.designpattern.factory.factorymethod.pizza;

/**
 * @author jfw
 * @date 2021-08-31
 */
public class LondonCheesePizza extends Pizza {

    /**
     * 准备原材料
     */
    @Override
    public void prepare() {
        setName("伦敦Cheese Pizza");
        System.out.println("为制作伦敦Cheese Pizza准备原材料");
    }
}
