/**
 * @author jfw
 * @date 2021-08-18
 *
 * 这个包中的类主要用来试验简单工厂模式。
 * <p>
 * 简单工厂模式是一种创建型模式，是工厂模式的一种。简单工厂模式是由一个工厂对象决定创建出哪
 * 一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式。
 * 简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行为（代码）
 * <p>
 *
 * 需求：需要一个Pizza类，里面包括prepare, bake, cut, box等方法。GreekPizza,
 * CheesePizza 继承Pizza类，但是有各自不同的特性。订购pizza类可以订购pizza。
 * 使用简单工厂模式。
 */
package com.jfw.designpattern.factory.simplefactory;