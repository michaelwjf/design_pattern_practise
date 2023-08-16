package com.jfw.designpattern.prototype.prototypeclone;

import java.io.Serial;
import java.io.Serializable;

/**
 * 这个类用来演示深拷贝。
 * <p></p>
 * 用两种方式实现深拷贝：<br>
 * 一个是重写clone方法，在里面加入对自定义对象的拷贝，<br>
 * 另一个是使用序列化。使用序列化的话只需要使这个类本身实现Serializable接口即可，
 * 无需在类里面实现其他额外的方法，推荐使用。
 *
 * @author jfw
 * @date 2023-08-16
 */
public class DeepClonePrototype implements Cloneable, Serializable {
    /**
     * 实现Serializable接口，使这个类可以序列化，需要一个serialVersionUID
     */
    @Serial
    private static final long serialVersionUID = -5168582985083219509L;
    private String comboName;
    private UserDefineObject obj1;
    private UserDefineObject obj2;

    public DeepClonePrototype(String comboName, UserDefineObject obj1, UserDefineObject obj2) {
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
     * 使用方法一，重写自定义的clone方法，实现UserDefineObject属性的值复制。
     */
    @Override
    public DeepClonePrototype clone() {
        try {
            DeepClonePrototype clone = (DeepClonePrototype) super.clone();
            // 调用obj1和obj2属性的clone方法，
            // 因为UserDefineObject的对象里面没有其他非基本数据类型的属性，
            // 所以可以直接调用其clone方法来复制值
            clone.obj1 = this.obj1.clone();
            clone.obj2 = this.obj2.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return String.format("DeepClone comboName = %s, obj1 = {%s}, obj2 = {%s}",
                comboName, obj1, obj2);
    }
}
