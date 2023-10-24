package com.jfw.designpattern.decorator;

/**
 * client类，调用Coffee和调料进行点单
 *
 * @author jfw
 * @date 2023-10-12
 */
public final class CoffeeBar {
    private CoffeeBar() {

    }
    public static void main(String[] args) {
        // 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

        // 1. 先点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1 = " + order.cost());
        System.out.println("描述 = " + order.getDescription());

        // 2. order中加入一份牛奶
        order = new Milk(order);
        System.out.println("order加入一份牛奶 费用 = " + order.cost());
        System.out.println("order加入一份牛奶 描述 = " + order.getDescription());

        // 3. order中加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份巧克力 费用 = " + order.cost());
        System.out.println("order加入一份巧克力 描述 = " + order.getDescription());

        // 4. order中再加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份巧克力 费用 = " + order.cost());
        System.out.println("order加入一份巧克力 描述 = " + order.getDescription());

    }
}
