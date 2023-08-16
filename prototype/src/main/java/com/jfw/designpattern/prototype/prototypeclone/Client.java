package com.jfw.designpattern.prototype.prototypeclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;

/**
 * 在这个类里面调用浅拷贝和深拷贝
 *
 * @author jfw
 * @date 2023-08-16
 */
public final class Client {
    private Client(){};
    public static void main(String[] args) throws IOException {

        // 先定义两个UserDefineObject对象，用来复制
        UserDefineObject cola = new UserDefineObject("Coca", "Cola");
        UserDefineObject berg = new UserDefineObject("Chicken", "Berg");

        // 在这里简单的将shallow2复制给shallow1，看里面的berg和cola是复制引用还是复制值
        SallowClonePrototype shallow1 = new SallowClonePrototype("cola and berg combo", cola, berg);
        SallowClonePrototype shallow2 = shallow1.clone();

        System.out.println("shallow copy, the hashcode of the user define object "
                + "should be the same");
        System.out.println(shallow1);
        System.out.println(shallow2);

        // 下面使用深拷贝
        // 方法一，使用重写的clone方法实现深拷贝
        DeepClonePrototype deep1 = new DeepClonePrototype("cola and berg combo",
                cola, berg);
        DeepClonePrototype deep2 = deep1.clone();

        System.out.println("deep copy method 1, the hashcode of the user "
                + "define object should be different");
        System.out.println(deep1);
        System.out.println(deep2);

        // 方法二，使用序列化和反序列化来实现深拷贝
        // 也可以把下面这些序列化反序列化的代码写到DeepClonePrototype的一个deepClone方法里面
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 先序列化
            // 创建bos和oos，将bos包在oos里面
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);

            // 把需要深拷贝的对象读斤oos里面，需要拷贝的对象也就读进了包在里面的bos了
            oos.writeObject(deep1);

            // 然后再反序列化
            // 创建bis和ois，将bis包在ois里面
            // 因为是要反序列化，所以这个bis应该创建自序列化之后的bos
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            // 反序列化后就得到深拷贝的对象了，当然，需要显式转换一下类型
            DeepClonePrototype deep3 = (DeepClonePrototype) ois.readObject();

            System.out.println("deep copy method 2, use serialize method, "
                    + "the hashcode of the user define object should be different");
            System.out.println(deep1);
            System.out.println(deep3);
        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            Objects.requireNonNull(bos).close();
            Objects.requireNonNull(oos).close();
            Objects.requireNonNull(bis).close();
            Objects.requireNonNull(ois).close();
        }

    }
}
