package com.jfw.designpattern.composite;

/**
 * 组合模式中的component节点，定义了组合模式中所有类共有的行为。
 *
 * @author jfw
 * @date 2023-10-24
 */
public abstract class OrganizationComponent {
    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 添加node，这里主要是指添加学院或者系
     * @param component 学院或者系
     */
    protected void add(OrganizationComponent component) {
        // 定义默认实现，这样的话，当某些节点不需要实现这个功能的时候，就可以调用其默认实现
        // 这里默认实现为抛出一个不支持操作的异常
        throw new UnsupportedOperationException();
    }

    /**
     * 删除node，这里主要指删除学院或者系
     * @param component 学院或者系
     */
    protected void remove(OrganizationComponent component) {
        // 默认实现，抛出不支持操作的异常
        throw new UnsupportedOperationException();
    }

    /**
     * 打印学校、院、系信息
     */
    protected abstract void print();

}
