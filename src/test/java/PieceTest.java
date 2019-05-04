import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest
{
    @ParameterizedTest
    @ValueSource (ints = {1, 5, 38, 23,39, 0})
    public void setLocation(int location){
        Board board = new Board();
        Piece piece = new Piece();

        piece.setLocation(board.getSquares().get(location));
        assertEquals(board.getSquares().get(location), piece.getLocation());
    }

}
