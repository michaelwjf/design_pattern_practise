package com.jfw.designpattern.factory.simplefactory;

/**
 * @author jfw
 * @date 2021-08-23
 */
public class GreekPizza extends Pizza{
    /**
     * 准备原材料
     */
    @Override
    public void prepare() {
        System.out.println(" 给制作Greek Pizza准备原材料 ");
    }
}
