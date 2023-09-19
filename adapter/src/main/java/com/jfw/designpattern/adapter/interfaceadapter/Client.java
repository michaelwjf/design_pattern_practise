package com.jfw.designpattern.adapter.interfaceadapter;

/**
 * @author jfw
 * @date 2023-08-29
 */
public final class Client {
    private Client() {

    }

    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            /**
             * 重写接口方法1
             */
            @Override
            public void operation1() {
                System.out.println("依赖AbsAdapter，并重写operation1方法");
            }
        };

        adapter.operation1();
        // 这里operation2虽然也可以调用，但是因为是空方法，所以调用了也没实际作用
        adapter.operation2();
    }
}
