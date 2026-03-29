/*
Problem: Insertion Sort

Approach:
- We logically divide the array into two parts:
  left side = sorted, right side = unsorted (no actual split in memory)
- Assume the first element is already sorted
- Pick the next element (key) from the unsorted part
- Compare the key with elements in the sorted part (right to left)
- Shift all elements greater than the key one position to the right
- Insert the key at its correct position in the sorted part
- Repeat until the entire array becomes sorted

Edge Cases:
- Empty array or single element --> already sorted
- Already sorted array --> no shifts needed (best case)
- Reverse sorted array --> maximum shifts required
- Duplicate elements --> handled naturally (stable sort)

Time Complexity:
- Worst Case: O(n^2)   // reverse sorted
- Average Case: O(n^2)
- Best Case: O(n)      // already sorted (no shifts)

Space Complexity:
- O(1)   // in-place sorting

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InsertionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // handle small input
        if (n <= 1) return;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // shift elements to right to make space for key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place key at correct position
            arr[j + 1] = key;
        }
    }
}