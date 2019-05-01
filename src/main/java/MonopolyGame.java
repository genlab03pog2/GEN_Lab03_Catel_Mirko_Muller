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
            dice.add(new Die(6));
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

    public void playGame() {
        if(players.size() < 2) {
            System.out.println("The game can't begin, bad setup");
            return;
        }

        // Met toutes les pièces sur la case de départ
        for(Player player : players){
            player.getPiece().setLocation(board.getSquares().get(0));
        }

        for(int i = 0; i < roundCnt; i++) {
            System.out.println("Round " + (i+1) + " : ");
            playRound();
        }
    }

    private void playRound() {
        for(Player player : players) {
            player.taketurn();
            System.out.println(player.getName() + ", " +  player.getPiece().getLocation().getName());
        }
        System.out.println();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public static void main(String args[]){
        MonopolyGame game = new MonopolyGame(3, 20);
        System.out.println("Bonjour");
        game.playGame();
    }
}
