import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> primeRange(int l, int r) {
        // isPrime[i] will track if number i is prime
        boolean[] isPrime = new boolean[r + 1];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime numbers
        if (r >= 0) isPrime[0] = false;
        if (r >= 1) isPrime[1] = false;

        // Run Sieve of Eratosthenes up to sqrt(r)
        for (int p = 2; (long) p * p <= r; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= r; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        // Collect all prime numbers in the range [max(2, l), r]
        List<Integer> result = new ArrayList<>();
        int start = Math.max(2, l);
        for (int i = start; i <= r; i++) {
            if (isPrime[i]) {
                result.add(i);
            }
        }

        return result;
    }
}