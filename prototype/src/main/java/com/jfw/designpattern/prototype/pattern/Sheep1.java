package com.jfw.designpattern.prototype.pattern;

/**
 * @see com.jfw.designpattern.prototype.withoutpattern.Sheep
 * @author jfw
 * @date 2023-07-26
 * <p>
 * updated Sheep class to implement the interface Cloneable
 */
public class Sheep1 implements Cloneable {
    private String name;
    private int age;
    private String color;

    public Sheep1(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * 实现默认的clone方法，复制该实例的属性
     */
    @Override
    public Sheep1 clone() {
        try {
            return (Sheep1) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep1{"
                + "name='" + name + '\''
                + ", age=" + age
                + ", color='" + color + '\''
                + '}';
    }
}
