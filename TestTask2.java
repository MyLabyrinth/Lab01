import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestTask2 {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before public void setUp() { System.setOut(new PrintStream(outContent)); }
    @After public void restore() { System.setOut(System.out); }

    @Test
    public void testHelloWorld() {
        Lab01.main(new String[]{});
        assertTrue("Task 2 Failed: Output must contain 'Hello, World!'", 
            outContent.toString().contains("Hello, World!"));
    }
}
