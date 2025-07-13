
import java.util.Arrays;

public class ValidAnagram{
    // method01: By sorting time complexity O(nlogn)
    public static boolean anagram(String s, String t ){
        if (s.length() != t.length()) return false;

        //converting string to char array
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        
        //sorting cahr array
        Arrays.sort(a);
        Arrays.sort(b);
        
       //comparing sorting array
       for(int i=0; i<a.length; i++){
        if(a[i] != b[i]) return false;
       }
       return true;
    }

    //method02: By frequency count(Hashing Array)  TC 0(n) & SC O(1) constant speed
    public static boolean anagramM2(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // for a–z
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // increment count for s
            count[t.charAt(i) - 'a']--; // decrement count for t
        }

        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "naagram";
        System.out.println(anagramM2(s, t));

    }
}