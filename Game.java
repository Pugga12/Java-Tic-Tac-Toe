import java.util.Scanner;

public class Game {
    private Board board;
    private Scanner scanner;
    private int input;
    private boolean isRunning = true;

    public Game(Board board) {
        this.board = board;
        this.scanner = new Scanner(System.in);
    }

    public void prompt() {
        System.out.println("Player 1, enter the number of the square you want to mark off");
        System.out.print("> ");
        input = scanner.nextInt();
        board.put(input, true);
    }

    public int checkWinner() {
        String line = "000";
        for (int i = 0; i <= 8; i++) {
            switch (i) {
                case 0:
                    line = board.getSquareState(0) + board.getSquareState(1) + board.getSquareState(2);
                    break;
                case 1:
                     line = board.getSquareState(3) + board.getSquareState(4) + board.getSquareState(5);
                    break;
                case 2:
                     line = board.getSquareState(6) + board.getSquareState(7) + board.getSquareState(8);
                    break;
                case 3:
                    line = board.getSquareState(0) + board.getSquareState(4) + board.getSquareState(8);
                    break;
                case 4:
                     line = board.getSquareState(2) + board.getSquareState(4) + board.getSquareState(7);
                    break;
                case 5:
                     line = board.getSquareState(0) + board.getSquareState(3) + board.getSquareState(6);
                    break;
                case 6:
                     line = board.getSquareState(1) + board.getSquareState(4) + board.getSquareState(7);
                    break;
                case 7:
                     line = board.getSquareState(2) + board.getSquareState(5) + board.getSquareState(8);
                    break;
            }
            if (line.equals("111")) {
                isRunning = false;
                return 1;
            } else if (line.equals("222")) {
                isRunning = false;
                return 2;
            }
        }
        return 0;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void stop() {
        isRunning = false;
    }
}
