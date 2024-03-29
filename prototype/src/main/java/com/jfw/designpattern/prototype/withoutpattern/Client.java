package com.jfw.designpattern.prototype.withoutpattern;

/**
 * Client class for the without pattern
 *
 * @author jfw
 * @date 2023-07-25
 */
public class Client {
    private Client() {

    }
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");

        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep6 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep7 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep8 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep9 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep.toString());
        System.out.println(sheep1.toString());
        System.out.println(sheep2.toString());
        System.out.println(sheep3.toString());
        System.out.println(sheep4.toString());
        System.out.println(sheep5.toString());
        System.out.println(sheep6.toString());
        System.out.println(sheep7.toString());
        System.out.println(sheep8.toString());
        System.out.println(sheep9.toString());
    }
}
