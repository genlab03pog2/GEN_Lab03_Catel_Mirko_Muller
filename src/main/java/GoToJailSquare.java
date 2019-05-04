public class GoToJailSquare extends Square {
    public GoToJailSquare(int id) {
        super(id);
        this.name = "GoToJailSquare" + id;
    }

    public void landedOn(Player p) {
        // Jail is the 11th case
        p.getPiece().setLocation(p.getBoard().getSquares().get(11));
    }
}
