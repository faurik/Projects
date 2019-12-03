import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PigLatinTest {

    @Test
    public void convertToPigLatin() {
        Assert.assertEquals("eethray", PigLatin.convertToPigLatin("three"));
        Assert.assertEquals("arlkay olestay oralscay omfray araclay", PigLatin.convertToPigLatin("Karl stole corals from Clara"));
    }
}