/*
Q1. Find equilibrium point in an array
Ans:-
class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int totsum = 0, leftsum=0;
        
        for(int ele : arr){
            totsum += ele;
        }
        
        for(int i=0 ; i<arr.length ; i++){
            leftsum += arr[i]; 
                if(leftsum == totsum){
                    return i;
                }
            totsum -= arr[i];
        }
        
        return -1;
    }
}
*/

/*
Q2. Subarray with zero sum
Ans:-
class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        
        for(int i=0 ; i<arr.length ; i++){
            sum += arr[i];
            
            if(sum == 0)
                return true;
            
            if(hs.contains(sum)){
                return true;
            }
            
            hs.add(sum);
        }
        
        return false;
        
    }
}
*/

/*
Q3 Longest subarray with sum divisible by k
Ans:-
class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        // Complete the function
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        // remainder 0 at index -1
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            int remainder = (sum % k + k) % k;

            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                map.put(remainder, i); // store first occurrence only
            }
        }

        return maxLength;
    }
}
*/

/*
Q4 Largest subarray with equal number of 0s and 1s
Ans:-
class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0,maxlen = 0;
        
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 0){
                sum += -1;
            }else{
                sum += 1;
            }
            
            if(sum == 0){
                maxlen = i + 1;
            }
            
            if(!hm.containsKey(sum)){ //first occurence
                hm.put(sum,i);
            }else{
                int len = i - hm.get(sum);
                maxlen = Math.max(len,maxlen);
            }
        }
        
        return maxlen;
    }
}
*/