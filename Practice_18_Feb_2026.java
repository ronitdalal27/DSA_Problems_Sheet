/*
Q1. Inorder traversal of a binary tree
Ans:-

class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}

class Solution {
    public void inorderHelper(Node root, ArrayList<Integer> al){
        if(root==null)
            return;
            
        inorderHelper(root.left,al);
        al.add(root.data);
        inorderHelper(root.right,al);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        inorderHelper(root,al);
        return al;
    }
}
*/

/*
Q2. Preorder traversal of a binary tree
Ans:-
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}

class Solution {
    public void preorderHelper(Node root, ArrayList<Integer> al){
        if(root==null)
            return;
            
        al.add(root.data);
        preorderHelper(root.left,al);
        preorderHelper(root.right,al);
    }
    public ArrayList<Integer> preOrder(Node root) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        preorderHelper(root,al);
        return al;
    }
}
*/

/*
Q3. Postorder traversal of a binary tree
Ans:-
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}

class Solution {
    public void postorderHelper(Node root, ArrayList<Integer> al){
        if(root==null)
            return;
            
        postorderHelper(root.left,al);
        postorderHelper(root.right,al);
        al.add(root.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        postorderHelper(root,al);
        return al;
    }
}
*/

/*
Q4. Height of the daimeter
Ans:-
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}


class Solution {
    public int height(Node root) {
        // code here
        if(root == null)
            return -1;
            
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return 1 + Math.max(leftheight,rightheight);
        
    }
}
*/

/*
Q5. Daimeter of a binary tree
Ans:-
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}

class Solution {
    public int height(Node root){
        if(root == null){
            return -1;
        }
        
        int LSTH = height(root.left);
        int RSTH = height(root.right);
        
        return Math.max(LSTH,RSTH)+1;
    }
    public int diameter(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        
        int dLST = diameter(root.left);
        int dRST = diameter(root.right);
        int dROOT = height(root.left) + height(root.right) + 2;
        
        int dai = Math.max(Math.max(dLST,dRST),dROOT);
        
        return dai;
    }
}
*/
