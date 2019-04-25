import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void newPlayerHasName() {
        Player.resetPlayers();
        Player player = new Player();
        assertEquals(player.getName(), "Player0");
    }
}
