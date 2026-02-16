/*
Q1. find all pairs in an array whose sum is zero
An:-
import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == 0) {

                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);

                result.add(pair);

                int leftVal = arr[left];
                int rightVal = arr[right];

                // Skip duplicates
                while (left < right && arr[left] == leftVal) left++;
                while (left < right && arr[right] == rightVal) right--;
            }
            else if (sum < 0) {
                left++;
            }
            else {
                right--;
            }
        }

        return result;
    }
}
*/

/* 
Q2. Given an array arr[] of integers and another integer target. You have to find all unique quadruples from the given array whose sum is equal to the given target.
Note: All the quadruples should be internally sorted, i.e for any quadruple [q1, q2, q3, q4] it should be : q1 ≤ q2 ≤ q3 ≤ q4.
Ans:-
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
         ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = arr.length;
        
        if (n < 4) return result;
        
        Arrays.sort(arr);
        
        for (int i = 0; i < n - 3; i++) {
            
            // Skip duplicate i
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            
            for (int j = i + 1; j < n - 2; j++) {
                
                // Skip duplicate j
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    
                    long sum = (long)arr[i] + arr[j] + arr[left] + arr[right];
                    
                    if (sum == target) {
                        
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[left]);
                        quad.add(arr[right]);
                        
                        result.add(quad);
                        
                        int leftVal = arr[left];
                        int rightVal = arr[right];
                        
                        // Skip duplicates
                        while (left < right && arr[left] == leftVal) left++;
                        while (left < right && arr[right] == rightVal) right--;
                    }
                    else if (sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }
}
*/

/*
Q3. Find the first non-repeating element in a given array arr of integers and if there is not present any non-repeating element then return 0
Note: The array consists of only positive and negative integers and not zero.
Ans:-
// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int ele : arr){
            hm.put(ele, hm.getOrDefault(ele,0)+1);
        }
        
        for(int key : arr){
            if(hm.get(key) == 1)
                return key;
        }
        
        return 0;
    }
}
*/

/* 
Q4. Group Anagrams together
Given an array of strings, return all groups of strings that are anagrams. The strings in each group must be arranged in the order of their appearance in the original array. Refer to the sample case for clarification.
Ans:-
class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        // LinkedHashMap preserves insertion order of groups
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();
        
        for (String str : arr) {
            
            // Convert string to char array and sort
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            
            // Sorted string as key
            String key = new String(chars);
            
            // Add to map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        
        // Return grouped anagrams
        return new ArrayList<>(map.values());
        
    }
}
*/