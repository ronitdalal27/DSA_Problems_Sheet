/* 
Q1. Reverse a linkedlist
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
    Node reverseList(Node head) {
        // code here
        if(head == null)
            return head;
            
        reverseList(head.next);
        
        System.out.print(head.data+" -> ");
        
        return null;
    }
}
*/

/*
Q2. Detect Loop in linked list
You are given the head of a singly linked list. You have to determine whether the given linked list contains a loop or not. A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.

Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null. Note that pos is not passed as a parameter.

Ans:-
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


class Solution {
    public boolean detectLoop(Node head) {
        // code here
        Node slow = head, fast = head.next;
        
        while(fast != null && fast.next != null && slow!=fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast==null || fast.next==null)  return false;
        else return true;
        
    }
}
*/

/*
Q3.Kth from End of Linked List
You are given the head of a linked list and the number k, You have to return the kth node from the end of linkedList. If k is more than the number of nodes, then the return -1.

Ans:-
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} 

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        
        int len = 0;
        Node curr=head;
        
        while(curr != null){ //finding lenght of list
            len++;
            curr = curr.next;
        }
        
        Node temp=head;
        for(int i=0 ; i<len-k ; i++){
            temp = temp.next;
        }
        
        if(k>len)
            return -1;
        else
            return temp.data;
        
    }
}
*/

/* 
Q4. Merge two sorted linked lists
You are given the heads of two sorted linked lists list1 and list2. 
Your task is to merge the two lists in a one sorted linked list. The list should be made by splicing together the nodes of the first two lists.

Ans:-
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        if(head1==null){
            return head2;
        }else if(head2==null){
            return head1;
        }else if(head1.data < head2.data){
            head1.next = sortedMerge(head1.next,head2);
            return head1;
        }else{
            head2.next = sortedMerge(head1,head2.next);
            return head2;
        }
        
    }
}
*/  