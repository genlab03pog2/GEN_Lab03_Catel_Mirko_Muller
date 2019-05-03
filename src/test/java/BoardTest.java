import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    @Test
    public void allTheSquaresAreCreated() {
        Board board = new Board();
        assertEquals(40, board.getSquares().size());
        assertEquals("GoSquare", board.getSquares().get(0).getClass().getName());
        assertEquals("GoToJailSquare", board.getSquares().get(38).getClass().getName());
        assertEquals("IncomeTaxSquare", board.getSquares().get(39).getClass().getName());
    }

    @Test
    public void goodSquareAfterMove(){
        Board board = new Board();

        Square square;
        square = board.getSquare(board.getSquares().get(0),5);
        assertEquals("RegularSquare", square.getClass().getName());
        square = board.getSquare(board.getSquares().get(5),5);
        assertEquals("RegularSquare", square.getClass().getName());
        square = board.getSquare(board.getSquares().get(3),1);
        assertEquals("RegularSquare", square.getClass().getName());
        square = board.getSquare(board.getSquares().get(37),1);
        assertEquals("GoToJailSquare", square.getClass().getName());
        square = board.getSquare(board.getSquares().get(38),1);
        assertEquals("IncomeTaxSquare", square.getClass().getName());
        square = board.getSquare(board.getSquares().get(39),1);
        assertEquals("GoSquare", square.getClass().getName());
    }
}
