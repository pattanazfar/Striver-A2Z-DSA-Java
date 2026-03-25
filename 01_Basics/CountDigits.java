/*
Problem: Count Digits

Approach:
- Repeatedly divide the number by 10
- Count iterations until it becomes 0

Time Complexity: O(log10 N)
Space Complexity: O(1)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CountDigits {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        if (number == 0) {
            System.out.println(1);   //Handles 0
            return;
        }

        number = Math.abs(number);   //Handles negative values

        int digitCount = 0;
        while (number > 0) {
            number /= 10;
            digitCount++;
        }

        System.out.println(digitCount);
    }
}