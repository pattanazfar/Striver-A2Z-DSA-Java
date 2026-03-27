import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Prime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        boolean result = isPrime(n);
        System.out.print(result);
    }
        
        public static boolean isPrime(int n){
        
        if (n <= 1) return false; // 0, 1 and negatives are not prime


        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                  return false;
            }
        }
            return true;
    }
}