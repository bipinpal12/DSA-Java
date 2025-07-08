public class FirstUniqueChar {
    public static char firstNonRepeatingChar(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) return c;
        }

        return '$'; // No unique char
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("aabccdeff")); // d
        System.out.println(firstNonRepeatingChar("aabbcc"));    // $ (=> -1)
        System.out.println(firstNonRepeatingChar("z"));         // z
    }
}
