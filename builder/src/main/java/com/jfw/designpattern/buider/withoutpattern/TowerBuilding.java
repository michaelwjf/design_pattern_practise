package com.jfw.designpattern.buider.withoutpattern;

/**
 * @author jfw
 * @date 2021-09-28
 * <p/>
 * 高楼
 */
public class TowerBuilding extends House {
    /**
     * 打地基
     */
    @Override
    public void buildBase() {
        System.out.println("给高楼大厦打地基");
    }

    /**
     * 砌墙
     */
    @Override
    public void buildWall() {
        System.out.println("给高楼大厦砌墙");
    }

    /**
     * 修房顶
     */
    @Override
    public void buildRoof() {
        System.out.println("给高楼大厦建屋顶");
    }
}
