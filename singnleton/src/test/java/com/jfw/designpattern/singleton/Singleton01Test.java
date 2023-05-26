package com.jfw.designpattern.singleton;

/**
 * @author jfw
 * @date 2021-07-12
 */
class Singleton01Test {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getInstance() {
        Singleton01 instance = Singleton01.getInstance();
        Singleton01 instance1 = Singleton01.getInstance();

        System.out.println(instance == instance1);
        System.out.println(String.format("The hash code of instance = %s",
                instance.hashCode()));
        System.out.println(String.format("the hash code of instance1 = %s",
                instance1.hashCode()));
    }
}