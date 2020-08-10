public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int mn = m * n;

        int[][] grid = new int[m][n];

        // Randomize mine's positions
        for (int i = 0; i < k; i++) {
            int Num = (int) (Math.random() * (mn - 1));
            int I = Num / n;
            int J = Num % n;
            while (grid[I][J] == -1) {
                Num = (int) (Math.random() * (mn - 1));
                I = Num / n;
                J = Num % n;
            }
            grid[I][J] = -1;

            // Update number of mines around
            // Left
            if (J != 0)
                if (grid[I][J - 1] != -1)
                    grid[I][J - 1]++;
            // Right
            if (J != n - 1)
                if (grid[I][J + 1] != -1)
                    grid[I][J + 1]++;
            // Up
            if (I != 0)
                if (grid[I - 1][J] != -1)
                    grid[I - 1][J]++;
            // Down
            if (I != m - 1)
                if (grid[I + 1][J] != -1)
                    grid[I + 1][J]++;
            // Left Up
            if (J != 0 && I != 0)
                if (grid[I - 1][J - 1] != -1)
                    grid[I - 1][J - 1]++;
            // Left Down
            if (J != 0 && I != m - 1)
                if (grid[I + 1][J - 1] != -1)
                    grid[I + 1][J - 1]++;
            // Right Up
            if (J != n - 1 && I != 0)
                if (grid[I - 1][J + 1] != -1)
                    grid[I - 1][J + 1]++;
            // Right Down
            if (J != n - 1 && I != m - 1)
                if (grid[I + 1][J + 1] != -1)
                    grid[I + 1][J + 1]++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1)
                    System.out.print("*  ");
                else
                    System.out.print(grid[i][j] + "  ");
            }
            System.out.printf("\n");
        }
    }
}