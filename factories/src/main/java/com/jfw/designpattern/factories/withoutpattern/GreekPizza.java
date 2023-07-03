package com.jfw.designpattern.factories.withoutpattern;

/**
 * 希腊pizza，继承自Pizza
 *
 * @author jfw
 * @date 2023-07-03
 */
public class GreekPizza extends Pizza {

    /**
     * 为希腊pizza实现prepare方法
     */
    @Override
    public void prepare() {
        System.out.println(" 希腊pizza preparing ");
        setName(" 希腊Pizza ");

    }

}
