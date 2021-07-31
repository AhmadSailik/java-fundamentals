/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void linterTest(){
        Path path= Paths.get("../gates.js");
        String[]result={"line 3: Missing semicolon.","line 5: Missing semicolon.", "line 11: Missing semicolon.", "line 13: Missing semicolon.", "line 15: Missing semicolon.", "line 26: Missing semicolon.", "line 28: Missing semicolon.", "line 32: Missing semicolon.", "line 36: Missing semicolon.", "line 40: Missing semicolon.", "line 41: Missing semicolon.", "line 50: Missing semicolon.", "line 51: Missing semicolon.", "line 59: Missing semicolon.", "line 60: Missing semicolon.", "line 61: Missing semicolon.", "line 62: Missing semicolon.", "line 64: Missing semicolon.", "line 70: Missing semicolon.", "line 71: Missing semicolon.", "line 72: Missing semicolon.", "line 73: Missing semicolon.", "line 74: Missing semicolon.", "line 76: Missing semicolon.", "line 77: Missing semicolon.", "line 78: Missing semicolon.", "line 79: Missing semicolon.", "line 80: Missing semicolon.", "line 82: Missing semicolon.", "line 83: Missing semicolon.", "line 84: Missing semicolon.", "line 85: Missing semicolon.", "line 86: Missing semicolon.", "line 88: Missing semicolon.", "line 89: Missing semicolon.", "line 90: Missing semicolon.", "line 91: Missing semicolon.", "line 92: Missing semicolon.", "line 94: Missing semicolon.", "line 95: Missing semicolon.", "line 96: Missing semicolon.", "line 97: Missing semicolon.", "line 98: Missing semicolon.", "line 99: Missing semicolon.", "line 100: Missing semicolon.", "line 101: Missing semicolon."};
        assertEquals("this is supposed javaScriptFile ", Arrays.toString(result),String.valueOf(App.javaScriptFile(path)));

    }
}
