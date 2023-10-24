package com.jfw.designpattern.decorator;

/**
 * 具体的调料类。
 *
 * @author jfw
 * @date 2023-10-12
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDescription("豆浆");
        setPrice(1.5f);
    }
}
