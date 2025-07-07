public class BinaryAddition {
    public static String addBinary(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int bit1 = (i >= 0) ? s1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? s2.charAt(j--) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') {
            sb.setLength(sb.length() - 1);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(addBinary("0011", "0001"));   // Output: 100
        System.out.println(addBinary("0000", "0000"));   // Output: 0
        System.out.println(addBinary("111", "1"));       // Output: 1000
        System.out.println(addBinary("1010", "1011"));   // Output: 10101
        System.out.println(addBinary("000010", "0001")); // Output: 11
    }
}
