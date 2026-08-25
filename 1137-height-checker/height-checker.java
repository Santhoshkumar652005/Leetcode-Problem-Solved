import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {

        // Create a copy
        int[] expected = heights.clone();

        // Sort the copy
        Arrays.sort(expected);

        int count = 0;

        // Compare original and sorted arrays
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}