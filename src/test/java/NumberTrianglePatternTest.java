import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class NumberTrianglePatternTest {

    private String runProgramWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream outBytes = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outBytes);

        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        System.setOut(out);
        System.setIn(in);

        try {
            NumberTrianglePattern.main(new String[]{});
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }

        return outBytes.toString(StandardCharsets.UTF_8);
    }

    @Test
    public void testInput1() {
        String output = runProgramWithInput("1");
        String expected = "Enter a positive integer: \n1\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInput2() {
        String output = runProgramWithInput("2");
        String expected = "Enter a positive integer: \n1\n1 2\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInput3() {
        String output = runProgramWithInput("3");
        String expected = "Enter a positive integer: \n1\n1 2\n1 2 3\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInput4() {
        String output = runProgramWithInput("4");
        String expected = "Enter a positive integer: \n1\n1 2\n1 2 3\n1 2 3 4\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInput5() {
        String output = runProgramWithInput("5");
        String expected = "Enter a positive integer: \n1\n1 2\n1 2 3\n1 2 3 4\n1 2 3 4 5\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInput6() {
        String output = runProgramWithInput("6");
        String expected = "Enter a positive integer: \n1\n1 2\n1 2 3\n1 2 3 4\n1 2 3 4 5\n1 2 3 4 5 6\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInput7() {
        String output = runProgramWithInput("7");
        String expected = "Enter a positive integer: \n1\n1 2\n1 2 3\n1 2 3 4\n1 2 3 4 5\n1 2 3 4 5 6\n1 2 3 4 5 6 7\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInput8() {
        String output = runProgramWithInput("8");
        String expected = "Enter a positive integer: \n1\n1 2\n1 2 3\n1 2 3 4\n1 2 3 4 5\n1 2 3 4 5 6\n1 2 3 4 5 6 7\n1 2 3 4 5 6 7 8\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInput9() {
        String output = runProgramWithInput("9");
        String expected = "Enter a positive integer: \n1\n1 2\n1 2 3\n1 2 3 4\n1 2 3 4 5\n1 2 3 4 5 6\n1 2 3 4 5 6 7\n1 2 3 4 5 6 7 8\n1 2 3 4 5 6 7 8 9\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInput10() {
        String output = runProgramWithInput("10");
        String expected = "Enter a positive integer: \n1\n1 2\n1 2 3\n1 2 3 4\n1 2 3 4 5\n1 2 3 4 5 6\n1 2 3 4 5 6 7\n1 2 3 4 5 6 7 8\n1 2 3 4 5 6 7 8 9\n1 2 3 4 5 6 7 8 9 10\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInput15() {
        String output = runProgramWithInput("15");
        assertTrue(output.contains("Enter a positive integer:"));
        assertTrue(output.contains("1"));
        assertTrue(output.contains("1 2"));
        assertTrue(output.contains("1 2 3"));
        assertTrue(output.contains("1 2 3 4 5"));
        assertTrue(output.contains("1 2 3 4 5 6 7 8 9 10"));
        assertTrue(output.contains("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15"));
    }

    @Test
    public void testInput20() {
        String output = runProgramWithInput("20");
        assertTrue(output.contains("Enter a positive integer:"));
        assertTrue(output.contains("1"));
        assertTrue(output.contains("1 2"));
        assertTrue(output.contains("1 2 3"));
        assertTrue(output.contains("1 2 3 4 5"));
        assertTrue(output.contains("1 2 3 4 5 6 7 8 9 10"));
        assertTrue(output.contains("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20"));
    }

    @Test
    public void testInput0() {
        String output = runProgramWithInput("0");
        String expected = "Enter a positive integer: \n";
        assertEquals(expected, output);
    }

    @Test
    public void testInputNegative1() {
        String output = runProgramWithInput("-1");
        String expected = "Enter a positive integer: \n";
        assertEquals(expected, output);
    }

    @Test
    public void testInputNegative5() {
        String output = runProgramWithInput("-5");
        String expected = "Enter a positive integer: \n";
        assertEquals(expected, output);
    }

    @Test
    public void testInputPrompt() {
        String output = runProgramWithInput("5");
        assertTrue(output.contains("Enter a positive integer:"), 
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
    public void testPromptFormat() {
        String output = runProgramWithInput("5");
        assertTrue(output.contains("Enter a positive integer:"), 
            "❌ Prompt should be exactly: 'Enter a positive integer: '");
    }

    @Test
    public void testRowStructure() {
        String output = runProgramWithInput("4");
        String[] lines = output.split("\n");
        assertTrue(lines[0].contains("Enter a positive integer: "));
        assertTrue(lines[1].equals("1"));
        assertTrue(lines[2].equals("1 2"));
        assertTrue(lines[3].equals("1 2 3"));
        assertTrue(lines[4].equals("1 2 3 4"));
    }

    @Test
    public void testNumberSpacing() {
        String output = runProgramWithInput("3");
        assertTrue(output.contains("1 2"), "Numbers should be separated by spaces");
        assertTrue(output.contains("1 2 3"), "Numbers should be separated by spaces");
    }

    @Test
    public void testEachRowStartsWith1() {
        String output = runProgramWithInput("5");
        String[] lines = output.split("\n");
        for (int i = 1; i < lines.length; i++) {
            assertTrue(lines[i].startsWith("1"), "Each row should start with 1");
        }
    }

    @Test
    public void testAscendingOrder() {
        String output = runProgramWithInput("5");
        assertTrue(output.contains("1 2 3 4 5"), "Numbers should be in ascending order");
        assertTrue(output.contains("1 2 3 4"), "Numbers should be in ascending order");
        assertTrue(output.contains("1 2 3"), "Numbers should be in ascending order");
        assertTrue(output.contains("1 2"), "Numbers should be in ascending order");
    }

    @Test
    public void testTriangularPattern() {
        String output = runProgramWithInput("5");
        String[] lines = output.split("\n");
        assertTrue(lines[1].length() < lines[2].length(), "Each row should be longer than the previous");
        assertTrue(lines[2].length() < lines[3].length(), "Each row should be longer than the previous");
        assertTrue(lines[3].length() < lines[4].length(), "Each row should be longer than the previous");
    }

    @Test
    public void testNumberSequence1() {
        String output = runProgramWithInput("3");
        assertTrue(output.contains("1"), "Should contain 1");
        assertTrue(output.contains("1 2"), "Should contain 1 2");
        assertTrue(output.contains("1 2 3"), "Should contain 1 2 3");
    }

    @Test
    public void testNumberSequence2() {
        String output = runProgramWithInput("6");
        assertTrue(output.contains("1 2 3 4 5 6"), "Should contain full sequence up to 6");
        assertTrue(output.contains("1 2 3 4 5"), "Should contain sequence up to 5");
        assertTrue(output.contains("1 2 3 4"), "Should contain sequence up to 4");
    }

    @Test
    public void testLargeNumber() {
        String output = runProgramWithInput("25");
        assertTrue(output.contains("Enter a positive integer:"));
        assertTrue(output.contains("1"));
        assertTrue(output.contains("1 2"));
        assertTrue(output.contains("1 2 3"));
        assertTrue(output.contains("25"), "Should contain the largest number");
    }
}
