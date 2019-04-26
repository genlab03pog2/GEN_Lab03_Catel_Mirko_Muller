import java.util.ArrayList;

public class Board {
    ArrayList<Square> squares;

    public Board() {
        squares = new ArrayList<Square>();
        for(int i = 0; i < 40; i++) {
            squares.add(new Square(""+i));
        }
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }
}
