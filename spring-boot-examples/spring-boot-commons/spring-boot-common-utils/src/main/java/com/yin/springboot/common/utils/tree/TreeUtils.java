package com.yin.springboot.common.utils.tree;

import java.util.List;
import java.util.Objects;

public abstract class TreeUtils {

    /**
     * 递归查找子节点
     *
     * @param treeNodes
     * @return
     */
    public static <T extends TreeNode> T findChildren(T treeNode, List<T> treeNodes) {
        treeNodes.stream().filter(e -> Objects.equals(treeNode.getId(), e.getParentId())).forEach(e -> treeNode.getChildrens().add(findChildren(e, treeNodes)));
        return treeNode;
    }
}
