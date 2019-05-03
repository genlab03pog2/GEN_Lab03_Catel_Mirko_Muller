import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void newPlayerHasName() {
        Player player = new Player("Player");
        assertEquals(player.getName(), "Player");
    }

    @Test
    public void aPlayerMovesAtTheRightLocation() {
        Player player = new Player("Player");
        Board board = new Board();
        player.setBoard(board);

        player.getPiece().setLocation(board.getSquares().get(0));
        assertEquals(0, player.getPiece().getLocation().getId());
        player.getPiece().setLocation(board.getSquares().get(7));
        assertEquals(7, player.getPiece().getLocation().getId());
        player.getPiece().setLocation(board.getSquares().get(35));
        assertEquals(35, player.getPiece().getLocation().getId());
    }

    // Mock die to test takeTurn
    static class MockDie extends Die{

        MockDie(int maxValue) {
            super(maxValue);
        }

        @Override
        public void roll() {
            System.out.println("MOCKING DIE !!!");
        }

        void setValue(int val){
            if(val <= maxValue && val > 0) {
                faceValue = val;
            }
        }
    }

    @Test
    public void goodLocationAfterTakingTurn(){
        Player player = new Player("Player");
        Board board = new Board();
        MockDie mockDie = new MockDie(12);
        player.getPiece().setLocation(board.getSquares().get(0));
        player.setBoard(board);
        player.setDie(mockDie);

        int squareWanted;
        int squareArrived;

        mockDie.setValue(6);
        squareWanted = board.getSquares().get(6).getId();
        player.taketurn();
        squareArrived = player.getPiece().getLocation().getId();
        assertEquals(squareWanted, squareArrived);

        mockDie.setValue(10);
        squareWanted = board.getSquares().get(16).getId();
        player.taketurn();
        squareArrived = player.getPiece().getLocation().getId();
        assertEquals(squareWanted, squareArrived);

        mockDie.setValue(4);
        squareWanted = board.getSquares().get(20).getId();
        player.taketurn();
        squareArrived = player.getPiece().getLocation().getId();
        assertEquals(squareWanted, squareArrived);
    }
}
