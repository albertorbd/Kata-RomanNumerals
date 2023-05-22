import com.svalero.RomanNumerals;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static sun.nio.cs.Surrogate.is;

public class RomanNumeralsShould {

    RomanNumerals romanNumerals = new RomanNumerals();
    @Test
    public void testRomanConvert() {
        String One = this.romanNumerals.convertRoman(1);
        Assert.assertTrue(One.equals("I"));
    }
}
