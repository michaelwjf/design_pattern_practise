/**
 * 抽象工厂模式
 * <p>
 * 定义一个interface，用于创建相关依赖关系的对象簇，而无需指明具体的类。
 * <p>
 * 抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合。<br>
 * 从设计层面看，抽象工厂模式就是对简单工厂模式的改进，或者称为进一步的抽象。<br>
 * 将工厂抽象成两层，AbsFactory（抽象工厂）和具体实现的工厂子类。
 * 程序员可以根据创建对象类型使用对应的工厂子类。这样将单个的简单工厂类变成了工厂簇，
 * 更利于代码的维护和扩展。
 * <p>
 * 需求示例参考simple factory和factory method中定义的需求示例。
 * 类图参考AbstractFactoryPizzaUML.puml
 * <p>
 * 根据类图，Pizza，BeijingCheesePizza, BeijingPepperPizza, LondonCheesePizza,
 * LondonPepper可以延用withoutpattern和factorymethod中的。
 *
 * @author jfw
 * @date 2023-07-12
 */
package com.jfw.designpattern.factories.abstractfactory;