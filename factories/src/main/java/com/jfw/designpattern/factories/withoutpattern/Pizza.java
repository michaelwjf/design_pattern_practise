package com.jfw.designpattern.factories.withoutpattern;

/**
 * 一个Pizza类，里面包含Pizza制作的步骤prepare, bake, cut, box等。
 * 因为需要适配不同的Pizza种类，所以把Pizza类做成abstract的，让具体继承这个类的类来实现其
 * abstract方法。
 *
 * @author jfw
 * @date 2023-07-03
 */
public abstract class Pizza {

    /**
     * the name of Pizza
     */
    protected String name;

    /**
     * 制作步骤之prepare <br>
     * 为了适配不同的Pizza种类，将这个方法做成抽象的，让继承者来具体实现其方法
     */
    public abstract void prepare();

    /**
     * 制作步骤之bake
     */
    public void bake() {
        System.out.println(name + " baking ");
    }

    /**
     * 制作步骤之cut
     */
    public void cut() {
        System.out.println(name + " cutting ");
    }

    /**
     * 制作步骤之box
     */
    public void box() {
        System.out.println(name + " boxing ");
    }

    /**
     * set the name of the pizza
     * @param name the name of the pizza
     */
    public void setName(String name) {
        this.name = name;
    }


}
