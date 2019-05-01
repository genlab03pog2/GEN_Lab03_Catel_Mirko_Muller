import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    @Test
    public void allTheSquaresAreCreated() {
        Board board = new Board();
        assertEquals(40, board.getSquares().size());
    }
}
