/*
Q1. Leftview of a binary tree
Ans:-
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while(q.size() != 0){

            int size = q.size();

            al.add(q.peek().data);

            while(size-- > 0){
                Node rnode = q.remove();

                if(rnode.left!=null){
                    q.add(rnode.left);
                }

                if(rnode.right!=null){
                    q.add(rnode.right);
                }
            }
        }

        return al;
    }
}
*/

/*
Q2. Rightview of a binary tree
Ans:-
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public ArrayList<Integer> rightView(Node root) {

        ArrayList<Integer> al = new ArrayList<>();
        if(root == null) return al;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()) {

            int size = q.size();

            while(size-- > 0) {

                Node rnode = q.remove();

                if(rnode.left != null) {
                    q.add(rnode.left);
                }

                if(rnode.right != null) {
                    q.add(rnode.right);
                }

                // Last node of level
                if(size == 0) {
                    al.add(rnode.data);
                }
            }
        }

        return al;
    }
}
*/

/*
Q3. (Lowest Common Ancestor) LCA of a binary tree
Ans:-
class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Solution {
    public static Node find(Node root,int target,ArrayList<Integer> al){
        if(root==null) 
            return null;

        if(root.data==target){
            al.add(root.data);
            return root;
        }

        Node leftnode = find(root.left,target,al);
        if(leftnode!=null){
            al.add(root.data);
            return leftnode;
        }

        Node rightnode = find(root.right,target,al);
        if(rightnode!=null){
            al.add(root.data);
            return rightnode;
        }

        return null;                  
        
    }
    
    Node lca(Node root, int n1, int n2) {
        // code here
        ArrayList<Integer> al1 = new ArrayList<>();
        find(root,n1,al1);
        //you will have node to root path before reversing
        Collections.reverse(al1); //after reversing you will get root to node path
    
        ArrayList<Integer> al2 = new ArrayList<>();
        find(root,n2,al2);
        Collections.reverse(al2);
       
        Node lca = null;

        int i = 0, j = 0;
        while (i < al1.size() && j < al2.size()) {
            if (al1.get(i).equals(al2.get(j))) {
                lca = new Node(al1.get(i));
            }
            i++;
            j++;
        }

        return lca;
    }
}
*/