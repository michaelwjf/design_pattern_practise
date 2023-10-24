/**
 * Bridge模式是指，将实现与抽象放在两个不同的类层次中，是两个层次可以独立改变。<br>
 * 其主要特点是把抽象与实现分离开来，从而可以保持各部分的独立性，以及应对他们的功能扩展。
 * <p/>
 * Bridge模式原理类图如bridge-concept.puml所示。
 * <p/>
 * 其中：<br>
 * Client类：bridge模式的调用者。<br>
 * 抽象类Abstraction：维护了 Implementor，二者是聚合关系。Abstraction充当桥接类。<br>
 * RefinedAbstraction：是Abstraction抽象类的子类。<br>
 * Implementor：行为实现类的接口。<br>
 * ConcreteImplementorA/B：行为的具体实现类。<br>
 * <p/>
 *
 * 使用桥接模式解决手机操作未提的类图如bridge-pattern.puml所示。
 * <p/>
 * 可以看到，具体的开机，打电话，关机等操作都是由ConcreteImplementorA/B类，即Xiaomi,
 * Vivo来实现的。<br>
 * 而在Phone类，相当于Abstraction类，虽然里面也有on, off, call，但其实是在调用Implementor
 * 即Brand接口里面的实现。
 * 而RefinedAbstraction类，即FoldedPhone, UpRightPhone，虽然里面也有on, off, call，
 * 但其实也是在调用其父类的实现，从而间接调用Implementor接口的实现。
 * <p/>
 * 这样做的好处是，当我们需要再增加一个品牌，比如Huawei的时候，只需要使其实现Brand接口即可。
 * 而Abstraction类不需要做任何修改。就可以直接在Client中调用新增的品牌了。
 * 而同样，当我们要新增一种手机样式，比如新增加旋转手机的时候，只需要使其继承Phone类即可，
 * 不需要再专门为每个品牌都增加这个样式，即可在client中调用。
 * <p/>
 * Bridge模式的常见应用场景：
 * <p/>
 * 银行转账系统：<br>
 * 转账分类：网上转账，柜台转账，AMT转账。<br>
 * 转账用户类型：普通用户，银卡用户，金卡用户... <br>
 * <p/>
 * 消息管理：<br>
 * 消息类型：即时消息，延时消息。<br>
 * 消息分类：手机短信，邮件消息，QQ消息... <br>
 *
 * @author jfw
 * @date 2023-09-25
 */
package com.jfw.designpattern.bridge;