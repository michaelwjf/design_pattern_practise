package com.jfw.designpattern.prototype.withoutpattern;

/**
 * The Sheep Class, as the requirement,
 * include the attribute name, age and color
 *
 * @author jfw
 * @date 2023-07-25
 */
public class Sheep {
    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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
        return "Sheep{"
                + "name='" + name + '\''
                + ", age=" + age
                + ", color='" + color + '\''
                + '}';
    }
}
