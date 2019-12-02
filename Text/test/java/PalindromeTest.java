import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        Assert.assertTrue(Palindrome.isPalindrome("racecar"));
        Assert.assertFalse(Palindrome.isPalindrome("qwerty"));
        Assert.assertTrue(Palindrome.isPalindrome(""));
    }
}