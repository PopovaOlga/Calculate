import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by m18 on 14.01.2016.
 */
public class Test_Calc {

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testDivisionTwoPositiveValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("10 / 5 must be 2", 2, calc.division(10, 5));

    }

    @Test
    public void testAddTwoValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("0 + 5 must be 5", 5, calc.add(0, 5));
    }
    @Test
        public void testDivisionWithNullValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("0 / 5 must be 0", 0, calc.division(0, 5));
    }
      // * @Test
        public void testMultiplyWithNullValues() {
            // Class for testing
            Calc calc = new Calc();

            // Method to check
            assertEquals("0 * 5 must be 0", 0, calc.multiply(0, 5));
        }//
    @After
    public void consolePrintAfter() {
        System.out.println("Congrats!!! ");
    }
}
