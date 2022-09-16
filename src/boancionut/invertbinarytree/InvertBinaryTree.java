package boancionut.invertbinarytree;

public class InvertBinaryTree {

    private static TreeNode invertTree(TreeNode root)
    {
        if(root == null)
            return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {

    }
}
