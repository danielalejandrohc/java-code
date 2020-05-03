// https://projecteuler.net/problem=4
public class LargestPalindromeNumber {

    public static void main(String[] args) {
        findLargestPalindromeNumber(2);

    }

    public static void findLargestPalindromeNumber(Integer lengthNumber) {
        Integer maxPalindrome = 0;
        Integer iIndex = 0, jIndex = 0;
        for(Integer i = 0; i.toString().length() <= lengthNumber; i++) {
            for(Integer j = 0; j.toString().length() <= lengthNumber; j++) {
                int result = i * j;
                if(result > maxPalindrome && isPalindrome(result)) {
                    maxPalindrome = result;
                    iIndex = i;
                    jIndex = j;
                }
            }
        }
        System.out.println(iIndex.toString() + " x " + jIndex.toString() + " = " + maxPalindrome);
    }

    public static boolean isPalindrome(Integer number) {
        String s = number.toString();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            int latestCursor = chars.length - i - 1;
            if(chars[i] != chars[latestCursor] && i <= (latestCursor) ) {
                return false;
            } else if(i > (latestCursor) ) {
                return true;
            }
        }
        return false;
    }
}
