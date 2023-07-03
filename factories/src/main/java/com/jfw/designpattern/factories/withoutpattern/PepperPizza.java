package com.jfw.designpattern.factories.withoutpattern;

/**
 * 新增加一个PepperPizza胡椒pizza, 继承自Pizza
 *
 * @author jfw
 * @date 2023-07-03
 */
public class PepperPizza extends Pizza {

    /**
     * 为胡椒pizza实现prepare方法
     */
    @Override
    public void prepare() {
        System.out.println(" 胡椒Pizza preparing ");
        setName(" 胡椒Pizza ");
    }
}
