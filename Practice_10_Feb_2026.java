/*
Q1. Find median of two sorted arrays of different sizes
Ans:-
class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n = arr.length;
        double ans = 0d;

        // If odd length
        if (n % 2 != 0) {
            ans =  arr[n / 2];
        }
        // If even length
        else {
            ans =  (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
        
        return ans;
    }
}
*/

/*
Q2. Insert a node in doubly linked list at a given position
Ans:-
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}


class Solution {
    Node insertAtPos(Node head, int p, int x) {
        Node newNode = new Node(x);
    
        // step1 : traverse till the pth node
        Node temp = head;
        for (int i = 0; i < p; i++) {
            temp = temp.next;
        }
    
        // Step 2: Link new node
        newNode.next = temp.next;
        newNode.prev = temp;
    
        // Step 3: Fix next node's prev if it exists
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
    
        // Step 4: Fix temp's next
        temp.next = newNode;
    
        return head;
    }
}
*/

/*
Q3. Delete the node of doubly linked list at a given position
Ans:-

Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

class Solution {
    public Node delPos(Node head, int x) {

        // Case 1: Empty list
        if (head == null) return head;
    
        // Case 2: Delete head (x = 1)
        if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
    
        // Step 1: Traverse to xth node
        Node temp = head;
        for (int i = 1; i < x; i++) {
            temp = temp.next;
        }
    
        // Step 2: Adjust links
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    
        return head;
}

}
*/

