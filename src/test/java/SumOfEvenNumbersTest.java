import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class SumOfEvenNumbersTest {

    private String runProgramWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream outBytes = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outBytes);

        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        System.setOut(out);
        System.setIn(in);

        try {
            SumOfEvenNumbers.main(new String[]{});
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }

        return outBytes.toString(StandardCharsets.UTF_8);
    }

    @Test
    public void testInput2() {
        String output = runProgramWithInput("2");
        assertTrue(output.contains("The sum of even numbers between 2 and 2 is 2."));
    }

    @Test
    public void testInput3() {
        String output = runProgramWithInput("3");
        assertTrue(output.contains("The sum of even numbers between 2 and 3 is 2."));
    }

    @Test
    public void testInput4() {
        String output = runProgramWithInput("4");
        assertTrue(output.contains("The sum of even numbers between 2 and 4 is 6."));
    }

    @Test
    public void testInput5() {
        String output = runProgramWithInput("5");
        assertTrue(output.contains("The sum of even numbers between 2 and 5 is 6."));
    }

    @Test
    public void testInput6() {
        String output = runProgramWithInput("6");
        assertTrue(output.contains("The sum of even numbers between 2 and 6 is 12."));
    }

    @Test
    public void testInput8() {
        String output = runProgramWithInput("8");
        assertTrue(output.contains("The sum of even numbers between 2 and 8 is 20."));
    }

    @Test
    public void testInput10() {
        String output = runProgramWithInput("10");
        assertTrue(output.contains("The sum of even numbers between 2 and 10 is 30."));
    }

    @Test
    public void testInput12() {
        String output = runProgramWithInput("12");
        assertTrue(output.contains("The sum of even numbers between 2 and 12 is 42."));
    }

    @Test
    public void testInput20() {
        String output = runProgramWithInput("20");
        assertTrue(output.contains("The sum of even numbers between 2 and 20 is 110."));
    }

    @Test
    public void testInput100() {
        String output = runProgramWithInput("100");
        assertTrue(output.contains("The sum of even numbers between 2 and 100 is 2550."));
    }

    @Test
    public void testInput1() {
        String output = runProgramWithInput("1");
        assertTrue(output.contains("Error: Input must be 2 or greater."));
    }

    @Test
    public void testInput0() {
        String output = runProgramWithInput("0");
        assertTrue(output.contains("Error: Input must be 2 or greater."));
    }

    @Test
    public void testInputNegative1() {
        String output = runProgramWithInput("-1");
        assertTrue(output.contains("Error: Input must be 2 or greater."));
    }

    @Test
    public void testInputNegative10() {
        String output = runProgramWithInput("-10");
        assertTrue(output.contains("Error: Input must be 2 or greater."));
    }

    @Test
    public void testInput7() {
        String output = runProgramWithInput("7");
        assertTrue(output.contains("The sum of even numbers between 2 and 7 is 12."));
    }

    @Test
    public void testInput9() {
        String output = runProgramWithInput("9");
        assertTrue(output.contains("The sum of even numbers between 2 and 9 is 20."));
    }

    @Test
    public void testInput11() {
        String output = runProgramWithInput("11");
        assertTrue(output.contains("The sum of even numbers between 2 and 11 is 30."));
    }

    @Test
    public void testInput15() {
        String output = runProgramWithInput("15");
        assertTrue(output.contains("The sum of even numbers between 2 and 15 is 56."));
    }

    @Test
    public void testInput25() {
        String output = runProgramWithInput("25");
        assertTrue(output.contains("The sum of even numbers between 2 and 25 is 156."));
    }

    @Test
    public void testInput50() {
        String output = runProgramWithInput("50");
        assertTrue(output.contains("The sum of even numbers between 2 and 50 is 650."));
    }

    @Test
    public void testInputPrompt() {
        String output = runProgramWithInput("5");
        assertTrue(output.contains("Enter"), 
            "❌ Program should prompt user for input!");
    }

    @Test
    public void testNoCompilationErrors() {
        String output = runProgramWithInput("5");
        assertFalse(output.contains("Exception"), 
            "❌ Program should not throw exceptions!");
        assertFalse(output.contains("Error:"), 
            "❌ Program should not have runtime errors!");
    }

    @Test
    public void testErrorMessageFormat() {
        String output = runProgramWithInput("1");
        assertTrue(output.contains("Error: Input must be 2 or greater."), 
            "❌ Error message should be exactly: 'Error: Input must be 2 or greater.'");
    }

    @Test
    public void testResultMessageFormat() {
        String output = runProgramWithInput("8");
        assertTrue(output.contains("The sum of even numbers between 2 and 8 is 20."), 
            "❌ Result message should be in format: 'The sum of even numbers between 2 and X is Y.'");
    }
}
