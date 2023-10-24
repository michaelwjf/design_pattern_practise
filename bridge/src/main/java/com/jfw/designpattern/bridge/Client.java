package com.jfw.designpattern.bridge;

/**
 * Client类：bridge模式的调用者
 *
 * @author jfw
 * @date 2023-09-25
 */
public final class Client {
    private Client() {
    }

    public static void main(String[] args) {
        // 获取折叠手机 样式+品牌
        Phone phone1 = new FoldedPhone(new Xiaomi());
        phone1.on();
        phone1.call();
        phone1.off();

        System.out.println("============================================");

        // 获取折叠手机 样式+品牌
        Phone phone2 = new FoldedPhone(new Vivo());
        phone2.on();
        phone2.call();
        phone2.off();

        System.out.println("============================================");

        // 获取直板手机 样式+品牌
        Phone phone3 = new UpRightPhone(new Xiaomi());
        phone3.on();
        phone3.call();
        phone3.off();

        System.out.println("============================================");

        // 获取直板手机 样式+品牌
        Phone phone4 = new UpRightPhone(new Vivo());
        phone4.on();
        phone4.call();
        phone4.off();
    }
}
