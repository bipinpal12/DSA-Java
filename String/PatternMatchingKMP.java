import java.util.*;

public class PatternMatchingKMP {
    static class Solution {
        ArrayList<Integer> search(String pat, String txt) {
            ArrayList<Integer> result = new ArrayList<>();
            int[] lps = computeLPS(pat);
            int i = 0, j = 0;

            while (i < txt.length()) {
                if (txt.charAt(i) == pat.charAt(j)) {
                    i++; j++;
                    if (j == pat.length()) {
                        result.add(i - j);
                        j = lps[j - 1];
                    }
                } else {
                    if (j != 0) {
                        j = lps[j - 1];
                    } else {
                        i++;
                    }
                }
            }
            return result;
        }

        private int[] computeLPS(String pat) {
            int[] lps = new int[pat.length()];
            int len = 0, i = 1;

            while (i < pat.length()) {
                if (pat.charAt(i) == pat.charAt(len)) {
                    len++;
                    lps[i++] = len;
                } else {
                    if (len != 0) {
                        len = lps[len - 1];
                    } else {
                        lps[i++] = 0;
                    }
                }
            }
            return lps;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.search("abc", "ababcababc")); // [2, 7]
        System.out.println(sol.search("aa", "aaaaa"));        // [0, 1, 2, 3]
        System.out.println(sol.search("xyz", "abcdef"));      // []
    }
}
