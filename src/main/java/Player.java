import com.sun.corba.se.spi.copyobject.ObjectCopier;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Die> dice;
    Board board;
    Piece piece;

    public Player(String name) {
        this.name = name;
        this.piece = new Piece();
        dice = new ArrayList<Die>();
    }

    public void taketurn() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDie(Die die) {
        dice.add(die);
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Die> getDice() {
        return dice;
    }

    public Board getBoard() {
        return board;
    }

    public Piece getPiece() {
        return piece;
    }
}
