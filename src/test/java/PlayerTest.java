import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PlayerTest {

    Player player;

    @Nested
    class usingPlayer {

        @BeforeEach
        void createNewStack() {
            player = new Player("Player");
        }


        @Test
        public void newPlayerHasName() {
            assertEquals("Player",player.getName() );
        }

        @Test
        public void playerHasTheGoodBoard(){
            Player player = new Player("Player");
            Board  board = new Board();
            player.setBoard(board);

            assertEquals(board, player.getBoard());
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

        @Test
        public void canAddCashToPlayer(){
            Player player = new Player("Player");
            player.addCash(500);

            assertEquals(2000, player.getNetWorth());
        }

        @Test
        public void canReduceCashToPlayer(){
            Player player = new Player("Player");
            player.reduceCash(500);

            assertEquals(1000, player.getNetWorth());
        }

        // Mock die to test takeTurn
        class MockDie extends Die{

            MockDie(int maxValue) {
                super(maxValue);
            }

            @Override
            public void roll() {
                System.out.println("MOCKING DIE !!! That's not good, cheater.");
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
}