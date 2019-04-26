import java.io.IOException;
import java.util.ArrayList;

public class MonopolyGame {
    private Board board;
    private ArrayList<Player> players;
    private ArrayList<Die> dice;
    private int roundCnt;

    public MonopolyGame(int nbPlayers, int roundCnt) {
        board = new Board();
        this.roundCnt = roundCnt;
        players = new ArrayList<Player>();
        dice = new ArrayList<Die>();

        // Ajout du nombre de dés souhaités à la partie
        for(int i = 0; i < 2; i++){
            dice.add(new Die());
        }

        // Ajout des joueurs
        for(int i = 0; i < nbPlayers; i++) {
            players.add(new Player("Player" + i));
            players.get(i).setBoard(board);
            // Ajout des dés du jeu aux joueurs
            for(int j = 0; j < dice.size(); j++){
                players.get(i).setDie(dice.get(j));
            }
        }
    }

    public void setDie(Die die) {
        dice.add(die);
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void playGame() {
        if(players.size() < 2) {
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

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
