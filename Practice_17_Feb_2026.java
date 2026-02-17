/*
Q1. Transpose of a matrix
Ans:-
class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        int row = mat.length;
        int col = mat[0].length;
        
        // For each column, create a new row in transpose
        for(int i = 0; i < col; i++){
            
            ArrayList<Integer> newRow = new ArrayList<>();
            
            for(int j = 0; j < row; j++){
                newRow.add(mat[j][i]);   // Notice mat[j][i]
            }
            
            result.add(newRow);
        }
        
        return result;
    }
}
*/

/*
Q2. Count pair sum in a sorted 2d matrix
Ans:-
class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int n = mat1.length;
        int i = 0;              // pointer for mat1 (start)
        int j = n*n - 1;        // pointer for mat2 (end)
        int count = 0;
        
        while(i < n*n && j >= 0){
            
            int r1 = i / n;
            int c1 = i % n;
            
            int r2 = j / n;
            int c2 = j % n;
            
            int sum = mat1[r1][c1] + mat2[r2][c2];
            
            if(sum == x){
                count++;
                i++;
                j--;
            }
            else if(sum < x){
                i++;
            }
            else{
                j--;
            }
        }
        
        return count;
    }
}
*/

/*
Q3. Row with maximum 1s
Ans:-
// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int row = 0;
        int col = arr[0].length - 1;
        int maxRow = -1;
        
        while(row < n && col >= 0){
            
            if(arr[row][col] == 1){
                maxRow = row;   // update answer
                col--;          // move left
            }
            else{
                row++;          // move down
            }
        }
        
        return maxRow;
    }
}
*/