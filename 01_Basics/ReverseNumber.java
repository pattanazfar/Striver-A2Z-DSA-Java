/*
Problem: Reverse Integer

Approach:
- Extract last digit using modulus (% 10)
- Append it to reversed number (reversed * 10 + digit)
- Check for overflow before updating result

Time Complexity: O(log10 N)
Space Complexity: O(1)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReverseNumber { 

    
    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Overflow check
            if (reversed > Integer.MAX_VALUE / 10 || 
               (reversed == Integer.MAX_VALUE / 10 && digit > 7)) return 0;    //Max: 2147483647

            if (reversed < Integer.MIN_VALUE / 10 || 
               (reversed == Integer.MIN_VALUE / 10 && digit < -8)) return 0;   //Min: -2147483648

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int number = Integer.parseInt(br.readLine());

        int result = reverse(number);

        System.out.println(result);
    }
}