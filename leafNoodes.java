public class leafNoodes {
    public static void main(String[] args){
        //create a Binary Tree
        TreeNode0 d = new TreeNode0("b");
        TreeNode0 e = new TreeNode0("e");
        TreeNode0 g = new TreeNode0("g");
        TreeNode0 k = new TreeNode0("k");

        TreeNode0 c = new TreeNode0("c",d, null);
        TreeNode0 h = new TreeNode0("h", null, k);

        TreeNode0 b = new TreeNode0("b",  c, e);
        TreeNode0 f = new TreeNode0("f", g, h);

        TreeNode0 root = new TreeNode0("a", b, f);

        System.out.println("Printing all leaf nodes of binary tree in Java (recursively)");
        printLeaves(root);


    }

    private static class TreeNode0{
        String data;
        TreeNode0 left, right;

        TreeNode0(String data){
            this.data = data;
        }
        TreeNode0(String value, TreeNode0 left, TreeNode0 right){
            this.data = value;
            this.left = left;
            this.right = right;
        }
        boolean isLeaf(){
            return left == null ? right == null : false;
        }
    }

    public static void printLeaves(TreeNode0 node0){
        ///base case
        if (node0 == null){
            return;
        }
        if (node0.isLeaf()){
            System.out.printf("%s ", node0.data);
        }
        printLeaves(node0.left);
        printLeaves(node0.right);
    }
}
