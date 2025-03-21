import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator myCalc;

    @BeforeEach
    void setup()
    {
        myCalc = new Calculator();
    }
    @Test
    void testAddSuccess()
    {
        assertEquals(8, myCalc.add(4,4));
    }
    @Test
    void testAddFail()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> {myCalc.add(Integer.MAX_VALUE, 4);});
        assertEquals("The value was too big", ex.getMessage());
    }

    @Test
    void testDivideSuccess()
    {
        assertEquals(2, myCalc.divide(10,5));
    }

    @Test
    void testDivideFailure()
    {
        Exception ex = assertThrows(ArithmeticException.class, () -> {myCalc.divide(10,0);});
        assertEquals("Cannot divide by zero", ex.getMessage());
    }
}
