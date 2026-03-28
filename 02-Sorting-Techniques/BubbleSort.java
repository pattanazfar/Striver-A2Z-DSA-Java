/*
Problem: Bubble Sort

Approach:
- Repeatedly compare adjacent elements
- Swap if left element is greater than right (for ascending order)
- After each pass, the largest element moves to the end
- Use a flag to detect if no swaps occur (early stopping)

Edge Cases:
- Empty array or single element --> already sorted
- Already sorted array --> optimized with early exit
- Duplicate elements --> handled naturally

Time Complexity: O(n^2) worst & average, O(n) best (already sorted)
Space Complexity: O(1)   // in-place sorting
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      int[] arr = new int[n];
      String[] input = br.readLine().split(" ");
      for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(input[i]);
      }
      bubbleSort(arr);
      for(int num : arr){
        System.out.print(num+" ");
      }
      
    }
    
    public static void bubbleSort(int[] arr){
      int n=arr.length;
      if(n<=1) return;     // handle small input (0 or 1 element → already sorted)
      for(int i=n-1;i>=1;i--){
        boolean swapped = false;
        for(int j=0;j<i;j++){
          if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j]   = arr[j+1];
            arr[j+1] = temp;
            swapped = true;
          }
        }
        // if no swaps happened, array is already sorted
        if(!swapped) break;
          
      }
      
    }
}