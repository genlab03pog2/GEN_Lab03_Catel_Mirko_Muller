import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {
    @Test
    public void DieFirstTest(){
        int i = 0;
        assertEquals(0,i);
    }

    @Test
    public void DieSecondTest(){
        int i = 1;
        assertEquals(1,i);
    }

    @Test
    public void rollGiveTheRandNumberBetweenRange() throws Exception{
        Die die = new Die(6);
        int rolledValue = 0;
        for(int i = 0; i < 1000; i++){
            die.roll();
            rolledValue = die.getFaceValue();
            assertTrue(1 <= rolledValue && rolledValue <= 6);
        }
    }
}
