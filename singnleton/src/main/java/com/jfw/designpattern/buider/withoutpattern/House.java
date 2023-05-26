package com.jfw.designpattern.buider.withoutpattern;

/**
 * @author jfw
 * @date 2021-09-28
 * <p/>
 * 抽象类，定义了打地基，砌墙和修房顶的方法。
 * 定义了建房的方法，用来组合建房的所有流程
 */
public abstract class House {
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
     * 建房
     */
    public void build() {
        buildBase();
        buildWall();
        buildRoof();
    }

}
