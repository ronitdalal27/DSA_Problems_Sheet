// Update for 29th Jan 2026

/* 
Q1 Linear Search
Given an integer k and array arr. Your task is to return the position of the first occurrence of k in the given array and if element k is not present in the array then return -1.

Note: 1-based indexing is followed here.

Examples:

Input: k = 16 , arr = [9, 7, 16, 16, 4]
Output: 3
Explanation: The value 16 is found in the given array at positions 3 and 4, with position 3 being the first occurrence.
Input: k=98 , arr = [1, 22, 57, 47, 34, 18, 66]
Output: -1
Explanation: k = 98 isn't found in the given array.

Ans:-

class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        int pos = -1;
        for(int i=0 ; i<arr.size() ; i++){
            if(arr.get(i) == k){
                pos = i+1;
                break;
            }
        }
        return pos;
    }
}

*/

/*
Q2. Binary Search
Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1. 

Note: If multiple occurrences are there, please return the smallest index.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: 3
Explanation: 4 appears at index 3.
Input: arr[] = [11, 22, 33, 44, 55], k = 445
Output: -1
Explanation: 445 is not present.
Input: arr[] = [1, 1, 1, 1, 2], k = 1
Output: 0
Explanation: 1 appears at index 0.

Ans:-
class Solution {
    public int binarysearch(int[] arr, int key) {
        // Code Here
        int si = 0;
        int ei = arr.length-1;
        int pos = -1;

        while(si <= ei){
            int mid = (si+ei)/2;

            if(arr[mid] == key){
                pos = mid;
                ei = mid - 1;
            }else if(key > arr[mid])
                si = mid + 1;
            else
                ei = mid - 1;
        }

        return pos;
    }
}
*/

/*
Q3. Array Search
Given an integer k and array arr. Your task is to return the position of the first occurrence of k in the given array and if element k is not present in the array then return -1.

Note: 1-based indexing is followed here.

Examples:

Input: k = 16 , arr = [9, 7, 16, 16, 4]
Output: 3
Explanation: The value 16 is found in the given array at positions 3 and 4, with position 3 being the first occurrence.
Input: k=98 , arr = [1, 22, 57, 47, 34, 18, 66]
Output: -1
Explanation: k = 98 isn't found in the given array.

Ans:-
// User function Template for Java
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        int pos = -1;
        for(int i=0 ; i<arr.size() ; i++){
            if(arr.get(i) == k){
                pos = i+1;
                break;
            }
        }
        return pos;
    }
}
*/