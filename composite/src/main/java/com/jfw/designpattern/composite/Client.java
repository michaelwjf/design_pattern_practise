package com.jfw.designpattern.composite;

/**
 * Client类，用来调用学校，学院，系
 *
 * @author jfw
 * @date 2023-10-24
 */
public final class Client {
    private Client() {

    }
    public static void main(String[] args) {
        // 由大到小创建对象
        // 先创建学校
        OrganizationComponent university =
                new University("清华大学", "THU");

        // 再创建学院
        OrganizationComponent computerCollege =
                new College("计算机学院", "123");
        OrganizationComponent infoCollege =
                new College("信息工程学院", "456");

        // 往学院中添加系
        computerCollege.add(new Department("软件工程", "123001"));
        computerCollege.add(new Department("网络工程", "123002"));
        computerCollege.add(new Department("计算机科学与技术", "123003"));

        infoCollege.add(new Department("通信工程", "456001"));
        infoCollege.add(new Department("信息工程", "456002"));

        // 最后把学院添加到学校中
        university.add(computerCollege);
        university.add(infoCollege);

        // 打印
        university.print();

    }
}
