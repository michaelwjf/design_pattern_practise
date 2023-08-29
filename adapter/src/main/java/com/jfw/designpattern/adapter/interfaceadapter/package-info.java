/**
 * 接口适配器
 * <p/>
 * 参考类图interfaceAdapterUML所示。
 * <p/>
 * 当不需要实现接口中的所有方法的时候，可以用抽象的Adapter类来实现接口，
 * 然后在AbstractAdapter中对所有方法进行默认实现（空方法），
 * 然后用Adapter类依赖AbstractAdapter，并按照需要重写其中的方法。
 *
 * @author jfw
 * @date 2023-08-29
 */
package com.jfw.designpattern.adapter.interfaceadapter;