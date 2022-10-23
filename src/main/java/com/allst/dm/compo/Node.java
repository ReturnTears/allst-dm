package com.allst.dm.compo;

/**
 * 抽象节点类Node
 *
 * addChild声明其为抽象方法，模糊此行为并留给子类去实现
 *
 * @author Hutu
 * @since 2022-10-23 下午 08:38
 */
public abstract class Node {

    protected String name;

    public Node(String name) {
        this.name = name;
    }

    // 添加夏季子节点方法
    protected abstract void addChild(Node child);

    protected void tree(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print("   ");
        }
        System.out.println(name);
    }

    protected void tree() {
        this.tree(0);
    }
}
