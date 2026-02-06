/*
Q1. Two Sum - Pair with Given Sum
Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.
Ans:-

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
*/

/*
Q2. K-th element of two Arrays
Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.

Ans:-
class Solution {
    public int kthElement(int a[], int b[], int k) {
        int i = 0, j = 0;
        int count = 0;
        int ans = -1;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans = a[i];
                i++;
            } else {
                ans = b[j];
                j++;
            }
            count++;
            if (count == k) {
                return ans;
            }
        }

        // If elements left in a[]
        while (i < a.length) {
            ans = a[i];
            i++;
            count++;
            if (count == k) {
                return ans;
            }
        }

        // If elements left in b[]
        while (j < b.length) {
            ans = b[j];
            j++;
            count++;
            if (count == k) {
                return ans;
            }
        }

        return -1; // safety
    }
}
*/

/*
Q3 Tower Of Hanoi
You are given n disks placed on a starting rod (from), with the smallest disk on top and the largest at the bottom. There are three rods: the starting rod(from), the target rod (to), and an auxiliary rod (aux).
You have to calculate the minimum number of moves required to transfer all n disks from the starting rod to the target rod, following these rules:
      1. Only one disk can be moved at a time.
      2. A disk can only be placed on top of a larger disk or on an empty rod.
Return the minimum number of moves needed to complete the task.

Ans:-
class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if (n == 0) return 0;
        return 2 * towerOfHanoi(n - 1, from, aux, to) + 1;
    }
}
*/

/*
Q4 Count zeros in a sorted matrix
Given a N X N binary Square Matrix where each row and column of the matrix is sorted in ascending order. Find the total number of zeros present in the matrix.

Ans:-
class GfG {
    int countZeros(int a[][], int n) {
        // Your code here
       int row = 0;
        int col = n - 1;
        int count = 0;

        while (row < n && col >= 0) {
            if (a[row][col] == 0) {
                // all elements below are also zero
                count += (n - row);
                col--;
            } else {
                row++;
            }
        }
        return count;
    }
}
*/