import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s2.length();
        int k = s1.length();

        int[] s1Count = new int[26];

        // Count characters in s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        // Check every window of size k
        for (int i = 0; i <= n - k; i++) {

            int[] sCount = new int[26];

            // Count characters in current window
            for (int j = i; j < i + k; j++) {
                sCount[s2.charAt(j) - 'a']++;
            }

            // Check if current window is a permutation of s1
            if (Arrays.equals(s1Count, sCount)) {
                return true;
            }
        }

        return false;
    }
}