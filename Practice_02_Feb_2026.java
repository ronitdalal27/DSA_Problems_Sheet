/* 
Q1. Given an array arr[]. Your task is to find the minimum and maximum elements in the array.

Examples:

Input: arr[] = [1, 4, 3, 5, 8, 6]
Output: [1, 8]
Explanation: minimum and maximum elements of array are 1 and 8.

Ans:-
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int num : arr){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        
        return new int[]{min, max};

*/

/* 
Q2. 
Given an array arr[] denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.

Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.

Examples:

Input: arr[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210 Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655 Maximum Profit  = 210 + 655 = 865

Ans:-
class Solution {
    int stockBuySell(int arr[]) {
        // code here
       int buyprice = arr[0];
       int profit = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] >= buyprice) {
                profit += arr[i] - buyprice;
            }
            
            buyprice = arr[i];
        }

        return profit;
        
    }
}
*/

/*
Q3. Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.

Examples:

Input: arr[] = [2, 2]
Output: [2, 1]
Explanation: Repeating number is 2 and the missing number is 1.

Ans:-
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0 ; i<arr.length ; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        for(int key : hm.keySet()){
            if(hm.get(key) > 1){
                al.add(key);
                break;
            }
        }
        
        for(int i=1 ; i<=arr.length ; i++){
            if(!hm.containsKey(i)){
                al.add(i);
                break;
            }
        }
        
        return al;
        
    }
}
*/

/*
Q4. Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Examples:

Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.

Ans:-
class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer>hs = new HashSet<>();
        int longest = 0;
        
        for(int num : arr){
            hs.add(num);
        }
        
        for(int num : hs){
            
            if(!hs.contains(num-1)){ //to start subsequence
                
                int count = 1;
                int currNum = num;
                
                while(hs.contains(currNum + 1)){
                    count++;
                    currNum++;
                }
               
                longest = Math.max(count,longest);
            }
        }
        
        return longest;
        
    }
}
*/