package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void test1() {
        Calculator calculator = new Calculator();
        double value = calculator.calculate("sqrt(9)");
        assertEquals(3D, value);
    }

//    @Test
//    public void test2() {
//        Calculator calculator = new Calculator();
//        double value = calculator.calculate("sqrt(16)");
//        assertEquals(3D, value);
//    }
}
