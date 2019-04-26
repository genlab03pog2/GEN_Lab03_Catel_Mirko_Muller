import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MonopolyGameTest {
    @Test
    public void aPlayerIsWellCreatedByTheGame() {
        MonopolyGame game = new MonopolyGame(4, 20);
        assertNotNull(game.getPlayers().get(0).getBoard());
        assertNotNull(game.getPlayers().get(0).getDice());
        assertNotNull(game.getPlayers().get(0).getPiece());
    }

    @Test
    public void aPlayerHasTwoDice() {
        MonopolyGame game = new MonopolyGame(4, 20);
        assertEquals(2, game.getPlayers().get(0).getDice().size());
    }

    @Test
    public void gamePlayed() {
        MonopolyGame game = new MonopolyGame(4, 20);
        game.playGame();
    }
}