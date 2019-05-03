import java.util.ArrayList;

public class Board {
    ArrayList<Square> squares;

    public Board() {
        squares = new ArrayList<Square>();
        squares.add(new GoSquare(1));
        for(int i = 0; i < 37; i++) {
            squares.add(new RegularSquare(i+1));
        }
        squares.add(new GoToJailSquare(38));
        squares.add(new IncomeTaxSquare(39));

    }

    public ArrayList<Square> getSquares() {
        return squares;
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        return squares.get((oldLoc.getId() + fvTot) % 40);
    }
}
