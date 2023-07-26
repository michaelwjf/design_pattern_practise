/**
 * 使用原型模式解决需求示例中的克隆羊问题。
 * <p>
 * 根据传统方法中的思路分析，可以通过实现Cloneable接口来实现clone()方法，
 * 从而解决克隆羊问题。这种方式就叫做原型模式。
 * <p>
 * Java中Object类是所有类的根类，Object类提供了一个clone()方法，
 * 该方法可以将一个Java对象复制一份，但是需要实现clone的java类必须要实现一个接口Cloneable,
 * 该接口表示该类能够复制并且具有复制的能力  ==> 原型模式
 *
 * @author jfw
 * @date 2023-07-26
 */
package com.jfw.designpattern.prototype.pattern;