/**
 * 使用decorator模式来解决需求示例中的咖啡订单问题。
 * <p/>
 * 装饰者模式，即动态地将新功能附加到对象上。
 * <p/>
 * 装饰者模式就像打包一个快递，<br>
 * 其主体是被装饰者，例如：衣服，花瓶等等。<br>
 * 其包装就是装饰者，例如：报纸填充，塑料泡沫，纸板，木板等等。
 * <p/>
 * 用decorator模式实现咖啡订单问题的类图如decorator-pattern.png所示。
 * <p/>
 * 其主体component，就是抽象的Drink类，是被装饰者。 <br>
 * 而concrete component，各个单品咖啡类，即具体的主体，继承了component。
 * 在这里是由Coffee类直接实现abstract Drink类，然后再由具体的单品咖啡继承Coffee类。 <br>
 * 而这里的装饰者Decorator，它跟主体的关系是继承+组合，既继承了Drink类，
 * 又包含一个Drink类成员。<br>
 * 具体的调料类则继承Decorator类。
 * <p/>
 *
 * @author jfw
 * @date 2023-10-12
 */
package com.jfw.designpattern.decorator;