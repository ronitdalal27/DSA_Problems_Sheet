/*
Q1. sort the array of 0s, 1s and 2s
Ans:-
class Solution {
    public void sort012(int[] arr) {
        // code here
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else { // arr[mid] == 2
                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }
}
*/

/*
Q2. Sorted the half sorted array
Ans:-
// User function Template for Java

class Solution {
    public static void sortHalves(int arr[], int n) {
        // your code here
        int k = 0;
        for(int i=1 ; i<n ; i++){ //to find the division of array of sorting
            if(arr[i] < arr[i-1]){
                k = i;
                break;
            }
        }
        
        if(k == 0)  //array already sorted 
            return;
            
        int i=0,j=k,index = 0;
        int[] temp = new int[n];
        
        while(i<k && j<n){
            if(arr[i] <= arr[j]){
                temp[index++] = arr[i++];
            }else{
                temp[index++] = arr[j++];
            }
        }
        
        while(i<k){
            temp[index++] = arr[i++]; 
        }
        
        while(j < n){
            temp[index++] = arr[j++];
        }
        
        for(int l=0 ; l<n ; l++){
            arr[l] = temp[l];
        }
        
    }
}
*/

/*
Q3. triplet family - find two numbers in the array such that their sum is equal to the third number.
Ans:-
class Solution {
    public boolean findTriplet(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        
        Arrays.sort(arr);
        
        for(int k=arr.length-1 ; k>=2 ; k--){
            int i=0, j=k-1;
            
            while(i<j){
                int sum = arr[i] + arr[j];
                
                if(sum == arr[k]){
                    return true;
                }else if(sum < arr[k]){
                    i++;
                }else{
                    j--;
                }
            }
        }
        
        return false;
        
    }
}
*/

/*
Q4. Bubble Sort
Ans:-
class Solution {
    public void bubbleSort(int arr[], int n) {
        // code here
        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
*/

/*
Q5. Merge Sort
Ans:-
class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l < r){
            int mid = l + (r-l)/2;
            
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            
            merge(arr, l, mid, r);
        }
    }
    
    private void merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for(int i=0 ; i<n1 ; i++){
            left[i] = arr[l + i];
        }
        
        for(int j=0 ; j<n2 ; j++){
            right[j] = arr[mid + 1 + j];
        }
        
        int i=0,j=0,index=l;
        
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[index++] = left[i++];
            }else{
                arr[index++] = right[j++];
            }
        }
        
        while(i < n1){
            arr[index++] = left[i++];
        }
        
        while(j < n2){
            arr[index++] = right[j++];
        }
    }
}
*/  