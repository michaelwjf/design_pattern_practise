package com.jfw.designpattern.factories.simplefactory;

import com.jfw.designpattern.factories.withoutpattern.CheesePizza;
import com.jfw.designpattern.factories.withoutpattern.GreekPizza;
import com.jfw.designpattern.factories.withoutpattern.PepperPizza;
import com.jfw.designpattern.factories.withoutpattern.Pizza;

/**
 * 创建一个简单工厂类，将所有订购不同种类pizza相关的操作都在这个类里面实现
 * <p>
 * 这个类也可以是静态类，即，把里面的createPizza方法定义为静态方法，
 * 这样在用这个工厂类创建pizza的时候就不需要先实例化这个类了。
 *
 * @author jfw
 * @date 2023-07-04
 */
public class SimpleFactory {

    /**
     * 根据不同的orderType, 创建不同种类的pizza
     * <p>
     * 因为Pizza类和不同种类的Pizza之间的关系不变，
     * 所以还是利用withoutpattern里面的各个Pizza类
     *
     * @param orderType String pizza type, e.g. greek, cheese, pepper
     * @return pizza
     */
    public Pizza createPizza(String orderType) {
        System.out.println(" 使用简单工厂模式 ");
        switch (orderType) {
            case "greek":
                return new GreekPizza();
            case "cheese":
                return new CheesePizza();
            case "pepper":
                return new PepperPizza();
            default:
                return null;
        }
    }

    /**
     * 静态的createPizza方法，这样的话这个简单工厂类就变成了一个静态类，
     * 在调用这个方法创建pizza的时候就不需要先实例化这个类了。
     * @param orderType String pizza type, e.g. greek, cheese, pepper
     * @return pizza
     */
    public static Pizza createPizza2(String orderType) {
        System.out.println(" 使用简单工厂模式的静态方法 ");
        switch (orderType) {
            case "greek":
                return new GreekPizza();
            case "cheese":
                return new CheesePizza();
            case "pepper":
                return new PepperPizza();
            default:
                return null;
        }
    }
}
