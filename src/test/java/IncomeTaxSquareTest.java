import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxSquareTest {
    @Test
    public void squareIsCreatedWithTheGoodName() {
        ArrayList<IncomeTaxSquare> incomeTaxSquare = new ArrayList<IncomeTaxSquare>();
        for(int i = 0; i < 10; i++) {
            incomeTaxSquare.add(new IncomeTaxSquare(i));
        }
        for(int i = 0; i < 10; i++) {
            assertEquals("IncomeTaxSquare" + i, incomeTaxSquare.get(i).getName());
        }
    }

    @Test
    public void reduceGoodAmountOfCashWhenUnder2000(){
        Board board = new Board();
        Player player = new Player("Player");
        player.getPiece().setLocation(board.getSquares().get(39));
        player.getPiece().getLocation().landedOn(player);

        // Start amount is 1500. 1500 - (1500/10) = 1350
        assertEquals(1350, player.getNetWorth());

    }

    @Test
    public void reduceGoodAmountOfCashWhenAbove2000(){
        Board board = new Board();
        Player player = new Player("Player");
        // Start amount is 1500
        player.addCash(1000);
        player.getPiece().setLocation(board.getSquares().get(39));
        player.getPiece().getLocation().landedOn(player);

        // 2500 - 200 = 2300
        assertEquals(2300, player.getNetWorth());

    }
}
