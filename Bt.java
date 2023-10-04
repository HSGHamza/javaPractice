import java.util.LinkedList;
import java.util.Queue;



public class Bt {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, -1, -1, -1, 7, 8, 11, -1, -1};
        binaryTree tree = new binaryTree();
        binaryTree.Node root = tree.buildTree(arr);
        tree.levelorder(root);

    }
}
class binaryTree {
    static int indx = -1;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public Node buildTree(int[] nodes) {
        indx++;
        if (indx >= nodes.length || nodes[indx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[indx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
    public void inorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + "->");
        inorder(root.left);
        inorder(root.right);
        }


        public void preorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + "->");
        inorder(root.right);
        }

        public void postorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + "->");
        }
        public void levelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curNode = q.remove();
                if(curNode == null){
                    System.out.println();
                
                    if(q.isEmpty()){
                    break;
                    }
                    else{
                    q.add(null);
                    }
                }else{
                    System.out.print(curNode.data + " ");
                    if(curNode.left != null){
                        q.add(curNode.left);
                    }
                    if(curNode.right != null){
                        q.add(curNode.right);
                    }
            
            }
        }
    }   
    public int count(Node root){
        if(root == null){
            return 0;
        }
        int x = count(root.left);
        int y = count(root.right);
        return x+y+1;
    }
    public int sum(Node root){
        if(root == null){
            return 0;
        }
        int x = sum(root.left);
        int y = sum(root.right);
        return x+y+root.data;
    }
    public int height(Node root){
        if(root == null){
           return 0; 
        }
        int x = height(root.left);
        int y = height(root.right);

        return  Math.max(x, y) + 1;
    }
    public int dia(Node root){
        if(root == null){
           return 0; 
        }
        int d1 = dia(root.left);
        int d2 =dia(root.right);
        int d3 = height(root.left) + height(root.right) + 1;

        return Math.max(d3,Math.max(d2, d1));
    }
}
    

