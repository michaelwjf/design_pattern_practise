package com.jfw.designpattern.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author jfw
 * @date 2021-07-21
 */
class Singleton06Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEnum() {
        Singleton06 instance = Singleton06.INSTANCE;
        Singleton06 instance1 = Singleton06.INSTANCE;

        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());

        instance.sayHello();
        instance1.sayHello();
    }
}