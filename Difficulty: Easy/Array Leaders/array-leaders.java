import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();

        int maxRight = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                result.add(arr[i]);
                maxRight = arr[i];
            }
        }

        // Reverse to maintain original order
        Collections.reverse(result);
        return result;
    }
}
