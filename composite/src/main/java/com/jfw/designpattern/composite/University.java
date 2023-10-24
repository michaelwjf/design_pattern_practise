package com.jfw.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学校类，学校包含学院，所以这是Composite节点
 *
 * @author jfw
 * @date 2023-10-24
 */
public class University extends OrganizationComponent {
    /**
     * 学校包含学院列表
     */
    private List<OrganizationComponent> collegeList = new ArrayList<>();
    public University(String name, String description) {
        super(name, description);
    }

    /**
     * 重写getName，可以在这里面添加属于University自己特点的getName
     * @return 获取学校名称
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * 重写getDescription
     * @return 获取学校描述
     */
    @Override
    public String getDescription() {
        return super.getDescription();
    }

    /**
     * 重写add，往学院列表中添加学院
     * @param component 学院
     */
    @Override
    protected void add(OrganizationComponent component) {
        this.collegeList.add(component);
    }

    /**
     * 重写remove，从学院列表中删除学院
     * @param component 学院
     */
    @Override
    protected void remove(OrganizationComponent component) {
        this.collegeList.remove(component);
    }

    /**
     * 遍历学校的学院列表，打印学院结构
     */
    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "-----------------");
        for (OrganizationComponent college :
                collegeList) {
            college.print();
        }
    }
}
