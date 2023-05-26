package com.jfw.designpattern.buider.pattern;

/**
 * @author jfw
 * @date 2021-09-28
 *
 * Director角色，在这个里面实现建房的步骤的顺序，例如先做什么后做什么。
 */
public class HouseDirector {

    /**
     * 这个类里面因为要实现建房的动作，所以先要有一个houseBuilder对象
     */
    HouseBuilder houseBuilder = null;

    // 可以通过两种方式来初始化这个对象，一个是构造函数，一个是setter

    /**
     * 通过构造函数来初始化houseBuilder
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 通过setter来传入houseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何处理构建房子的流程，交给director
     */
    public House constractHouse() {
        this.houseBuilder.buildBase();
        this.houseBuilder.buildWall();
        this.houseBuilder.buildRoof();
        return this.houseBuilder.buildHouse();
    }
}
