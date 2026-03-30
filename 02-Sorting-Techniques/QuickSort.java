/*
Problem: Quick Sort

Approach:
- Choose a pivot (first element in this case)
- Partition the array such that:
  - Elements <= pivot are on the left
  - Elements > pivot are on the right
- Place pivot in its correct position
- Recursively apply the same process on left and right subarrays

Edge Cases:
- Empty array or single element --> already sorted
- Already sorted array --> worst-case performance (depends on pivot choice)
- Duplicate elements --> handled, but not stable

Time Complexity:
- Best & Average: O(n log n)
- Worst: O(n^2)   // when pivot is smallest/largest repeatedly

Space Complexity: O(log n)   // recursion stack
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class QuickSort {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    String[] input = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }

    quickSort(arr, 0, n - 1);

    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low >= high) return;

    int partition = quick(arr, low, high);

    quickSort(arr, low, partition - 1);
    quickSort(arr, partition + 1, high);
  }

  private static int quick(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low + 1;
    int j = high;

    while (i <= j) {

      while (i <= high && arr[i] <= pivot) {
        i++;
      }

      while (j >= low && arr[j] > pivot) {
        j--;
      }

      if (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // Place pivot correctly
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
  }
}