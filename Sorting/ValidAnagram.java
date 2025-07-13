
import java.util.Arrays;

public class ValidAnagram{
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
}