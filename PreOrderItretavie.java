import java.util.Stack;

public class PreOrderItretavie {
    public static void main(String[] args){
        BinaryTree1 bt1 = BinaryTree1.create();
        System.out.println("Printing Binary tree nodes PreOrder without using recursion");
        bt1.preOrderWithoutRecursion();

    }
}

class BinaryTree1{
    static class TreeNode1{

        String data;
        TreeNode1 left, right;

        TreeNode1(String data){
            this.data = data;
            left = right = null;
        }
        boolean isLeaf(){
            return left == null ? right == null : false;
        }
    }
    TreeNode1 root;

    public void preOrderWithoutRecursion(){
        Stack<TreeNode1> nodes1 = new Stack<>();
        nodes1.push(root);

        while (!nodes1.isEmpty()){
            TreeNode1 current = nodes1.pop();
            System.out.printf("%s ",current.data);

            if (current.right != null){
                nodes1.push(current.right);
            }
            if (current.left != null){
                nodes1.push(current.left);
            }
        }
    }

    public static BinaryTree1 create(){
        BinaryTree1 tree = new BinaryTree1();
        TreeNode1 root = new TreeNode1("a");
        tree.root = root;
        tree.root.left = new TreeNode1("b");
        tree.root.left.left = new TreeNode1("c");

        tree.root.left.right = new TreeNode1("d");
        tree.root.right = new TreeNode1("e");
        tree.root.right.right = new TreeNode1("f");

        return tree;
    }
}
