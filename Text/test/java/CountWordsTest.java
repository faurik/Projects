import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountWordsTest {

    @Test
    public void countUniqueWords() {
        Assert.assertEquals(5, CountWords.countUniqueWords("String with five words here"));
        Assert.assertEquals(0, CountWords.countUniqueWords(""));
        Assert.assertEquals(1, CountWords.countUniqueWords("Word     word"));
    }

    @Test
    public void testCountUniqueWords() {
    }
}