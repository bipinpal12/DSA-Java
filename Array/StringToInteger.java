public class StringToInteger {

    public static int myAtoi(String s) {
        int i=0;
       int  n = s.length();
        int sign = 1;
        int result = 0;
        
        while(i<n && s.charAt(i) == ' '){
            i++;
            
        }
        
        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '-')? -1:1;
            i++;
        }
        
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
        
        if(result > (Integer.MAX_VALUE - digit) / 10){
            return (sign == 1) ? Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        result = result * 10 + digit;
        i++;
        
    }
    return result*sign;
}
    public static void main(String[] args) {
        String input1 = "   -42";
        String input2 = "4193 with words";
        String input3 = "words and 987";
        String input4 = "-91283472332";

        System.out.println(myAtoi(input1)); // -42
        System.out.println(myAtoi(input2)); // 4193
        System.out.println(myAtoi(input3)); // 0
        System.out.println(myAtoi(input4)); // -2147483648 (clamped)
    }
}
