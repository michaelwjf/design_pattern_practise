package com.jfw.designpattern.singleton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author jfw
 * @date 2021-07-21
 */
class SingletonX06Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEnum() {
        SingletonX06 instance = SingletonX06.INSTANCE;
        SingletonX06 instance1 = SingletonX06.INSTANCE;

        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());

        instance.sayHello();
        instance1.sayHello();
    }
}