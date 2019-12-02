import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountVowelsTest {

    @Test
    public void countVowels() {
        Assert.assertEquals(2, CountVowels.countVowels("Hello"));
        Assert.assertEquals(0, CountVowels.countVowels("qwsdrtgh"));
        Assert.assertEquals(5, CountVowels.countVowels("iostat super"));
    }

    @Test
    public void countVowelsReport() {
        Assert.assertEquals("{a=0, e=1, i=0, o=1, u=0}", CountVowels.countVowelsReport("Hello"));
        Assert.assertEquals("{a=0, e=0, i=0, o=0, u=0}", CountVowels.countVowelsReport("qwsdrtgh"));
        Assert.assertEquals("{a=1, e=1, i=1, o=1, u=1}", CountVowels.countVowelsReport("iostat super"));
    }
}