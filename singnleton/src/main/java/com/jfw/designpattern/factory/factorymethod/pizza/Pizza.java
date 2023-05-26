package com.jfw.designpattern.factory.factorymethod.pizza;

/**
 * @author jfw
 * @date 2021-08-31
 */
public abstract class Pizza {
    /**
     * pizza名字
     */
    protected String name;

    /**
     * 准备原材料
     */
    public abstract void prepare();

    public void bake() {
        System.out.printf("%s baking%n", this.name);
    }

    public void cut() {
        System.out.printf("%s cutting%n", this.name);
    }

    public void box() {
        System.out.printf("%s boxing%n", this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
