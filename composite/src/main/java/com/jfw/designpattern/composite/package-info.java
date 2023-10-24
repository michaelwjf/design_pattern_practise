/**
 * 使用组合模式composite pattern来解决需求示例中的展示学校院系结构问题。
 * <p/>
 * 组合模式（composite pattern）创建了对象组的树形结构，将对象组合成树状结构
 * 以表示“整体-部分”的层次关系。<br>
 * 组合模式使得用户对单个对象和组合对象的访问具有一致性，
 * 即：组合能让用户以一致的方式处理个别对象以及组合对象。
 * <p/>
 * 组合模式的概念图如图composite-pattern.png
 * <p/>
 * 用组合模式解决学校院系结构展示问题的类图如图composite-pattern-UML.png
 * <p/>
 * 其中：<br>
 * 1. OrganizationComponent类即概念图中的Component，可以是接口，也可以是抽象类。
 * 定义了所有类共有的行为。<br>
 * 2. University类和College类即概念图中的Composite，组合模式中的node节点，
 * 实现了共有行为，当然也会有自己特有的一些实现。<br>
 * 3. Department类即概念图中的leaf节点，在他下面没有其他节点了，
 * 所以有些node节点中的功能leaf节点不需要有。
 * <p/>
 * 这样的好处是，整个树状结构中所有节点，都继承自同一个抽象基类或者接口，节点之间互相没有
 * 继承关系。
 * 基类中定义了各个节点共有的方法。而如果某个节点需要自己特有的方法，又可以通过重写方法实现。
 * 此时如果要增加删除或者修改节点，完全可以不影响其他节点。
 * 他们之间的调度，指需要调度者(Client)清楚其树状结构的关系即可。
 *
 * @author jfw
 * @date 2023-10-24
 */
package com.jfw.designpattern.composite;