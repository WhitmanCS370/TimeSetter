import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeSetterTest {

    /**
     * Tests suggested by ChatGPT with the following prompt(s):
     * Please generate JUnit4 tests for the following class: ...
     * I modified the test cases to compute the number of days so they are more transparent.
     */

    @Test
    public void testDaysToYear1() {
        assertEquals(1980, TimeSetter.daysToYear(0));
    }

    @Test
    public void testDaysToYear2() {
        assertEquals(1981, TimeSetter.daysToYear(367));
    }

    @Test
    public void testDaysToYear3() {
        assertEquals(1985, TimeSetter.daysToYear((1985-1980)*365+43));
    }

    @Test
    public void testDaysToYear4() {
        assertEquals(2000, TimeSetter.daysToYear((2000-1980)*365+128));
    }

    @Test
    public void testDaysToYear5() {
        assertEquals(2022, TimeSetter.daysToYear((2022-1980)*365+300));
    }

}
