import java.util.ArrayList;

public class Board {
    ArrayList<Square> squares;

    public Board(int nbSquares) {
        squares = new ArrayList<Square>();
        for(int i = 0; i < nbSquares; i++) {
            squares.add(new Square());
        }
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }
}
