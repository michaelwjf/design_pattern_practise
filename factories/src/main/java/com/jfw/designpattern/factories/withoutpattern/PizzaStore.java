package com.jfw.designpattern.factories.withoutpattern;

/**
 * PizzaStore, 订购pizza
 * <p>
 * 优点： 比较好理解，简单易操作
 * <p>
 * 缺点： 违反了设计模式的ocp原则，即对扩展开放，对修改关闭。即当我们给类增加新功能的时候，
 * 尽量不修改代码，或者尽量少修改代码。然而如果采用目前的方式，当我们要新增一个Pizza种类的时候，
 * 我们需要在orderPizza类的代码中作修改，把新增加的Pizza种类添加进去。<br>
 * 然而OrderPizza可能不止一处，可能还有orderPizza2, orderPizza3等等，所以需要修改代码的地方
 * 就会比较多。
 * <p>
 * 改进思路分析： 修改代码可以接受，但是如果我们在其他地方也有创建pizza的代码，就意味着也需要修改，
 * 而创建Pizza的代码往往有多处。<br>
 * 所以可以尝试把Pizza对象封装到一个类中，这样我们有新的Pizza种类时，只需要修改该类即可，
 * 其他有创建到Pizza对象的代码就不需要修改了。这就是简单工厂模式的思路。
 *
 * @author jfw
 * @date 2023-07-03
 */
public class PizzaStore {
    /**
     * main function, 订购pizza
     */
    public static void main(String[] args) {
        new OrderPizza();
    }
}
