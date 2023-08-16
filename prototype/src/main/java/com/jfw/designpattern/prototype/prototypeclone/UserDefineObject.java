package com.jfw.designpattern.prototype.prototypeclone;

import java.io.Serial;
import java.io.Serializable;

/**
 * 这是一个自定义的类型，深拷贝和浅拷贝的示例都会对这个类的对象进行拷贝。
 * 其中包含两个属性，name和type，假设这个类就类似于超市货架上的商品，
 * 而它的实例就是一个个的商品实例。name就类似商品名，type类似商品类型。
 * <p></p>
 * 这里实现Serializable接口使这个类可以序列化，实现Cloneable接口以实现clone方法。
 *
 * @author jfw
 * @date 2023-08-16
 */
public class UserDefineObject implements Serializable, Cloneable {
    /**
     * 实现Serializable接口，使这个类可以序列化，需要一个serialVersionUID
     */
    @Serial
    private static final long serialVersionUID = -1346392020378994059L;

    private String name;
    private String type;


    public UserDefineObject(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 实现默认的clone方法，使这个类本身可以被复制。因为这个类包含的属性都是基本类型的，
     * 所以其本身不需要区分深拷贝和浅拷贝
     */
    @Override
    public UserDefineObject clone() {
        try {
            UserDefineObject clone = (UserDefineObject) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return String.format("UDO name = %s, UDO type = %s, hashcode = %s",
                name, type, this.hashCode());
    }
}
