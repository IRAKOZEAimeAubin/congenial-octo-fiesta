import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationTestTwo {
    Calculation calculation = new Calculation();
    @Test
    public void twentyTimesTenEqualsTWoHundred(){
        assertEquals(200, calculation.multiply(20, 10));
    }
    @Test
    public void seventeenDividedByTwoEquals(){
        assertEquals(8.5, calculation.divide(17, 2), 0);
    }
}