import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    public void squareIsCreatedWithTheGoodName() {
        ArrayList<Square> squares = new ArrayList<Square>();
        for(int i = 0; i < 10; i++) {
            squares.add(new RegularSquare(i));
        }
        for(int i = 0; i < 10; i++) {
            assertEquals("RegularSquare" + i, squares.get(i).getName());
        }
    }
}
