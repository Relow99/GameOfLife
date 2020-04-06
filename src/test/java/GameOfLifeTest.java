import org.junit.jupiter.api.Test;

class GameOfLifeTest {

    private static final int B = 10;
    private static final int C = 10 ;
    private int[][] grid;

    GameOfLifeTest(int[][] grid) {
        this.grid = grid;
    }

    @Test
    void nextGeneration() {
        GameOfLife.nextGeneration( grid, B, C);
    }
}