package com.jfw.designpattern.factory.factorymethod.order;

import com.jfw.designpattern.factory.factorymethod.pizza.LondonCheesePizza;
import com.jfw.designpattern.factory.factorymethod.pizza.LondonPepperPizza;
import com.jfw.designpattern.factory.factorymethod.pizza.Pizza;

/**
 * @author jfw
 * @date 2021-08-31
 */
public class LondonOrderPizza extends OrderPizza{
    /**
     * 创建Pizza类
     *
     * @param orderType String类型的pizza口味
     * @return Pizza
     */
    @Override
    Pizza createPizza(String orderType) {
        switch (orderType.toLowerCase()) {
            case "cheese":
                return new LondonCheesePizza();
            case "pepper":
                return new LondonPepperPizza();
            default:
                return null;
        }
    }
}
