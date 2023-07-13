package com.jfw.designpattern.factories.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jfw.designpattern.factories.commonfunction.StaticComFunc;
import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 使用聚合的方式，所以从外面传入一个simpleFactory对象，
 * 然后调用其createPizza方法根据输入的不同pizza类别创建不同的pizza。
 * 当然也可以用组合的方式，即在内部创建一个simpleFactory属性，
 * 总之就是要通过一个simpleFactory来创建pizza
 *
 * @author jfw
 * @date 2023-07-05
 */
public class OrderPizza {
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    private void setFactory(SimpleFactory factory) {
        if (factory == null) {
            System.out.println("need a simple factory object");
            return;
        }
        String orderType = "";
        Pizza pizza = null;

        do {
            orderType = StaticComFunc.getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                // pizza对象不为空表示订购pizza成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购pizza失败");
                break;
            }
        } while (true);

    }
}
