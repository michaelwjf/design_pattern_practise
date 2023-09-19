/**
 * 类适配器模式的应用实例。
 * <p/>
 * 以生活中充电器的例子来讲解适配器，充电器本身相当于Adapter，
 * 220V交流电相当于src（即被适配者），我们的dst（即目标）是5V直流电。<br>
 * 其类图如classAdapterUML所示。
 * <p/>
 * 优缺点：<br>
 * 优点：由于其继承了src类，所以他可以根据需求重写src类的方法，使得adapter的灵活性增加。
 * 缺点：<br>
 * 1. Java是单继承机制，所以类适配器需要继承src类，这是一个缺点，因为这要求dst必须是接口，
 * 有一定局限性。<br>
 * 2. src类的方法在adapter中都会暴露出来，也增加了使用的成本。
 *
 * @author jfw
 * @date 2023-08-25
 */
package com.jfw.designpattern.adapter.classadapter;