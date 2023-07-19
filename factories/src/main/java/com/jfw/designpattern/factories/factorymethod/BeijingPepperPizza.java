package com.jfw.designpattern.factories.factorymethod;

import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 北京胡椒Pizza，继承自Pizza
 *
 * @author jfw
 * @date 2023-07-11
 */
public class BeijingPepperPizza extends Pizza {

    /**
     * 为北京胡椒pizza实现prepare方法
     */
    @Override
    public void prepare() {
        setName("北京胡椒Pizza");
        System.out.println("北京胡椒Pizza Preparing");
    }
}
