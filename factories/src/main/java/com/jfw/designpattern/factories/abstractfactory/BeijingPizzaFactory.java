package com.jfw.designpattern.factories.abstractfactory;

import com.jfw.designpattern.factories.factorymethod.BeijingCheesePizza;
import com.jfw.designpattern.factories.factorymethod.BeijingPepperPizza;
import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 北京风味的pizza factory类，实现AbsFactory接口，因此创建基于北京风味的pizza类型
 *
 * @author jfw
 * @date 2023-07-13
 */
public class BeijingPizzaFactory implements AbsFactory {

    /**
     * 根据不同的orderType创建不同的pizza种类
     *
     * @param orderType 输入不同的pizza类型
     * @return Pizza
     */
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        if ("cheese".equals(orderType)) {
            return new BeijingCheesePizza();
        } else if ("pepper".equals(orderType)) {
            return new BeijingPepperPizza();
        } else {
            return null;
        }
    }
}
