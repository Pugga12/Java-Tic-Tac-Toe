import java.util.Arrays;

public class Board {
    private String player1Symbol;
    private String player2Symbol;
    private int rows;
    private int cols;
    private String boardState[];

    public Board(String player1Symbol, String player2Symbol, int rows, int cols) {
        this.player1Symbol = player1Symbol;
        this.player2Symbol = player2Symbol;
        this.rows = rows;
        this.cols = cols;

        this.boardState = new String[(rows * cols)];
        Arrays.fill(boardState, "0");
    }

    public Board() {
        this.player1Symbol = "x";
        this.player2Symbol = "o";
        this.rows = 3;
        this.cols = 3;

        this.boardState = new String[9];
        Arrays.fill(boardState, "0");
    }

    public void drawBoardFull() {
        // draw top divider
        drawDiv(cols);
        // draw game lines and dividers
        for (int i = 0; i < rows; i++) {
            drawGameLine(i);
            drawDiv(cols);
        }
    }

    public void drawDiv(int cols) {
        // draw first vertical line
        System.out.print('|');
        for (int i = 0; i < cols; i++ ) {
            // draw horizontal & vertical dividers
            System.out.print("---|");
        }
        System.out.println();
    }

    public void drawGameLine(int row) {
        // find the first square to retrieve data from
        int startingPosition = cols * row;
        // first vertical divider
        System.out.print('|');
        for (int i = 0; i < cols; i++) {
            // decide whether a square is occupied by player 1 (state = 1), 2 (state=2), or open
            if (boardState[startingPosition + i] == "1") {
                System.out.print(' ' + player1Symbol + " |");
            } else if (boardState[startingPosition + i] == "2") {
                System.out.print(' ' + player2Symbol + " |");
            } else {
                System.out.print(" " + (startingPosition + i) + " |");
            }
        }
        System.out.println();
    }

    public String[] getBoardState() {
        return boardState;
    }

    public void setBoardState(String[] boardState) {
        this.boardState = boardState;
    }

    public void put(int square, boolean player) {
        if (!(square <= 8 && square >= 0)) {
            System.out.println("Give me a number between 0 and " + (boardState.length - 1) + " first" );
            return;
        }
        if (boardState[square] != "0") {
            System.out.println("Unable to mark! Space is occupied");
            return;
        }
        if (player) {
            this.boardState[square] = "1";
        } else {
            this.boardState[square] = "2";
        }
    } 

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public String getSquareState(int square) {
        String state = "0";
        if (square <= 8 && square >= 0) {
            state = boardState[square];
        }
        return state;
    }
}
