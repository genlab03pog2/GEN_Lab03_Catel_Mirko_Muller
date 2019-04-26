public class Square {
    private String name;
    private int id;

    public Square(int id) {
        this.name = "Square" + id;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {return id; }
}
