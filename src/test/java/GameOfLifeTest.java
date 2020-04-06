import org.junit.jupiter.api.Test;



class GameOfLifeTest {

    private static final int B = 0;
    private static final int C = 0 ;
    private int[][] grid;

    GameOfLifeTest(int[][] grid) {
        this.grid = grid;
    }

    @Test
    void nextGeneration() {
        GameOfLife.nextGeneration( grid, B, C);
    }
}