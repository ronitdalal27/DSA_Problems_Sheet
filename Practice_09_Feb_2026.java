/*
Q1. Implement Stack using ArrayList
Implement a Stack using ArrayList. The Stack should support the following operations:

import java.util.ArrayList;

class myStack {

    ArrayList<Integer> al;
    int size;

    public myStack(int n) {
        al = new ArrayList<>();
        size = n;
    }

    public boolean isEmpty() {
        return al.size() == 0;
    }

    public boolean isFull() {
        return al.size() == size;
    }

    public void push(int x) {
        if (isFull()) {
            return;
        }
        al.add(x);
    }

    public void pop() {
        if (isEmpty()) {
            return;
        }
        al.remove(al.size() - 1);
    }

    public int peek() {
        if (isEmpty())
            return -1;
        return al.get(al.size() - 1);
    }
}
*/

/*
Q2 Two Stacks in an Array
Two Stacks in an Array
Difficulty: MediumAccuracy: 56.49%Submissions: 177K+Points: 4Average Time: 20m
You are given an array of a fixed size. Your task is to efficiently implement two stacks in this single array.

The following operations must be supported:

(i) twoStacks : Initialize the data structures and variables to be used to implement  2 stacks in one array.
(ii) push1(x) : pushes element into the first stack.
(iii) push2(x) : pushes element into the second stack.
(iv) pop1() : pops an element from the first stack and returns the popped element. If the first stack is empty, it should return -1.
(v) pop2() : pops an element from the second stack and returns the popped element. If the second stack is empty, it should return -1.

Ans:-
import java.util.ArrayList;

class twoStacks {
    ArrayList<Integer> al1;
    ArrayList<Integer> al2;
    
    twoStacks() {
        al1 = new ArrayList<>();
        al2 = new ArrayList<>();
    }

    // Function to push an integer into stack1
    void push1(int x) {
        al1.add(x);
    }

    // Function to push an integer into stack2
    void push2(int x) {
        al2.add(x);
    }

    // Function to remove an element from top of stack1
    int pop1() {
        if (al1.size() == 0)
            return -1;
        return al1.remove(al1.size() - 1);
    }

    // Function to remove an element from top of stack2
    int pop2() {
        if (al2.size() == 0)
            return -1;
        return al2.remove(al2.size() - 1);
    }
}
*/

/*
Q3. Reverse Using Stack
You are given a string s , the task is to reverse the string using stack.

Examples:

Input: s ="GeeksforGeeks"
Output:  skeeGrofskeeG
Input: s ="Geek"
Output: keeG

Ans:-
class Solution {
    public String reverse(String s) {
        // code here
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();

        // Pop characters from stack
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
*/

/*
Q4.Next Greater Element
You are given an array arr[] of integers, the task is to find the next greater element for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
If there does not exist next greater of current element, then next greater element for current element is -1.

Examples

Input: arr[] = [1, 3, 2, 4]
Output: [3, 4, 4, -1]
Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.

Ans:-
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=arr.length-1 ; i>=0 ; i--){
            int ele = arr[i];

            // Remove smaller or equal elements
            while (!st.isEmpty() && st.peek() <= ele) {
                st.pop();
            }

            // If stack empty, no greater element
            if (st.isEmpty())
                result.add(-1);
            else
                result.add(st.peek());

            // Push current element
            st.push(ele);
        }
        
        Collections.reverse(result);
        
        return result;
    }
}
*/