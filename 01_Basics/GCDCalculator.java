/*
Problem: GCD of Two Numbers

Approach:
- Use Euclidean Algorithm
- Repeatedly replace (n, m) with (m, n % m)
- Continue until m becomes 0
- Final value of n is the GCD

Time Complexity: O(log(min(n, m)))
Space Complexity: O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GCDCalculator{
  
public static void main(String[] args) throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int n = Integer.parseInt(br.readLine());
  int m = Integer.parseInt(br.readLine());
 int  result = findGCD(n, m);
 
 System.out.print(result);
}

public static int findGCD(int n, int m){

    // convert to positive to avoid issues with negative inputs
    n = Math.abs(n);
    m = Math.abs(m);

    while (m != 0){
        int temp = m;

        m = n % m;

        n = temp;
    }
    return n;
}
 
 }
 
