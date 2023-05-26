package com.jfw.designpattern.buider.withoutpattern;

/**
 * @author jfw
 * @date 2021-09-28
 * <p/>
 * 建普通房。
 */
public class CommonBuilding extends House{
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
        System.out.println("给普通房子修屋顶");
    }
}
