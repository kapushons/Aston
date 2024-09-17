import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void testCalculateFactorial() {
        assertEquals(1, Factorial.calculate(0));
        assertEquals(1, Factorial.calculate(1));
        assertEquals(120, Factorial.calculate(5));
        assertEquals(720, Factorial.calculate(6));
    }

    @Test
    void testCalculateFactorialNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculate(-1));
    }
}