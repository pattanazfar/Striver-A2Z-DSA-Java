/*
Problem: Merge Sort

Approach:
- Divide the array into two halves recursively
- Sort each half using merge sort
- Merge the two sorted halves into a single sorted array

Edge Cases:
- Empty array or single element --> already sorted
- Duplicate elements --> handled and stable
- Large input --> efficient compared to O(n^2) sorts

Time Complexity: O(n log n)   // for all cases
Space Complexity: O(n)        // extra array used during merge
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MergeSort{
  public static void main(String[] args)throws IOException{
    
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine());
int[] arr = new int[n];
String[]  input = br.readLine().split(" ");
for(int i=0;i<n;i++){
  arr[i]= Integer.parseInt(input[i]);
}

mergeSort(arr,0,n-1);

for(int i:arr){
  System.out.print(i+" ");
}

  }
  public static void mergeSort(int[] arr, int low, int high){
    if(low>=high) return;
    int mid=(low+high)/2;
    mergeSort(arr,low,mid);
    mergeSort(arr,mid+1,high);
    merge(arr,low,mid,high);
    
  }
  
  public static void merge(int arr[], int low, int mid, int high){
    int temp[] = new int[high-low+1];
    int left = low;
    int right= mid+1;
    int k = 0;
    while(left <= mid && right <= high){
      if(arr[left] <= arr[right]){
        temp[k++] = arr[left++];
      }
      else{
        temp[k++] = arr[right++];
      }
    }
    while(left<= mid){
      temp[k++] = arr[left++];
    }
    while(right <= high){
      temp[k++] = arr[right++];
    }
    for(int i = 0; i < temp.length; i++){
    arr[low + i] = temp[i];
}
  }
}