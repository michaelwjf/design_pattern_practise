/**
 * 工厂方法模式
 * <p>
 * Pizza项目的新需求： <br>
 * 本新需求在module-info的需求示例的基础上进行扩展。提出新需求如下： <br>
 * 客户在点Pizza时，可以点不同口味的Pizza。
 * 比如，北京的奶酪pizza、北京的胡椒pizza，或者是伦敦的奶酪pizza、伦敦的胡椒pizza
 * <p>
 * 本package使用工厂方法模式来实现上述新需求。<br>
 * UML类图参考FactoryMethodPizzaUML.puml
 * 其中的Pizza类延用withoutpattern里面定义的Pizza类，在这个包里面分别用4个类来继承他。
 *
 * @author jfw
 * @date 2023-07-11
 */
package com.jfw.designpattern.factories.factorymethod;