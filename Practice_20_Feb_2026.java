/*
Q1. Celebrity Problem
Ans:-
class Solution {
    public int celebrity(int M[][]) {
        // code here
        int n = M.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){ //push all elements in the stack
            st.push(i);
        }

        //pick two person from stack till there is one person in the stack
        while(st.size() > 1){
            int p1 = st.pop(); 
            int p2 = st.pop();

            if(M[p1][p2]==0) //p1 does not know p2 so p2 cannot be a celebrity
                st.push(p1); //so push p1
            else
                st.push(p2); //p1 knows p2 so push p2 into stack
        }

        int potcelb = st.pop(); //now we have only one element with us who can be out celeb

        //we should avoid daigonal checking of the element

        //check for column no col should have 1 leaving itself
        for(int c=0;c<n;c++){
            if(potcelb!=c && M[potcelb][c]==1)
                return -1;
        }

        //check for row no row should have 0 leaving itself
         for(int r=0;r<n;r++){
            if(potcelb!=r && M[r][potcelb]==0)
                return -1;
        }

        return potcelb;
       
    }
}
*/

/*
Q2. Stock span problem
Ans:-
class Solution {
    public static int[] nextGreaterElementOnLeftIndexwise(int[] arr,int n){
        Stack<Integer> st = new Stack<Integer>();
        
        int[] ngeli = new int[n];

        for(int i=n-1 ; i>=0 ; i--){
            int ele = arr[i];

            while(st.size() > 0 && ele > arr[st.peek()]){
                ngeli[st.pop()] = i;
            }
                
            st.push(i);
        }

        while(st.size() > 0)
            ngeli[st.pop()] = -1;

        return ngeli;
    }
    
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int[] ngeli = nextGreaterElementOnLeftIndexwise(arr,arr.length);
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0 ; i<arr.length ; i++){
            al.add( i - ngeli[i]);
        }
        
        return al;
    }
}
*/

/*
Q3. Longest valid parentheses
Ans:-
class Solution {
    static int maxLength(String s) {
        // code here
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Base for valid substring
        
        int maxLength = 0;
        
        for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == '(') {
                stack.push(i);
            } 
            else {
                stack.pop();
                
                if(stack.isEmpty()) {
                    stack.push(i);
                } 
                else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
}
*/
