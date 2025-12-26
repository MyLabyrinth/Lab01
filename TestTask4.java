import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestTask4 {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before public void setUp() { System.setOut(new PrintStream(outContent)); }
    @After public void restore() { System.setOut(System.out); }

    @Test
    public void testTriangle() {
        Lab01.main(new String[]{});
        String out = outContent.toString().replace("\r\n", "\n");
        assertTrue("Triangle Row 1 missing", out.contains("*"));
        assertTrue("Triangle Row 5 missing", out.contains("*****"));
    }
}
