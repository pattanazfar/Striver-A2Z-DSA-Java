/*
Problem: Palindrome Number
Approach:
- Reverse the given number
- Compare reversed number with original number
- If equal → palindrome, else not

Time Complexity: O(log10 N)
Space Complexity: O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PalindromeNumber{
  
public static void main(String[] args) throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int n = Integer.parseInt(br.readLine());
 
 boolean result = isPalindrome(n);
 
 System.out.print(result ? "Palindrome" : "Not Palindrome");
 
 
 }
 
 public static boolean isPalindrome(int n){
   
   if (n<0) return false;
   int original = n;
   int reversed =0;
   while(n!=0){
   int lastDigit = n % 10;
   n/=10;
  
   reversed = reversed*10 + lastDigit;
   }
   
 return reversed == original;
 }
}