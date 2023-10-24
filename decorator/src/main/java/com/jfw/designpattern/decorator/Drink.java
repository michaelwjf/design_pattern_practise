package com.jfw.designpattern.decorator;

/**
 * 抽象的主体类
 *
 * @author jfw
 * @date 2023-10-12
 */
public abstract class Drink {
    /**
     * 单品咖啡的描述
     */
    private String description;

    /**
     * 单品咖啡的价格
     */
    private float price = 0.0f;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算Drink费用的抽象方法
     * @return 总费用
     */
    public abstract float cost();
}
