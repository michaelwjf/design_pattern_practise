package com.jfw.designpattern.decorator;

/**
 * 装饰者类。跟被装饰者的关系是继承和组合的关系。所以包含一个被装饰者成员。
 *
 * @author jfw
 * @date 2023-10-12
 */
public class Decorator extends Drink {
    /**
     * 被装饰者成员
     */
    private final Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    /**
     * 计算Drink费用的抽象方法
     *
     * @return 咖啡+调料的费用
     */
    @Override
    public float cost() {
        // 这里需要返回自己的价格+被装饰者的总费用
        return getPrice() + obj.cost();
    }

    /**
     * 重写getDescription，输出装饰者和被装饰者的信息
     * @return 装饰者和被装饰者的信息
     */
    @Override
    public String getDescription() {
        return String.format("%s %.1f && %s", super.getDescription(),
                super.getPrice(), obj.getDescription());
    }
}
