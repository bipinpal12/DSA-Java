/*-------------------------DAY26------------------------
 * 
 */

public class FindDifference{
      public char findTheDifference(String s, String t) {
    char res = 0;
    for (char c : s.toCharArray()) res ^= c;
    for (char c : t.toCharArray()) res ^= c;
    return res;


    }
}