/**
 * 在原型模式中，使用到了原型类的clone方法，
 * 然而，在java中，使用clone方法会面临浅拷贝和深拷贝的问题。
 * <p>
 * 所谓浅拷贝，就是指，在实现clone方法时，使用默认的clone方式。
 * 这种方式会直接复制基本数据类型和字符串的值，但是如果类属性不是基本数据类型，而是一个自定义类的话，
 * 根据java的特点，复制过去的就是一个引用。（参考示例SallowClonePrototype）。
 * 这样会有一个缺点，就是当修改了原始的自定义对象的值的时候，所有被复制的对象都会受到影响。
 * <p>
 * 而所谓深拷贝，就是在复制的时候将自定义属性也复制值，而不只是复制引用。
 * 这样，当修改了原始的自定义对象的值的时候，或者修改了某一个复制对象里面的自定义对象的值的时候，
 * 就不会使所有的复制对象都受影响。（参考示例DeepClonePrototype）。<br>
 * 而深拷贝又有两种实现方式：<br>
 * 第一种是重写clone方法，将自定义类型的复制显式地实现在clone方法里面。<br>
 * 第二种是利用对象序列化和反序列化的特点，（推荐使用）
 * java在将对象序列化的时候，会将对象里面所有能序列化的属性的值都序列化，
 * 然后在反序列化的时候再将这些属性的值反序列化，
 * 因此，利用这种特性，就可以实现复制值而不是复制引用。
 * <p></p>
 * 本package使用两个例子来介绍浅拷贝和深拷贝，其中的UserDefineObject是一个自定义类型。
 * 使用场景类似于销售的商品套餐，有一个套餐名，套餐里面包含两个商品，例如汉堡和可乐。
 * 不同的点单需要复制多个套餐，而每个套餐内部有需要复制多个汉堡和可乐。
 * 每个点单的实例都不应该一样，这时就可以看出深拷贝和浅拷贝的区别
 *
 * @author jfw
 * @date 2023-08-16
 */
package com.jfw.designpattern.prototype.prototypeclone;