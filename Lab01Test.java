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
        // Redirect System.out to capture program output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testTask2HelloWorld() {
        Lab01.main(new String[]{});
        String output = outContent.toString();
        assertTrue("Task 2 Failed: Output must contain 'Hello, World!'", 
            output.contains("Hello, World!"));
    }

    @Test
    public void testTask3ProfessorNames() {
        Lab01.main(new String[]{});
        String output = outContent.toString();
        assertTrue("Task 3 Failed: Missing 'Professor'", output.contains("Professor"));
        assertTrue("Task 3 Failed: Missing 'Professor Sarah'", output.contains("Professor Sarah"));
        assertTrue("Task 3 Failed: Missing 'Professor Lin'", output.contains("Professor Lin"));
    }

    @Test
    public void testTask4RightTriangle() {
        Lab01.main(new String[]{});
        // Normalize line endings for Windows/Linux compatibility
        String output = outContent.toString().replace("\r\n", "\n"); 
        
        assertTrue("Task 4 Failed: Row 1 (*) missing", output.contains("*"));
        assertTrue("Task 4 Failed: Row 2 (**) missing", output.contains("**"));
        assertTrue("Task 4 Failed: Row 3 (***) missing", output.contains("***"));
        assertTrue("Task 4 Failed: Row 4 (****) missing", output.contains("****"));
        assertTrue("Task 4 Failed: Row 5 (*****) missing", output.contains("*****"));
    }
}
