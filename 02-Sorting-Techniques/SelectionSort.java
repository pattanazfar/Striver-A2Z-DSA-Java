/*
Problem: Selection Sort

Approach:
- Iterate through the array
- For each position, find the minimum element in the remaining unsorted part
- Swap it with the current position
- Repeat until the array is sorted

Edge Cases:
- Empty array or single element --> already sorted
- Duplicate elements --> handled naturally

Time Complexity: O(n^2)
Space Complexity: O(1)  
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SelectionSort {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      int[] arr = new int[n];
      String[] input = br.readLine().split(" ");
      for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(input[i]);
      }
      selectionSort(arr);
      for(int num : arr){
        System.out.print(num+" ");
      }
      
    }
    
    public static void selectionSort(int[] arr){
      int n=arr.length;
      if(n<=1) return;     // handle small input (0 or 1 element → already sorted)
      for(int i=0;i<n-1;i++){
        int minIndex = i;
        for(int j=i+1;j<n;j++){
          if(arr[j]<arr[minIndex])
              minIndex=j;        
        }
          if(minIndex != i){   // no swap needed if current element is already minimum
            int temp = arr[minIndex];
            arr[minIndex]   = arr[i];
            arr[i]   = temp;
          }
          
      }
      
    }
}