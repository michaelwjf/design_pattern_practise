package com.jfw.designpattern.factories.abstractfactory;

import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 创建一个AbsFactory接口，里面包含createPizza方法。
 * createPizza方法具体由实现这个接口的factory类来实现。
 * 在本例中，由北京风味的pizza factory和伦敦风味的pizza factory来分别实现这个factory接口。
 * 因此可以得到基于北京风味的不同pizza类型和基于伦敦风味的不同pizza类型。
 *
 * @author jfw
 * @date 2023-07-13
 */
public interface AbsFactory {
    /**
     * 根据不同的orderType创建不同的pizza种类
     * @param orderType 输入不同的pizza类型
     * @return Pizza
     */
    Pizza createPizza(String orderType);
}
