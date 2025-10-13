import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class CharacterPerLineTest {

    private String runProgramWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream outBytes = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outBytes);

        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        System.setOut(out);
        System.setIn(in);

        try {
            CharacterPerLine.main(new String[]{});
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }

        return outBytes.toString(StandardCharsets.UTF_8);
    }

    @Test
    public void testHello() {
        String output = runProgramWithInput("hello");
        String expected = "Enter a word: h\ne\nl\nl\no\n";
        assertEquals(expected, output);
    }

    @Test
    public void testJava() {
        String output = runProgramWithInput("java");
        String expected = "Enter a word: j\na\nv\na\n";
        assertEquals(expected, output);
    }

    @Test
    public void testA() {
        String output = runProgramWithInput("a");
        String expected = "Enter a word: a\n";
        assertEquals(expected, output);
    }

    @Test
    public void testAb() {
        String output = runProgramWithInput("ab");
        String expected = "Enter a word: a\nb\n";
        assertEquals(expected, output);
    }

    @Test
    public void testAbc() {
        String output = runProgramWithInput("abc");
        String expected = "Enter a word: a\nb\nc\n";
        assertEquals(expected, output);
    }

    @Test
    public void testProgramming() {
        String output = runProgramWithInput("programming");
        String expected = "Enter a word: p\nr\no\ng\nr\na\nm\nm\ni\nn\ng\n";
        assertEquals(expected, output);
    }

    @Test
    public void testComputer() {
        String output = runProgramWithInput("computer");
        String expected = "Enter a word: c\no\nm\np\nu\nt\ne\nr\n";
        assertEquals(expected, output);
    }

    @Test
    public void testScience() {
        String output = runProgramWithInput("science");
        String expected = "Enter a word: s\nc\ni\ne\nn\nc\ne\n";
        assertEquals(expected, output);
    }

    @Test
    public void testMathematics() {
        String output = runProgramWithInput("mathematics");
        String expected = "Enter a word: m\na\nt\nh\ne\nm\na\nt\ni\nc\ns\n";
        assertEquals(expected, output);
    }

    @Test
    public void testAlgorithm() {
        String output = runProgramWithInput("algorithm");
        String expected = "Enter a word: a\nl\ng\no\nr\ni\nt\nh\nm\n";
        assertEquals(expected, output);
    }

    @Test
    public void testMississippi() {
        String output = runProgramWithInput("mississippi");
        String expected = "Enter a word: m\ni\ns\ns\ni\ns\ns\ni\np\np\ni\n";
        assertEquals(expected, output);
    }

    @Test
    public void testBookkeeper() {
        String output = runProgramWithInput("bookkeeper");
        String expected = "Enter a word: b\no\no\nk\nk\ne\ne\np\ne\nr\n";
        assertEquals(expected, output);
    }

    @Test
    public void testX() {
        String output = runProgramWithInput("x");
        String expected = "Enter a word: x\n";
        assertEquals(expected, output);
    }

    @Test
    public void testZ() {
        String output = runProgramWithInput("z");
        String expected = "Enter a word: z\n";
        assertEquals(expected, output);
    }

    @Test
    public void testHi() {
        String output = runProgramWithInput("hi");
        String expected = "Enter a word: h\ni\n";
        assertEquals(expected, output);
    }

    @Test
    public void testGo() {
        String output = runProgramWithInput("go");
        String expected = "Enter a word: g\no\n";
        assertEquals(expected, output);
    }

    @Test
    public void testSupercalifragilisticexpialidocious() {
        String output = runProgramWithInput("supercalifragilisticexpialidocious");
        assertTrue(output.contains("Enter a word:"));
        assertTrue(output.contains("s"));
        assertTrue(output.contains("u"));
        assertTrue(output.contains("p"));
        assertTrue(output.contains("e"));
        assertTrue(output.contains("r"));
    }

    @Test
    public void testAntidisestablishmentarianism() {
        String output = runProgramWithInput("antidisestablishmentarianism");
        assertTrue(output.contains("Enter a word:"));
        assertTrue(output.contains("a"));
        assertTrue(output.contains("n"));
        assertTrue(output.contains("t"));
        assertTrue(output.contains("i"));
    }

    @Test
    public void testHelloWorld() {
        String output = runProgramWithInput("HelloWorld");
        String expected = "Enter a word: H\ne\nl\nl\no\nW\no\nr\nl\nd\n";
        assertEquals(expected, output);
    }

    @Test
    public void testJavaProgramming() {
        String output = runProgramWithInput("JavaProgramming");
        String expected = "Enter a word: J\na\nv\na\nP\nr\no\ng\nr\na\nm\nm\ni\nn\ng\n";
        assertEquals(expected, output);
    }

    @Test
    public void testWord123() {
        String output = runProgramWithInput("word123");
        String expected = "Enter a word: w\no\nr\nd\n1\n2\n3\n";
        assertEquals(expected, output);
    }

    @Test
    public void testTest2024() {
        String output = runProgramWithInput("test2024");
        String expected = "Enter a word: t\ne\ns\nt\n2\n0\n2\n4\n";
        assertEquals(expected, output);
    }

    @Test
    public void testInputPrompt() {
        String output = runProgramWithInput("test");
        assertTrue(output.contains("Enter a word:"), 
            "❌ Program should prompt user for input!");
    }

    @Test
    public void testNoCompilationErrors() {
        String output = runProgramWithInput("test");
        assertFalse(output.contains("Exception"), 
            "❌ Program should not throw exceptions!");
        assertFalse(output.contains("Error:"), 
            "❌ Program should not have runtime errors!");
    }

    @Test
    public void testPromptFormat() {
        String output = runProgramWithInput("test");
        assertTrue(output.contains("Enter a word:"), 
            "❌ Prompt should be exactly: 'Enter a word: '");
    }

    @Test
    public void testEachCharacterOnNewLine() {
        String output = runProgramWithInput("abc");
        assertTrue(output.contains("a"), "Output should contain 'a'");
        assertTrue(output.contains("b"), "Output should contain 'b'");
        assertTrue(output.contains("c"), "Output should contain 'c'");
        assertTrue(output.contains("\n"), "Output should contain newlines");
    }

    @Test
    public void testEmptyString() {
        String output = runProgramWithInput("\n");
        String expected = "Enter a word: ";
        assertEquals(expected, output);
    }

    @Test
    public void testSpaceCharacter() {
        String output = runProgramWithInput(" ");
        String expected = "Enter a word:  \n";
        assertEquals(expected, output);
    }

    @Test
    public void testTabCharacter() {
        String output = runProgramWithInput("\t");
        String expected = "Enter a word: \t\n";
        assertEquals(expected, output);
    }
}
