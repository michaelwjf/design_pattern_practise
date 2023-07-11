package com.jfw.designpattern.factories.factorymethod;

import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 伦敦奶酪Pizza，继承自Pizza
 *
 * @author jfw
 * @date 2023-07-11
 */
public class LondonCheesePizza extends Pizza {
    /**
     * 为伦敦奶酪Pizza实现prepare方法
     */
    @Override
    public void prepare() {
        setName("伦敦奶酪Pizza");
        System.out.println("伦敦奶酪Pizza preparing");
    }
}
