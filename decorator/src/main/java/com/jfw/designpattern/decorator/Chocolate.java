package com.jfw.designpattern.decorator;

/**
 * 具体的调料类。
 * 因为这些具体的调料其实也是Drink的一种，所以继承Drink类。
 *
 * @author jfw
 * @date 2023-10-12
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDescription("巧克力");
        setPrice(3.0f);
    }
}
