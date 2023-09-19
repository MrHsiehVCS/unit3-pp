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
      assertFalse(LeapYear.isLeapYear(2));
      assertFalse(LeapYear.isLeapYear(400));
      assertFalse(LeapYear.isLeapYear(1581));
    }
    
    @Test
    void isLeapYear_WhenCalledWithAnOddYear_ShouldReturnFalse() {
      assertFalse(LeapYear.isLeapYear(1999));
      assertFalse(LeapYear.isLeapYear(2001));
      assertFalse(LeapYear.isLeapYear(3001));
    }

    @Test
    void isLeapYear_WhenCalledWithAnEvenYearNotDivisibleByFour_ShouldReturnFalse() {
      assertFalse(LeapYear.isLeapYear(1998));
      assertFalse(LeapYear.isLeapYear(2002));
      assertFalse(LeapYear.isLeapYear(4010));
    }

    @Test
    void isLeapYear_WhenCalledWithACentennialYearNotDivisibleByFourHundred_ShouldReturnFalse() {
      assertFalse(LeapYear.isLeapYear(1900));
      assertFalse(LeapYear.isLeapYear(2100));
      assertFalse(LeapYear.isLeapYear(3100));
    }

    @Test
    void isLeapYear_WhenCalledWithAYearThatIsDivisibleByFour_ShouldReturnTrue() {
      assertTrue(LeapYear.isLeapYear(2004));
      assertTrue(LeapYear.isLeapYear(2404));
      assertTrue(LeapYear.isLeapYear(3404));
    }

    @Test
    void isLeapYear_WhenCalledWithACentennialYearDivisibleByFourHundred_ShouldReturnTrue() {
      assertTrue(LeapYear.isLeapYear(2000));
      assertTrue(LeapYear.isLeapYear(2400));
      assertTrue(LeapYear.isLeapYear(3200));
    }
}
