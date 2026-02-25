/*
Q1. Search in BST
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
    public boolean search(Node root, int key) {
        // code here
        if(root == null){
            return false;
        }
        
        if(root.data == key){
            return true;
        }
        
        if(key < root.data){
            return search(root.left,key);
        }else
            return search(root.right,key);
    }
}
*/

/*
Q2. Insert a node in BST
Ans:-
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}


class Solution {
    public Node insert(Node root, int key) {
        // code here
        if (root == null) {
            return new Node(key);
        }
        
        if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            root.left = insert(root.left, key);
        }
        
        return root;
            
    }
}
*/

/*
Q3. Delete a node in BST
Ans:-
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}


class Solution {
    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    
    public Node delNode(Node root, int x) {
        
        if (root == null) return null;
        
        if (x < root.data) {
            root.left = delNode(root.left, x);
        }
        else if (x > root.data) {
            root.right = delNode(root.right, x);
        }
        else {
            // Node found
            
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            
            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            
            // Case 3: Two children
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delNode(root.right, successor.data);
        }
        
        return root;
    }
}
*/