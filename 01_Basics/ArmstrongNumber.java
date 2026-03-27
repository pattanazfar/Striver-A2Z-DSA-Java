/*
Problem: Check if a Number is an Armstrong Number

Approach:
- Count total number of digits in the number
- Extract each digit using modulo (% 10)
- Raise each digit to the power of total digits
- Add all the values
- If sum equals original number → Armstrong number

Edge Cases:
- Negative numbers --> not Armstrong
- 0 --> treated as a 1-digit Armstrong number

Time Complexity: O(log n)
Space Complexity: O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArmstrongNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    boolean result = isArmstrongNumber(n);
    System.out.println(result ? "Armstrong" : "Not Armstrong");
  }
  
  public static boolean isArmstrongNumber(int n){

    // negative numbers are not considered Armstrong
    if (n < 0) return false;

    int original = n;
    int temp = n;

    // handle 0 separately --> It's 1-digit Armstrong number
    int count = (n == 0) ? 1 : 0;

    // count number of digits
    while(temp > 0){
        temp /= 10;
        count++;
    }

        int sum = 0;
        // calculate sum of digits raised to power 'count'
        while(n > 0){
            int lastDigit = n % 10;
            sum += (int)Math.pow(lastDigit, count);
            n /= 10;
        }
    return sum == original;
}
}