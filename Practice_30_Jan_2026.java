/*
Q1. Floor in a Sorted Array
Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.

Note: In case of multiple occurrences of floor of x, return the index of the last occurrence.

Examples

Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
Output: 1
Explanation: Largest number less than or equal to 5 is 2, whose index is 1.

Ans:-
class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int si = 0, ei = arr.length-1, ans = -1;
        
        while(si <= ei){
            int mid = si + (ei-si)/2;
            
            if(arr[mid] <= x){
                ans = mid;
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
        
        return ans;
    }
}
*/


/*
Q2. Search is a Roated Sorted Array
Given an array arr[] of distinct elements, which was initially sorted in ascending order but then rotated at some unknown pivot, the task is to find the index of a target key.  If the key is not present in the array, return -1.

Examples :

Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is found at index 8.

Ans:-
class Solution {
    int search(int[] arr, int key) {
        // code here
        int si=0, ei = arr.length-1;
        
        while(si <= ei){
            int mid = (si + ei)/2;
            
            if(arr[mid]==key)
                return mid;
            else if(arr[si] <= arr[mid]){ //left side sorted
                if(key >= arr[si] && key < arr[mid]){
                    ei = mid - 1;
                }else{
                    si = mid + 1;
                }
                    
            }else{ //right side sorted
                if(key > arr[mid] && key <= arr[ei]){
                    si = mid + 1;
                }else{
                    ei = mid - 1;
                }
            }
        }
        
        return -1;
    }
}
*/

/*
Q3 Number of Occurrences
Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

Examples :

Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.

Ans:-
class Solution {
    int firstOccurence(int[] arr, int target){
        int si = 0,ei = arr.length-1, ans=-1;
        
        while(si <= ei){
            int mid = (si + ei)/2;
            
            if(arr[mid] == target){
                ans = mid;
                ei = mid - 1;
            }else if(arr[mid] > target){
                ei = mid - 1;
            }else{
                si = mid + 1;
            }
        }
        
        return ans;
    }
    
    int lastOccurence(int[] arr, int target){
        int si = 0,ei = arr.length-1, ans=-1;
        
        while(si <= ei){
            int mid = (si + ei)/2;
            
            if(arr[mid] == target){
                ans = mid;
                si = mid + 1;
            }else if(arr[mid] > target){
                ei = mid - 1;
            }else{
                si = mid + 1;
            }
        }
        
        return ans;
    }
    
    int countFreq(int[] arr, int target) {
        // code here
        int fo = firstOccurence(arr,target);
        if(fo==-1) return 0;
        int lo = lastOccurence(arr,target);
        return lo - fo + 1;
    }
}
*/