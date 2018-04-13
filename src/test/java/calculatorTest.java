import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {

    @Test
    public void sum() {
        calculator c = new calculator();
        assertEquals(30, c.sum(10,20));
        assertEquals(20, c.sum(10,10));
        assertEquals(30, c.sum(10,4));

    }

    @Test
    public void minus() {
        calculator c = new calculator();
        assertEquals(20, c.minus(20, 0));
        assertEquals(10, c.minus(20, 10));

    }
}