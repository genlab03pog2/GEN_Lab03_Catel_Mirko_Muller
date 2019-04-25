import java.io.IOException;
import java.util.ArrayList;

public class MonopolyGame {
    private Die die;
    private Board board;
    private ArrayList<Player> players;
    private int roundCnt;

    public MonopolyGame(int nbPlayers, int roundCnt) {
        die = new Die();
        board = new Board();
        this.roundCnt = roundCnt;
        for(int i = 0; i < nbPlayers; i++) {
            players.add(new Player("Player" + i));
        }
    }

    public void setDie(Die die) {
        this.die = die;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void playGame() {
        if(die == null || board == null || players.size() < 2) {
            System.out.println("The game can't begin, bad setup");
            return;
        }

        for(int i = 0; i < roundCnt; i++) {
            playRound();
        }
    }

    private void playRound() {
        for(int i = 0; i < players.size(); i++) {
            players.get(i).taketurn();
        }
    }

    public static void main(String args[]){
        MonopolyGame game = new MonopolyGame(5, 20);
    }
}
