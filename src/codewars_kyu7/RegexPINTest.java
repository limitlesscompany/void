package codewars_kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class RegexPINTest {
    @Test
    public void validPins() {
        assertEquals(true, RegexPIN.validatePin("1234"));
        assertEquals(true, RegexPIN.validatePin("0000"));
        assertEquals(true, RegexPIN.validatePin("1111"));
        assertEquals(true, RegexPIN.validatePin("123456"));
        assertEquals(true, RegexPIN.validatePin("098765"));
        assertEquals(true, RegexPIN.validatePin("000000"));
        assertEquals(true, RegexPIN.validatePin("090909"));
    }
    
    @Test
    public void nonDigitCharacters() {
        assertEquals(false, RegexPIN.validatePin("a234"));
        assertEquals(false, RegexPIN.validatePin(".234"));
    }
    
    @Test
    public void invalidLengths() {
        assertEquals(false, RegexPIN.validatePin("1"));
        assertEquals(false, RegexPIN.validatePin("12"));
        assertEquals(false, RegexPIN.validatePin("123"));
        assertEquals(false, RegexPIN.validatePin("12345"));
        assertEquals(false, RegexPIN.validatePin("1234567"));
        assertEquals(false, RegexPIN.validatePin("-1234"));
        assertEquals(false, RegexPIN.validatePin("1.234"));
        assertEquals(false, RegexPIN.validatePin("00000000"));
    }
}