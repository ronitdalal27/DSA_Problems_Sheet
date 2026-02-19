/*
Q1. counting elements in two array
Ans:-
import java.util.*;

class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        
        // Step 1: Sort array b
        Arrays.sort(b);
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // Step 2: For each element in a[], find count using binary search
        for (int value : a) {
            result.add(upperBound(b, value));
        }
        
        return result;
    }
    
    // Returns count of elements <= key
    private static int upperBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] <= key) {
                ans = mid;      // possible answer
                low = mid + 1;  // move right
            } else {
                high = mid - 1; // move left
            }
        }
        
        return ans + 1;  // count = index + 1
    }
}
*/

/* 
Q2. Level order traversal of a binary tree
Ans:-
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> al = new ArrayList<>(); 
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
    
        while(q.size() != 0 ){
            int size = q.size();
            ArrayList<Integer> ans = new ArrayList<>();
            
            while(size-- > 0){
                Node rnode = q.remove();
    
                ans.add(rnode.data);
    
                if(rnode.left != null){
                    q.add(rnode.left);
                }
    
                if(rnode.right != null){
                    q.add(rnode.right);
                }
            }
            
            al.add(ans);
        }
        
        return al;
        
    }
}
*/

/* 
Q3. count leaf nodes in a binary tree
Ans:-
class Node
{
    int data;
    Node left, right;
}

class Solution {
    int countLeaves(Node node) {
        // Your code
        if (node == null) {
            return 0;
        }
        
        // If leaf node
        if (node.left == null && node.right == null) {
            return 1;
        }
        
        // Recursively count in left & right
        return countLeaves(node.left) + countLeaves(node.right);
    }
    
}
*/

/*
Q4. Height balanced binary tree
Ans:-

class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}


class Solution {
    public boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(Node node) {
        
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
*/