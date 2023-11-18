
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Game game = new Game(board);
        board.drawBoardFull();
        int winner;
        int movesLeft = 9;
        while (game.isRunning()) {
            game.prompt();
            board.drawBoardFull();
            winner = game.checkWinner(); 
            if (winner == 1) {
                System.out.println("The Player Wins!");
                break;
            } else if (winner == 2) {
                System.out.println("The AI Wins!");
                break;
            }
            --movesLeft;
            if (movesLeft <= 0) {
                game.stop();
                System.out.println("Stalemate");
            }
        }
    }
}