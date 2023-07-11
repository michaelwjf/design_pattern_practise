package com.jfw.designpattern.factories.factorymethod;

import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 用于订购北京风味pizza的OrderPizza类，继承自OrderPizza，
 * 需要按北京风味要求实现其抽象方法
 *
 * @author jfw
 * @date 2023-07-11
 */
public class BeijingOrderPizza extends OrderPizza {
    /**
     * 创建Pizza
     * <p>
     * 具体实现方法由其继承的类根据不同的需求来实现，以返回不同类型的Pizza
     * <p>
     * 这里需要实现北京风味的pizza，所以根据不同orderType种类，返回不同的北京风味pizza
     *
     * @param orderType 输入pizza的种类
     * @return 不同类型的Pizza
     */
    @Override
    Pizza createPizza(String orderType) {
        if ("cheese".equals(orderType)) {
            return new BeijingCheesePizza();
        } else if ("pepper".equals(orderType)) {
            return new BeijingPepperPizza();
        }
        return null;
    }
}
