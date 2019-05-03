import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {
    @Test
    @RepeatedTest(1000)
    public void rollGiveTheRandNumberBetweenRange() throws Exception{
        Die die = new Die(6);
        int rolledValue = 0;
        die.roll();
        rolledValue = die.getFaceValue();
        assertTrue(1 <= rolledValue && rolledValue <= 6);
    }
}
