/*
Q1. Kadane's Algorithm
Ans:-
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

*/

/*
Q2. Minimum number of jumps
Ans:-
class Solution {
    public int minJumps(int[] arr) {
        
        int n = arr.length;
        
        // Edge cases
        if (n == 1) return 0;
        if (arr[0] == 0) return -1;

        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            
            // If we reached last index
            if (i == n - 1) return jumps;

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            // No more steps left
            if (steps == 0) {
                jumps++;

                if (i >= maxReach)
                    return -1;

                steps = maxReach - i;
            }
        }

        return -1;
    }
}
*/

/*
Q3.word break
Ans:-
import java.util.*;
class Solution {
    public boolean wordBreak(String s, String[] dictionary) {
        // code here
        Set<String> set = new HashSet<>(Arrays.asList(dictionary));
        int n = s.length();
        
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;  // empty string
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n];
    }
}
*/