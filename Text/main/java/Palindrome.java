public class Palindrome {
    public static boolean isPalindrome(String in) {
        String reverse = ReverseString.reverseString(in);
        return in.equals(reverse);
    }
}
