/*
Q1. Print the linkedlist
Ans:-
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        
        Node temp = head;
        
        while(temp!=null){
            al.add(temp.data);
            temp = temp.next;
        }
        
        return al;
    }
}
*/

/*
Q2.count the number of nodes in a linked list
Ans:-
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

class Solution {
    public int getCount(Node head) {
        // code here
        int count = 0;
        
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        
        return count;
    }
}
*/

/*
Q3. Node at nth index of the linked list
Ans:-
node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        int cnt = 0;
        if(head == null){
            return -1;
        }
        
        Node temp = head;
        while(temp!=null){
            cnt++;
            if(index == cnt){
                return temp.data;
            }
            temp = temp.next;
        }
        
        return -1;
    }
}
*/

/*
Q4. Middle node of the linked list
Ans:-
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} 

class Solution {
    int getMiddle(Node head) {
        // code here
        int len = 0;
        
        Node temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        Node temp1 = head;
        for(int i=0 ; i<len/2 ; i++){
            temp1 = temp1.next;
        }
        
        return temp1.data;
    }
}
*/

/*
Q5. insert in a sorted linked list
Ans:-
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {

        Node newNode = new Node(key);

        // Case 1: Empty list
        if (head == null) {
            return newNode;
        }

        // Case 2: Insert at beginning
        if (key < head.data) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;

        // Traverse to find position
        while (current.next != null && current.next.data < key) {
            current = current.next;
        }

        // Insert node
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
*/

/*
Q6. sum of all prime numbers between 1 and N
Ans:-
class Solution {
    public static boolean isBoolean(int n){
        
        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int prime_Sum(int n) {
        // code here
        int sum = 0;
        for(int i=2 ; i<=n ; i++){
            if(Solution.isBoolean(i)){
                sum += i;
            }
        }
        return sum;
    }
}
*/