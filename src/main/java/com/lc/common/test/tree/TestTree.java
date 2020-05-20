package com.lc.common.test.tree;

import com.lc.common.utils.TreeBuild;

import java.util.ArrayList;
import java.util.List;

public class TestTree {
    public static void main(String[] args) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(new TreeNode("F", "顶层节点1", "0"));
        list.add(new TreeNode("F11", "二级节点4", "F"));
        list.add(new TreeNode("F12", "二级节点5", "F"));
        list.add(new TreeNode("F121", "二级节点6", "F12"));
        list.add(new TreeNode("F122", "三级节点7", "F12"));

//        List<TreeNode> list1 = TreeBuild.toTree02(list,"0");
//        System.out.println(list1);
        List<TreeNode> list2 = TreeBuild.toTree03(list,"0");
        System.out.println(list2);
    }
}