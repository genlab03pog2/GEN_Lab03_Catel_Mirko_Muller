import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoSquareTest {

    @Test
    public void squareIsCreatedWithTheGoodName() {
        ArrayList<GoSquare> goSquares = new ArrayList<GoSquare>();
        for(int i = 0; i < 10; i++) {
            goSquares.add(new GoSquare(i));
        }
        for(int i = 0; i < 10; i++) {
            assertEquals("GoSquare" + i, goSquares.get(i).getName());
        }
    }

    @Test
    public void addGoodAmountOfCash(){
        Board board = new Board();
        Player player = new Player("Player");
        player.getPiece().setLocation(board.getSquares().get(0));
        player.getPiece().getLocation().landedOn(player);

        assertEquals(1700, player.getNetWorth());

    }
}
