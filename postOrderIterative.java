import java.util.Stack;

public class postOrderIterative {
    public static void main(String[] main){
    BinaryTree3 bt3 = BinaryTree3.create();
    bt3.postOrderItreative();
    }
}
//----------------------------------------Create BinaryTree------------------------------
class BinaryTree3 {
    static class TreeNode2{
        String data;
        TreeNode2 left, right;

        TreeNode2(String data){
            this.data = data;
            left = right = null;
        }

        boolean isLeaf(){
            return left == null ? right == null : false;
        }
    }
    TreeNode2 root2;

//---------------------------------PostOrder Iterative------------------------------
    public void postOrderItreative(){
        Stack<TreeNode2> nodes2 = new Stack<>();
        nodes2.push(root2);

        while (!nodes2.isEmpty()){
            TreeNode2 current = nodes2.peek();

            if (current.isLeaf()){
                TreeNode2 node2 = nodes2.pop();
                System.out.printf("%s ", node2.data);
            }else {
                if (current.right != null){
                    nodes2.push(current.right);
                    current.right = null;
                }
                if (current.left != null){
                    nodes2.push(current.left);
                    current.left = null;
                }
            }
        }
        
    }

    public static BinaryTree3 create(){
        BinaryTree3 tree3 = new BinaryTree3();
        TreeNode2 root2 = new TreeNode2("55");
        tree3.root2 = root2;
        tree3.root2.left = new TreeNode2("35");
        tree3.root2.left.left = new TreeNode2("25");
        tree3.root2.left.left.left = new TreeNode2("15");

        tree3.root2.left.right = new TreeNode2("45");
        tree3.root2.right = new TreeNode2("65");
        tree3.root2.right.right = new TreeNode2("75");
        tree3.root2.right.right.left = new TreeNode2("87");
        tree3.root2.right.right.right = new TreeNode2("98");

        return tree3;
    }
}
