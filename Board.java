import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Board {
    private String player1Symbol;
    private String player2Symbol;
    private int rows;
    private int cols;
    private int boardState[];

    public Board(String player1Symbol, String player2Symbol, int rows, int cols) {
        this.player1Symbol = player1Symbol;
        this.player2Symbol = player2Symbol;
        this.rows = rows;
        this.cols = cols;

        this.boardState = new int[(rows * cols)];
        Arrays.fill(boardState, 0);
    }

    public Board() {
        this.player1Symbol = "x";
        this.player2Symbol = "o";
        this.rows = 3;
        this.cols = 3;

        this.boardState = new int[9];
        Arrays.fill(boardState, 0);
    }

    public void drawBoardFull() {
        drawDiv(cols);
        for (int i = 0; i < rows; i++) {
            drawGameLine(i);
            drawDiv(cols);
        }
    }

    public void drawDiv(int cols) {
        System.out.print('|');
        for (int i = 0; i < cols; i++ ) {
            System.out.print("---|");
        }
        System.out.println();
    }

    public void drawGameLine(int row) {
        int startingPosition = cols * row;
        System.out.print('|');
        for (int i = 0; i < cols; i++) {
            if (boardState[startingPosition + i] == 1) {
                System.out.print(' ' + player1Symbol + " |");
            } else if (boardState[startingPosition + i] == 2) {
                System.out.print(' ' + player2Symbol + " |");
            } else {
                System.out.print(" " + (startingPosition + i) + " |");
            }
        }
        System.out.println();
    }

    public int[] getBoardState() {
        return boardState;
    }

    public void setBoardState(int[] boardState) {
        this.boardState = boardState;
    }
}
