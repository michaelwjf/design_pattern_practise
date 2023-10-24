package com.jfw.designpattern.decorator;

/**
 * Coffee类实现抽象的主体类。<br>
 * 即，Coffee是Drink的一种具体划分，具体实现抽象主体的某些特定功能。<br>
 * 而后续的单品咖啡则可以直接继承Coffee类来实现具体的单品
 *
 * @author jfw
 * @date 2023-10-12
 */
public class Coffee extends Drink {
    /**
     * 计算Drink费用的抽象方法
     *
     * @return 总费用
     */
    @Override
    public float cost() {
        // 这里的实现方式就是直接返回咖啡的价格即可
        return super.getPrice();
    }
}
