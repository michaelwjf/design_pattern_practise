package com.jfw.designpattern.buider.pattern;

/**
 * 对应角色为Product，定义产品，产品该有的属性都可以在这个产品里面。
 * <p/>
 * 这里产品是一个房子，那么房子该有的属性都在里面，比如地基，墙，屋顶等。
 *
 * @author jfw
 * @date 2021-09-28
 */
public class House {
    private String base;
    private String wall;
    private String roof;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}
