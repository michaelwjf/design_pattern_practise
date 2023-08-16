package com.jfw.designpattern.prototype.pattern;

/**
 * @author jfw
 * @date 2023-07-26
 */
public class Client {
    public static void main(String[] args) {
        Sheep1 sheep1 = new Sheep1("Tom", 1, "white");
        Sheep1 sheep2 = sheep1.clone();
        Sheep1 sheep3 = sheep1.clone();
        Sheep1 sheep4 = sheep1.clone();
        Sheep1 sheep5 = sheep1.clone();
        Sheep1 sheep6 = sheep1.clone();
        Sheep1 sheep7 = sheep1.clone();
        Sheep1 sheep8 = sheep1.clone();
        Sheep1 sheep9 = sheep1.clone();

        System.out.println("sheep1 hashcode = " + sheep1.hashCode() + sheep1);
        System.out.println("sheep2 hashcode = " + sheep2.hashCode() + sheep2);
        System.out.println("sheep3 hashcode = " + sheep3.hashCode() + sheep3);
        System.out.println("sheep4 hashcode = " + sheep4.hashCode() + sheep4);
        System.out.println("sheep5 hashcode = " + sheep5.hashCode() + sheep5);
        System.out.println("sheep6 hashcode = " + sheep6.hashCode() + sheep6);
        System.out.println("sheep7 hashcode = " + sheep7.hashCode() + sheep7);
        System.out.println("sheep8 hashcode = " + sheep8.hashCode() + sheep8);
        System.out.println("sheep9 hashcode = " + sheep9.hashCode() + sheep9);


    }
}
