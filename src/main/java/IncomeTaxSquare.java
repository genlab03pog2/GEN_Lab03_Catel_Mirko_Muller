public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare(int id) {
        super(id);
        this.name = "IncomeTaxSquare" + id;
    }

    public void landedOn(Player p) {
        if(getNetWorth(p.getCash()))
            p.reduceCash(p.getCash()/10);
        else
            p.reduceCash(200);
    }

    private boolean getNetWorth(int cash){
        if(cash < 1000)
            return false;
        else
            return true;
    }
}
