/*
Q1. Remove Loop in Linked List
Ans:-
class Node
{
    int data;
    Node next;
}

class Solution {
    public static void removeLoop(Node head) {
        
        if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;
        boolean hasLoop = false;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        // If no loop exists
        if (!hasLoop)
            return;

        // Step 2: Find start of loop
        slow = head;

        // Special case: loop starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        // Step 3: Remove loop
        fast.next = null;
    }
}
*/

/*
Q2. remove duplicate from sorted linked list
Ans:-
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        // Your code here
        if(head == null || head.next == null)
            return head;

        Node current = head;

        while (current != null && current.next != null) {
            
            if (current.data == current.next.data) {
                // Skip duplicate node
                current.next = current.next.next;
            } else {
                // Move to next distinct element
                current = current.next;
            }
        }

        return head;
        
    }
}
*/

/*
Q3. delete a node in linked list
Ans:-
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class Solution {
    public void deleteNode(Node del_node) {
        // code here
        // Copy next node's data
        del_node.data = del_node.next.data;
        
        // Skip next node
        del_node.next = del_node.next.next;
        
    }
}
*/

/*
Q4. Intersection of two linked list
Ans:-
class Node
{
    int data;
    Node next;
}

class Solution {
    public static void removeLoop(Node head) {
        
        if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;
        boolean hasLoop = false;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        // If no loop exists
        if (!hasLoop)
            return;

        // Step 2: Find start of loop
        slow = head;

        // Special case: loop starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        // Step 3: Remove loop
        fast.next = null;
    }
}
*/