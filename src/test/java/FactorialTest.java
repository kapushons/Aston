import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        Assert.assertEquals(Factorial.calculate(0), 1);
        Assert.assertEquals(Factorial.calculate(1), 1);
        Assert.assertEquals(Factorial.calculate(5), 120);
        Assert.assertEquals(Factorial.calculate(6), 720);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorialNegativeNumber() {
        Factorial.calculate(-1);
    }
}
