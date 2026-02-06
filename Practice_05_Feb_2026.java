/*
Q1. Merge tow strings
// User function Template for Java
class Solution {
    String merge(String s1, String s2) {
        // code here
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        // Merge alternately while both strings have characters
        while (i < s1.length() && j < s2.length()) {
            sb.append(s1.charAt(i++));
            sb.append(s2.charAt(j++));
        }

        // Append remaining characters of s1
        while (i < s1.length()) {
            sb.append(s1.charAt(i++));
        }

        // Append remaining characters of s2
        while (j < s2.length()) {
            sb.append(s2.charAt(j++));
        }

        return sb.toString();
    }
}
*/

/*
Q2. Reverse words in a given string
class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] parts = s.split("\\.");
        StringBuilder result = new StringBuilder();

        for (int i = parts.length - 1; i >= 0; i--) {
            if (!parts[i].isEmpty()) {
                if (result.length() > 0) {
                    result.append(".");
                }
                result.append(parts[i]);
            }
        }

        return result.toString();
    }
}
*/

/*
Q3. Longest Distinct substring characters
Ans:-
class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
         HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
        
    }
}
*/