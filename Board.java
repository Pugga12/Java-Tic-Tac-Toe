import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Board {
    private char player1Symbol;
    private char player2Symbol;
    private int rows;
    private int cols;
    private int boardState[];

    public Board(char player1Symbol, char player2Symbol, int rows, int cols) {
        this.player1Symbol = player1Symbol;
        this.player2Symbol = player2Symbol;
        this.rows = rows;
        this.cols = cols;

        this.boardState = new int[(rows * cols) - 1];
        Arrays.fill(boardState, 0);
    }

    public Board() {
        this.player1Symbol = 'x';
        this.player2Symbol = 'o';
        this.rows = 3;
        this.cols = 3;

        this.boardState = new int[8];
        Arrays.fill(boardState, 0);
    }

    public void drawBoard() {
        
    }
}
