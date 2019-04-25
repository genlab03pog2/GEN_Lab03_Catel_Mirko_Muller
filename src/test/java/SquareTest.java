import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    public void squareIsCreatedWithTheGoodName() {
        Square.resetSquares();
        ArrayList<Square> squares = new ArrayList<Square>();
        for(int i = 0; i < 10; i++) {
            squares.add(new Square());
        }
        for(int i = 0; i < 10; i++) {
            assertEquals("" + i, squares.get(i).getName());
        }
    }

    @Test
    public void allTheSquaresAreCreated() {
        Board board = new Board();
        assertEquals(40, board.getSquares().size());
    }
}
