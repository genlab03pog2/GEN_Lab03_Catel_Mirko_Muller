public class Square {
    private static int id = 0;
    private String name;
    public Square() {
        this.name = "" + id++;
    }

    public String getName() {
        return name;
    }
}
