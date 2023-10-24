package com.jfw.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院类，学院包含系。所以这是Composite节点
 *
 * @author jfw
 * @date 2023-10-24
 */
public class College extends OrganizationComponent {
    private List<OrganizationComponent> departmentList = new ArrayList<>();

    public College(String name, String description) {
        super(name, description);
    }

    /**
     * 重写add，往系列表中添加系
     * @param component 系
     */
    @Override
    protected void add(OrganizationComponent component) {
        departmentList.add(component);
    }

    /**
     * 重写remove，从系列表中删除系
     * @param component 系
     */
    @Override
    protected void remove(OrganizationComponent component) {
        departmentList.remove(component);
    }

    /**
     * 遍历学院的系列表，打印系结构
     */
    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "-----------------");
        for (OrganizationComponent department :
                departmentList) {
            department.print();
        }
    }
}
