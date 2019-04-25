import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void newPlayerIsCreated() {
        Player player = new Player("Player1");
        assertEquals(player.getName(), "Player1");
    }
}
