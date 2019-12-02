public class ReverseString {
    public static String reverseString(String string) {
        char[] chars = new char[string.length()];
        for (int j = 0, i = string.length() - 1; i >= 0; i--, j++) {
            chars[j] = string.charAt(i);
        }
        return new String(chars);
    }
}