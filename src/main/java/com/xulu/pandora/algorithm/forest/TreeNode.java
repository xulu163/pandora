package com.xulu.pandora.algorithm.forest;

/**
 * @author xulu
 * @date 2018/9/13
 * @link https://github.com/xulu163
 */
public class TreeNode {
    private TreeNode leftChild;
    private TreeNode rightChild;
    private String root;
    private Object data;

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}