import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    public void squareIsCreatedWithTheGoodName() {
        Board board = new Board(40);
        for(int i = 0; i < 40; i++) {
            assertEquals("" + i, board.getSquares().get(i).getName());
        }
    }

    @Test
    public void allTheSquaresAreCreated() {
        Board board = new Board(28);
        assertEquals(28, board.getSquares().size());
    }
}
