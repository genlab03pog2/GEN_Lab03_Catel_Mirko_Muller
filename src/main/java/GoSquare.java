public class GoSquare extends Square {
    public GoSquare(int id) {
        super(id);
        super.name = "GoSquare" + id;
    }

    public void landedOn(Player p) {
        p.addCash(200);
    }
}
