package com.jfw.designpattern.buider.pattern;

/**
 * @author jfw
 * @date 2021-09-28
 *
 * ConcreteBuilder角色，在这个类里面实现具体的建房步骤
 */
public class CommonBuilding extends HouseBuilder{
    /**
     * 打地基
     */
    @Override
    public void buildBase() {
        System.out.println("给普通房子打地基");
    }

    /**
     * 砌墙
     */
    @Override
    public void buildWall() {
        System.out.println("给普通房子砌墙");
    }

    /**
     * 修房顶
     */
    @Override
    public void buildRoof() {
        System.out.println("给普通房子修房顶");
    }
}
