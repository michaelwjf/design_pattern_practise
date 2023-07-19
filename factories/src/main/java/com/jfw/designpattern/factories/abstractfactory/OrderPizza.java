package com.jfw.designpattern.factories.abstractfactory;

import com.jfw.designpattern.factories.commonfunction.StaticComFunc;
import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 订购pizza类。
 * <p>
 * 这里接受一个AbsFactory实例并调用其createPizza方法来获得具体的Pizza类。
 * 并使用pizza类中的各种方法。
 *
 * @author jfw
 * @date 2023-07-13
 */
public class OrderPizza {

    public OrderPizza(AbsFactory absFactory) {
        getPizza(absFactory);
    }

    private void getPizza(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = StaticComFunc.getType();
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("invalid type, 订购失败");
                break;
            }
        } while (true);
    }
}
