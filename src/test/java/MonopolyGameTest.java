import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class MonopolyGameTest {
    @Test
    public void aPlayerIsWellCreatedByTheGame() {
        MonopolyGame game = new MonopolyGame(1, 20);
        assertNotNull(game.getPlayers().get(0).getBoard());
        assertNotNull(game.getPlayers().get(0).getDice());
        assertNotNull(game.getPlayers().get(0).getPiece());
    }

    @Test
    public void aPlayerHasTwoDice() {
        MonopolyGame game = new MonopolyGame(1, 20);
        assertEquals(2, game.getPlayers().get(0).getDice().size());
    }

    @Test
    public void createMultiPlayer(){
        String arrayExpected[] = new String[4];
        arrayExpected[0] = "Player0";
        arrayExpected[1] = "Player1";
        arrayExpected[2] = "Player2";
        arrayExpected[3] = "Player3";

        MonopolyGame game = new MonopolyGame(4, 20);

        String arrayCreated[] = new String[4];

        for(int i = 0; i < 4; ++i) {
            arrayCreated[i] = game.getPlayers().get(i).getName();
        }

        assertArrayEquals(arrayExpected, arrayCreated);
    }

    @Test
    public void gamePlayed() {
        MonopolyGame game = new MonopolyGame(8, 20);
        game.playGame();
    }

    @Test
    public void canNotStartGameWithOnePlayer(){
        MonopolyGame game = new MonopolyGame(1, 20);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() -> game.playGame(),"The game can't begin, not enough players");

        assertTrue(exception.getMessage().contains("The game can't begin, not enough players"));

    }
}