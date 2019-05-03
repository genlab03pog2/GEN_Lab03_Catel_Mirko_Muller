import static java.lang.Math.min;

public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare(int id) {
        super(id);
        this.name = "IncomeTaxSquare" + id;
    }

    public void landedOn(Player p) {
        p.reduceCash(min(200,p.getNetWorth() / 10));
    }
}
