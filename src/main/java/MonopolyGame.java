import java.util.ArrayList;

public class MonopolyGame {
    private Die die;
    private Board board;
    private ArrayList<Player> players;

    // a voir si on fait un constructeur pour init le jeu

    public void setDie(Die die) {
        this.die = die;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void playGame(){

    }

    public static void main(String args[]){
        MonopolyGame game = new MonopolyGame();
        game.setBoard(new Board());
        game.setDie(new Die());

        int nbPlayers = 4;
        for(int i = 0; i < nbPlayers; i++) {
            game.addPlayer(new Player("Player" + i));
        }

        int turns = 20;
    }
}
