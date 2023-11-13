
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println("Tic Tac Toe");
        System.out.println("You are: X");
        board.drawBoardFull();
        System.out.println();
        int testState[] = {1,2,1,2,1,2,1,2,1};
        board.setBoardState(testState);
        board.drawBoardFull();
    }
}