/**
 * @author jfw
 * @date 2021-08-24
 *
 * 新需求：客户在点披萨时，可以点不同口味的pizza，例如，北京的奶酪pizza，北京的胡椒pizza，
 * 后者伦敦的奶酪pizza，伦敦的胡椒pizza。
 * <p>
 * 工厂方法模式设计方案：将pizza项目的实例化功能抽象成抽象方法，在不同的口味点餐子类追踪
 * 具体实现。
 * <p>
 * 工厂方法模式：定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式的核心是
 * 将对象的实例化推迟到子类中。
 */
package com.jfw.designpattern.factory.factorymethod;