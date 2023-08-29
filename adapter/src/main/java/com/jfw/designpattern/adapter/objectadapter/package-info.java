/**
 * 对象适配器应用实例。
 * <p/>
 * 还是以生活中充电器的例子来举例，充电器本身相当于Adapter, 220V交流电相当于src（即被适配者），
 * dst是5V直流电，使用对象适配器模式完成。<br>
 * 跟类适配器的代码实现主要区别其实就是在VoltageAdapter里面需要作一些修改。
 * <p/>
 * 其类图如objectAdapterUML所示。
 * <p/>
 * 优缺点：<br>
 * 使用组合代替继承，解决了类适配器必须继承src的局限性问题，也不再要求dst必须是接口。
 * 成本更低，更灵活。
 *
 * @author jfw
 * @date 2023-08-29
 */
package com.jfw.designpattern.adapter.objectadapter;