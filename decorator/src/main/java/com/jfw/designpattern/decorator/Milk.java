package com.jfw.designpattern.decorator;

/**
 * 具体的调料类。
 *
 * @author jfw
 * @date 2023-10-12
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDescription("牛奶");
        setPrice(2.0f);
    }
}
