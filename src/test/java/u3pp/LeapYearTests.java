package u3pp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit Tests for Unit 3 Programming Project
 */
public class LeapYearTests {

    @Test
    void isLeapYear_WhenCalledWithAYearBeforeFifteenEightyTwo_ShouldReturnFalse() {
        assertFalse(LeapYear.isLeapYear(400));
    }

    @Test
    void isLeapYear_WhenCalledWithAnOddYear_ShouldReturnFalse() {
        assertFalse(LeapYear.isLeapYear(2001));
    }

    @Test
    void isLeapYear_WhenCalledWithAnEvenYearNotDivisibleByFour_ShouldReturnFalse() {
        assertFalse(LeapYear.isLeapYear(1998));
    }

    @Test
    void isLeapYear_WhenCalledWithACentenialYearNotDivisibleByFourHundred_ShouldReturnFalse() {
        assertFalse(LeapYear.isLeapYear(1900));
    }

    @Test
    void isLeapYear_WhenCalledWithAYearThatIsDivisibleByFour_ShouldReturnTrue() {
        assertTrue(LeapYear.isLeapYear(2004));
    }

    @Test
    void isLeapYear_WhenCalledWithACentenialYearDivisibleByFourHundred_ShouldReturnTrue() {
        assertTrue(LeapYear.isLeapYear(2000));
    }
}
