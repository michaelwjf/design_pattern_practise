package com.jfw.designpattern.factories.withoutpattern;

/**
 * 奶酪Pizza, 继承自Pizza
 *
 * @author jfw
 * @date 2023-07-03
 */
public class CheesePizza extends Pizza {

    /**
     * 为奶酪pizza实现prepare方法
     */
    @Override
    public void prepare() {
        System.out.println(" 奶酪Pizza preparing ");
        setName(" 奶酪Pizza ");
    }
}
