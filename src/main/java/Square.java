public abstract class Square {
    String name;
    private int id;

    public Square(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {return id; }

    public abstract void landedOn(Player p);
}
