public class GameOfLife {
        public static void nextGeneration ( int grid[][], int B, int C){
            int[][] future = new int[B][C];
            // Loop through every cell
            for (int l = 1; l < B - 1; l++) {
                for (int b = 1; b < C - 1; b++) {
                    // finding no. Of Neighbours that are alive
                    int aliveNeighbours = 0;
                    for (int i = -1; i <= 1; i++)
                         for (int j = -1; j <= 1; j++)
                            aliveNeighbours += grid[l + i][b + j];

                    // The cell needs to be subtracted from
                    // its neighbours as it was counted before
                    aliveNeighbours -= grid[l][b];

                    // Implementing the Rules of Life

                    // Cell is lonely and dies
                    if ((grid[l][b] == 1) && (aliveNeighbours < 2))
                        future[l][b] = 0;

                        // Cell dies due to over population
                    else if ((grid[l][b] == 1) && (aliveNeighbours > 3))
                        future[l][b] = 0;

                        // A new cell is born
                    else if ((grid[l][b] == 0) && (aliveNeighbours == 3))
                        future[l][b] = 1;

                        // Remains the same
                    else
                        future[l][b] = grid[l][b];
                }
            }

            System.out.println("Next Generation");
            for (int i = 0; i < B; i++) {
                for (int j = 0; j < C; j++) {
                    if (future[i][j] == 0)
                        System.out.print("+");
                    else
                        System.out.print("#");
                }
                System.out.println();
            }
        }
    }
