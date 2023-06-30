package com.jfw.designpattern.singleton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author jfw
 * @date 2021-07-21
 */
class Singleton08Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEnum() {
        Singleton08 instance = Singleton08.INSTANCE;
        Singleton08 instance1 = Singleton08.INSTANCE;

        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());

        instance.sayHello();
        instance1.sayHello();
    }
}