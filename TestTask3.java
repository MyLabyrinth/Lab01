import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestTask3 {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before public void setUp() { System.setOut(new PrintStream(outContent)); }
    @After public void restore() { System.setOut(System.out); }

    @Test
    public void testProfessorNames() {
        Lab01.main(new String[]{});
        String out = outContent.toString();
        assertTrue("Missing 'Professor'", out.contains("Professor"));
        assertTrue("Missing 'Professor Sarah'", out.contains("Professor Sarah"));
        assertTrue("Missing 'Professor Lin'", out.contains("Professor Lin"));
    }
}
