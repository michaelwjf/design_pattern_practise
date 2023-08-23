/**
 * 使用建造者模式来实现需求。
 * <p/>
 * 通过使用和不实用builder pattern的两个类图其实就可以看出来，
 * 建造者模式相对于传统方法，主要有以下区别：<br>
 * 在传统模式中，虽然把House（即Product）抽象了出来，
 * 但是在这个抽象的产品里面，还是集成了这个产品的建造方法，甚至是建造步骤（建造的先后顺序）。<br>
 * 而在建造者模式中，产品、产品的建造方法以及产品的建造步骤被剥离开了。<br>
 * 产品就是产品（House），里面只包含产品属性本身。<br>
 * 而抽象的Builder层里面定义产品的建造方法，当然这些方法都是抽象的，
 * 具体的实现由具体builder来定义，比如commonBuilding和towerBuilding。<br>
 * 产品的建造步骤则交给了Director来实现。
 * <p/>
 * 这样的话，想要调整建造步骤则只需要调整director，
 * 而想要建造不同的产品则将不同产品的具体建造方法传给director。
 * 想要改产品的建造方法则直接去修改具体builder或者抽象builder，不会影响到产品本身。
 *
 * @author jfw
 * @date 2021-09-28
 */
package com.jfw.designpattern.buider.pattern;