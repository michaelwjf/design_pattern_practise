/**
 * 用传统的方式解决需求示例中的克隆羊的问题。
 * <p>
 * 优缺点：
 * <p>
 * 优点：比较好理解，简单已操作。<br>
 * 缺点：在创建新对象时，总是需要获取原始对象的属性，如果创建的对象比较复杂时，效率较低。
 * 总是需要重新初始化对象，而不是动态地获得对象运行时的状态，不够灵活
 * <p>
 * 改进的思路分析：<br>
 * Java中Object类是所有类的根类，Object类提供了一个clone()方法，
 * 该方法可以将一个Java对象复制一份，但是需要实现clone的java类必须要实现一个接口Cloneable,
 * 该接口表示该类能够复制并且具有复制的能力  ==> 原型模式
 *
 * @author jfw
 * @date 2023-07-25
 */
package com.jfw.designpattern.prototype.withoutpattern;