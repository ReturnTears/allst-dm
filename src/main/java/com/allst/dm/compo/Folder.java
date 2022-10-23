package com.allst.dm.compo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Hutu
 * @since 2022-10-23 下午 08:41
 */
public class Folder extends Node {

    private final List<Node> childrenNodes = Lists.newArrayList();

    public Folder(String name) {
        super(name);
    }

    @Override
    protected void addChild(Node child) {
        childrenNodes.add(child);
    }
}
