package com.allst.dm.compo;

/**
 * @author Hutu
 * @since 2022-10-23 下午 09:23
 */
public class File extends Node {

    public File(String name) {
        super(name);
    }

    @Override
    protected void addChild(Node child) {
        System.out.println("不能添加子节点...");
    }

    @Override
    protected void tree(int space) {
        super.tree(space);
    }
}
