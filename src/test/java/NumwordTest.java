import org.junit.*;
import static org.junit.Assert.*;

public class NumwordTest {

    @Test
    public void checkInt_inputMustBeANumber_true() {
        Numword newNumword = new Numword();

        assertEquals(true, newNumword.checkInt("424"));
    }

    @Test
    public void checkInt_inputCantBeAWord_true() {
        Numword newNumword = new Numword();

        assertEquals(false, newNumword.checkInt("kitten"));
    }

    @Test
    public void numToWord_getOnesDigit_true() {
        Numword newNumword = new Numword();

        assertEquals("two", newNumword.numToWord("2"));
    }
}
