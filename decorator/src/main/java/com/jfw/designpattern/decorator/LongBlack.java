package com.jfw.designpattern.decorator;

/**
 * 具体的单品咖啡
 *
 * @author jfw
 * @date 2023-10-12
 */
public class LongBlack extends Coffee {
    public LongBlack() {
        setDescription("Long Black");
        // Long black单价5
        setPrice(5.0f);
    }
}
