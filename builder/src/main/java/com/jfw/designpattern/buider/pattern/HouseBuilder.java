package com.jfw.designpattern.buider.pattern;

/**
 * 对应的角色为Builder，抽象的建造者。
 * <p/>
 * 这个类里面需要把House这个产品组合出来。<br>
 * 所谓的组合，就是说在这个建造者里面定义一个产品，
 * 然后通过抽象的方法，把这个产品的各个属性给填充起来，
 * 最后通过getResult或者build方法，返回这个产品。
 * <p/>
 * 所以，builder就是在其内部定义把产品给建造出来的这么一个抽象类。
 *
 * @author jfw
 * @date 2021-09-28
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
     * 建房，即拿到建好的house产品 <br>
     * 经过建房的步骤之后，房子建好了，所以把房子这个产品返回
     * @return house产品
     */
    public House buildHouse() {
        return this.house;
    }
}
