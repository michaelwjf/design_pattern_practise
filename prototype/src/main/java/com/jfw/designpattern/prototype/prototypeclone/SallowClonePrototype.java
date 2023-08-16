package com.jfw.designpattern.prototype.prototypeclone;

/**
 * 这个类用来介绍浅拷贝。
 * 这个类类似于销售的套餐，其中的属性comboName类似于套餐名，是String类型，
 * 在默认clone方法中时可以被复制值的。
 * 而剩余的两个UserDefineObject对象obj1和obj2类似于套餐中包含的产品，
 * 在默认的clone方法中只会被复制引用。
 *
 * @author jfw
 * @date 2023-08-16
 */
public class SallowClonePrototype implements Cloneable {
    private String comboName;
    private UserDefineObject obj1;
    private UserDefineObject obj2;

    public SallowClonePrototype(String comboName, UserDefineObject obj1, UserDefineObject obj2) {
        this.comboName = comboName;
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public String getComboName() {
        return comboName;
    }

    public void setComboName(String comboName) {
        this.comboName = comboName;
    }

    public UserDefineObject getObj1() {
        return obj1;
    }

    public void setObj1(UserDefineObject obj1) {
        this.obj1 = obj1;
    }

    public UserDefineObject getObj2() {
        return obj2;
    }

    public void setObj2(UserDefineObject obj2) {
        this.obj2 = obj2;
    }

    /**
     * 实现默认的clone方法，这样的拷贝就是浅拷贝，因为自定义对象属性只会复制引用
     */
    @Override
    public SallowClonePrototype clone() {
        try {
            SallowClonePrototype clone = (SallowClonePrototype) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return String.format("ShallowClone comboName = %s, obj1 = {%s}, obj2 = {%s}",
                comboName, obj1, obj2);
    }
}
