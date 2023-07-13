package com.jfw.designpattern.factories.abstractfactory;

import com.jfw.designpattern.factories.factorymethod.LondonCheesePizza;
import com.jfw.designpattern.factories.factorymethod.LondonPepperPizza;
import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 伦敦风味的pizza factory，实现AbsFactory接口，因此创建基于伦敦风味的pizza类型
 *
 * @author jfw
 * @date 2023-07-13
 */
public class LondonPizzaFactory implements AbsFactory {

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
            return new LondonCheesePizza();
        } else if ("pepper".equals(orderType)) {
            return new LondonPepperPizza();
        } else {
            return null;
        }
    }
}
