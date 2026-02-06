/*
Q1. Find Anagrams
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        
        for(char ch : s1.toCharArray()){
            hm1.put(ch, hm1.getOrDefault(ch,0)+1 );
        }
        
        for(char ch : s2.toCharArray()){
            hm2.put(ch, hm2.getOrDefault(ch,0)+1 );
        }
        
        if(hm1.size() == hm2.size())
            if(hm1.equals(hm2))
                return true;
        
        return false;
        
    }
}
*/

/*
Q2. Check if two arrays are sorted or not
class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        // boolean flag = true;
        
        // if(a.length == b.length){
        //     for(int i=0 ; i<a.length ; i++)
        //         if(a[i] == b[i]){
        //           continue;
        //           flag = false;
        //         }
        // }
        
        // flag ? return true : return false;
        
     
        return Arrays.equals(a, b);   
        
    }
    
}
*/

