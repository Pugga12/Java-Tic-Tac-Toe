import java.util.concurrent.ThreadLocalRandom;

public class EnemyAI {
    private Board board;
    
    public EnemyAI(Board board) {
        this.board = board;
    }

    public void doTurn() {
        int square;
        while (true) {
            square = ThreadLocalRandom.current().nextInt(0,8);
            if (board.put(square, false)) {break;}
        }
        System.out.println("AI marked square #" + square);
    }
}
