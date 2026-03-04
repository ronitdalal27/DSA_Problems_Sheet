/*
Q1. LCA of BST
Ans:-
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        if(root == null)
            return null;
        if(n1.data < root.data && n2.data < root.data){
            Node leftLca = LCA(root.left,n1,n2);
            return leftLca;
        }else if(n1.data > root.data && n2.data > root.data){
            Node rightLca = LCA(root.right,n1,n2);
            return rightLca;
        }else
            return root;
        
    }
}
*/

/*
Q2. Minimum is BST
Ans:-
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public int minValue(Node root) {
        // code here
       while(root.left != null){
           root = root.left;
       }
       
       return root.data;
    }
}
*/

/*
Q3. Construct a BST from Levelorder Traversal
Ans:-
class GFG {
    public static Node insert(Node root, int val){
        
        if(root == null){
            return new Node(val);
        }
        
        if(val < root.data){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        
        return root;
    }
    // Function to construct the BST from its given level order traversal.
    public Node constructBST(int[] arr) {
        // Write your code here
        Node root = null;
        
        for(int i=0 ; i<arr.length ; i++){
            root = insert(root,arr[i]);
        }
        
        return root;
        
    }
}
*/

/*
Q4. Validate is BST
Ans:-
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class Solution {
    boolean isBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBST(Node node, int min, int max) {

        if(node == null)
            return true;

        if(node.data <= min || node.data >= max)
            return false;

        return checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max);
    }
}
*/