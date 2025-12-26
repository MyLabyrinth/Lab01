import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab01Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testTask2() {
        Lab01.main(new String[]{});
        String output = outContent.toString();
        assertTrue("Task 2 Failed: Output must contain 'Hello, World!'", 
            output.contains("Hello, World!"));
    }

    @Test
    public void testTask3() {
        Lab01.main(new String[]{});
        String output = outContent.toString();
        assertTrue("Missing 'Professor'", output.contains("Professor"));
        assertTrue("Missing 'Professor Sarah'", output.contains("Professor Sarah"));
        assertTrue("Missing 'Professor Lin'", output.contains("Professor Lin"));
    }

    @Test
    public void testTask4() {
        Lab01.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n"); 
        assertTrue("Row 1 (*) missing", output.contains("*"));
        assertTrue("Row 2 (**) missing", output.contains("**"));
        assertTrue("Row 3 (***) missing", output.contains("***"));
        assertTrue("Row 4 (****) missing", output.contains("****"));
        assertTrue("Row 5 (*****) missing", output.contains("*****"));
    }
}
