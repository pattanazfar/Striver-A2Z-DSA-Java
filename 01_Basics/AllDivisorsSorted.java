/*
Problem: Print All Divisors of a Number (Sorted Order)

Approach:
- Iterate from 1 to √n
- If i divides n, print i
- Store (n / i) separately to avoid duplicates
- Print stored divisors in reverse to maintain sorted order

Edge Cases:
- n <= 0 --> no output
- Perfect square --> avoid duplicate divisor

Time Complexity: O(√n)
Space Complexity: O(√n)   // for storing divisors
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class AllDivisorsSorted {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // handle negative and 0
        if (n <= 0) return;

        List<Integer> largeDivisors = new ArrayList<>();
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

                // avoid duplicate (perfect square case)
                if (i != n / i) {
                    largeDivisors.add(n / i);
                }
            }
            
        }
        for(int i=largeDivisors.size()-1; i>=0; i--){
        System.out.println(largeDivisors.get(i));
        }
    }
}