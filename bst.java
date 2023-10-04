import java.util.*;

public class bst {
    public static void main(String[] args) {
        int[] val = { 1, 3, 2, 8, 4, 6 };
        node root = null;
        for (int i = 0; i < val.length; i++) {
            root = buildbst(root, val[i]);
        }
        if(search(root, 3) == true ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        root.levelorder(root);
    }

    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }

        public void levelorder(node root) {
            if (root == null) {
                return;
            }
            Queue<node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                node curNode = q.remove();
                if (curNode == null) {
                    System.out.println();

                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curNode.data + " ");
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }
            }
        }
    }
   
    private static node buildbst(node root, int val) {
        if (root == null) {
            root = new node(val);
            return root;
        }
        if (root.data > val) {
            root.left = buildbst(root.left, val);
        } else {
            root.right = buildbst(root.right, val);
        }
        return root;
    }
    private static boolean search(node root , int val){
        if(root == null){
            return false;
        }
        else if(root.data == val){
            return true;
        }
        else if(root.data > val  ){
            return search(root.left , val );
        }
        else
        return search(root.right , val);
    }

}
