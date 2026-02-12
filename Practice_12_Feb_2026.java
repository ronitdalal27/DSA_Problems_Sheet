/*
Q1. Implement queue using linkedlist
Ans:-
// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {

    private Node front;
    private Node rear;
    private int size;

    public myQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            return;
        }

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return front.data;
    }

    public int size() {
        return size;
    }
}
*/

/*
Q2. Implement a Queue using 2 stacks s1 and s2 .
A Query q is of 2 Types
(i) 1 x (a query of this type means  pushing 'x' into the queue)
(ii) 2   (a query of this type means to pop element from queue and print the poped element)
Note : If there is no element return -1 as answer while popping.

Ans:-
// User function Template for Java
class StackQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    
    public void push(int B) {
        // code here
        st1.push(B);
        
    }

    public int pop() {
        // code here
        if(st1.size() == 0 && st2.size()==0){
            return -1;
        }
        
        while(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        
        return st2.pop();
    }
}
*/

/*
Q4. Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.
Note: If no such array is possible then, return [-1].

Ans:-
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int left = 0,sum = 0;
        
        for(int right = 0 ; right<arr.length ; right++){
            sum += arr[right];
            
            while(left<right && sum > target){
                sum -= arr[left];
                left++;
            }
            
            if(sum == target){
                al.add(left+1);
                al.add(right+1);
                return al;
            }
        }
        
        al.add(-1);
        return al;
    }
}
*/

/*
Q4.Given an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order.
Ans:-
class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(q == null || k > q.size() || k <=0){
            return q;
        }
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0 ; i<k ; i++){
            st.push(q.remove());
        }
        
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        
        int rem = q.size() - k;
        
        for(int i=0 ; i<rem ; i++){
            q.add(q.remove());
        }
        
        return q;
    }
}
*/