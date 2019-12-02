import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void reverseString() {
        Assert.assertEquals("olleH", ReverseString.reverseString("Hello"));
        Assert.assertEquals("", ReverseString.reverseString(""));
        Assert.assertEquals(" testing done ", ReverseString.reverseString(" enod gnitset "));
    }
}