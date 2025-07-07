public class AnagramCheck {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            freq[c - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(areAnagrams("listen", "silent"));   // true
        System.out.println(areAnagrams("hello", "bello"));     // false
        System.out.println(areAnagrams("aabbcc", "baccab"));   // true
        System.out.println(areAnagrams("rat", "car"));         // false
        System.out.println(areAnagrams("night", "thing"));     // true
    }
}
