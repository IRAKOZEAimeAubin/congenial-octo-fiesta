import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationTestOne {
    Calculation calculation = new Calculation();
    @Test
    public void tenPlusTenEqualsTwenty(){
        assertEquals(4, calculation.add(2,2));
    }
    @Test
    public void sevenMinusThreeEqualsFour(){
        assertEquals(4, calculation.subtract(7, 3));
    }
}