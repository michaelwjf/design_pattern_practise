package com.jfw.designpattern.buider.pattern;

/**
 * @author jfw
 * @date 2021-09-28
 *
 * 对应的角色为Builder，抽象的建造者。
 * 这个类里面需要把House这个产品组合出来
 */
public abstract class HouseBuilder {

    /**
     * 这就是那个产品
     */
    protected House house = new House();

    // 组合产品建造房子

    /**
     * 打地基
     */
    public abstract void buildBase();

    /**
     * 砌墙
     */
    public abstract void buildWall();

    /**
     * 修房顶
     */
    public abstract void buildRoof();

    /**
     * 建房，即拿到建好的house产品
     * @return house产品
     */
    public House buildHouse() {
        return this.house;
    }
}
