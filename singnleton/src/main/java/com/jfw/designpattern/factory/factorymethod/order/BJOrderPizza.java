package com.jfw.designpattern.factory.factorymethod.order;

import com.jfw.designpattern.factory.factorymethod.pizza.BJCheesePizza;
import com.jfw.designpattern.factory.factorymethod.pizza.BJPepperPizza;
import com.jfw.designpattern.factory.factorymethod.pizza.Pizza;

/**
 * @author jfw
 * @date 2021-08-31
 */
public class BJOrderPizza extends OrderPizza{
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
                return new BJCheesePizza();
            case "pepper":
                return new BJPepperPizza();
            default:
                return null;
        }
    }
}
