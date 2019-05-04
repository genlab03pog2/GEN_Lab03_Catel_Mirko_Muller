import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoToJailSquareTest {

    @Test
    public void squareIsCreatedWithTheGoodName() {
        ArrayList<GoToJailSquare> goToJailSquare = new ArrayList<GoToJailSquare>();
        for(int i = 0; i < 10; i++) {
            goToJailSquare.add(new GoToJailSquare(i));
        }
        for(int i = 0; i < 10; i++) {
            assertEquals("GoToJailSquare" + i, goToJailSquare.get(i).getName());
        }
    }

    @Test
    public void playerGoToTheGoodLocationWhenArrivesOnGoToJailSquare(){
        Board board = new Board();
        Player player = new Player("Player");
        player.setBoard(board);

        player.getPiece().setLocation(board.getSquares().get(38));
        player.getPiece().getLocation().landedOn(player);

        assertEquals(11, player.getPiece().getLocation().getId());
    }
}
