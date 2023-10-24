package com.jfw.designpattern.composite;

/**
 * 系类，系被学院包含，但系本身不包含其他类了，所以是leaf节点。<br>
 * 系本身不包含其他类，所以不需要重写add和remove，直接使用其默认实现即可。
 *
 * @author jfw
 * @date 2023-10-24
 */
public class Department extends OrganizationComponent {

    public Department(String name, String description) {
        super(name, description);
    }

    /**
     * 打印系本身的信息
     */
    @Override
    protected void print() {
        System.out.println(getName());
    }
}
