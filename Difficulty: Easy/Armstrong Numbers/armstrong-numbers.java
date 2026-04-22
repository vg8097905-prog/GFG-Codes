class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int ans = n;
        while(n != 0){
            int d = n%10;
            sum += d*d*d;
            n /= 10;
        }
        
        return sum == ans;
    }
}

