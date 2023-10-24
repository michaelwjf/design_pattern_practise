package com.jfw.designpattern.decorator;

/**
 * 具体的单品咖啡
 *
 * @author jfw
 * @date 2023-10-12
 */
public class Espresso extends Coffee {
    public Espresso() {
        setDescription("意大利咖啡");
        // Espresso的单价为6
        setPrice(6.0f);
    }
}
