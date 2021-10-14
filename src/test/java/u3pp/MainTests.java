package u3pp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static com.github.stefanbirkner.systemlambda.SystemLambda.withTextFromSystemIn;

/**
 * Unit Tests for Unit 3 Programming Project
 */
public class MainTests {

    @Test
    void main_whenMainMethodIsCalledWithValidInput_AcceptsInputUntilStopIsEntered() throws Exception {
        assertDoesNotThrow(() -> tapSystemOut(() -> {
            withTextFromSystemIn("100", "1580", "2020", "STOP").execute(() -> Main.main(null));
        }));
    }

    @Test
    void main_whenMainMethodIsCalledWithLongValidInput_AcceptsInputUntilStopIsEntered() throws Exception {
        String[] input = new String[100];
        for(int i = 0; i < 99; i++) {
            input[i] = "" + (int)(Math.random() * 2040 + 1);
        }
        input[99] = "STOP";
        assertDoesNotThrow(() -> tapSystemOut(() -> {
            withTextFromSystemIn(input).execute(() -> Main.main(null));
        }));
    }

    @Test
    void main_whenCalledWithValidInput_FormatsOutPutCorrectly() throws Exception {
        String EOL = System.getProperty("line.separator");
        String expectedText = "Enter a year (or enter STOP to end): " + EOL
            + "100 is not a leap year" + EOL
            + "Enter a year (or enter STOP to end): " + EOL
            + "1580 is not a leap year" + EOL
            + "Enter a year (or enter STOP to end): " + EOL
            + "2020 is a leap year" + EOL
            + "Enter a year (or enter STOP to end): " + EOL;
        String studentText = tapSystemOut(() -> {
            withTextFromSystemIn("100", "1580", "2020", "STOP").execute(() -> Main.main(null));
        });

        assertEquals(expectedText, studentText);
    }
}
