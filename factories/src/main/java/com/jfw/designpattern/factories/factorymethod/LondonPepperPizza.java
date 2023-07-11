package com.jfw.designpattern.factories.factorymethod;

import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 伦敦胡椒Pizza，继承自Pizza
 *
 * @author jfw
 * @date 2023-07-11
 */
public class LondonPepperPizza extends Pizza {
    /**
     * 为伦敦胡椒Pizza实现prepare方法
     */
    @Override
    public void prepare() {
        setName("伦敦胡椒Pizza");
        System.out.println("伦敦胡椒Pizza preparing");
    }
}
