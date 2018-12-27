package trees.and.graphs;

import trees.and.graphs.model.TreeNode;

/**
 * @author Abhijeet Gulve
 */
public class TreeMock {
    public static TreeNode getTreeNode() {
        /* Constructed binary tree is
             10
            /  \
          8     2
         /
        3
        */
        TreeNode treeNode = new TreeNode(10);
        TreeNode left1 = new TreeNode(8);
        TreeNode right1 = new TreeNode(2);
        treeNode.left = left1;
        treeNode.right = right1;
        left1.left = new TreeNode(3);
        return treeNode;
    }
}