import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void newPlayerHasName() {
        Player player = new Player("Player" + 0);
        assertEquals(player.getName(), "Player0");
    }

    @Test
    public void aPlayerMovesAtTheRightLocation() {
        Player player = new Player("Player1");
        player.setBoard(new Board());
    }
}
