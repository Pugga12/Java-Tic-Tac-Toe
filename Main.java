
public class Main {
    public static void main(String[] args) {
        Game.welcome();
        Board board = new Board();
        Game game = new Game(board);
        int winner;
        int movesLeft = 9;
        EnemyAI ai = new EnemyAI(board);
        while (game.isRunning()) {
            board.drawBoardFull();
            game.prompt();
            winner = game.checkWinner(); 
            if (winner == 1) {
                board.drawBoardFull();
                System.out.println("The Player Wins!");
                game.stop();
                break;
            } else if (winner == 2) {
                board.drawBoardFull();
                System.out.println("The AI Wins!");
                game.stop();
                break;
            }
            ai.doTurn();
            winner = game.checkWinner(); 
            if (winner == 1) {
                board.drawBoardFull();
                System.out.println("\nThe Player Wins!");
                game.stop();
                break;
            } else if (winner == 2) {
                board.drawBoardFull();
                System.out.println("\nThe AI Wins!");
                game.stop();
                break;
            }
            --movesLeft;
            if (movesLeft <= 0) {
                game.stop();
                System.out.println("\nTie");
                break;
            }
            System.out.println();
        }
    }
}