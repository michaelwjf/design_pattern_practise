package com.jfw.designpattern.factories.factorymethod;

import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 北京奶酪pizza，继承自Pizza
 *
 * @author jfw
 * @date 2023-07-11
 */
public class BeijingCheesePizza extends Pizza {
    /**
     * 为北京奶酪pizza实现prepare方法
     */
    @Override
    public void prepare() {
        setName("北京奶酪Pizza");
        System.out.println("北京奶酪Pizza preparing");
    }
}
