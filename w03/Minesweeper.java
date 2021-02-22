public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean[][] mines = new boolean[m + 2][n + 2];
        int[][] counts = new int[m + 2][n + 2];

        int[][] dirs = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };

        // Randomize k mines
        if (k < m * n / 2) {
            for (int i = 0; i < k; i++) {
                int I = (int) (Math.random() * (m - 1));
                int J = (int) (Math.random() * (n - 1));
                while (mines[I + 1][J + 1] == true) {
                    I = (int) (Math.random() * (m - 1));
                    J = (int) (Math.random() * (n - 1));
                }
                mines[I + 1][J + 1] = true;
            }
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mines[i + 1][j + 1] = true;
                }
            }

            for (int i = 0; i < m * n - k; i++) {
                int I = (int) (Math.random() * (m - 1));
                int J = (int) (Math.random() * (n - 1));
                while (mines[I + 1][J + 1] == false) {
                    I = (int) (Math.random() * (m - 1));
                    J = (int) (Math.random() * (n - 1));
                }
                mines[I + 1][J + 1] = false;
            }
        }

        // Count the number of neighboring mines
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mines[i + 1][j + 1]) {
                    // +1 all non-mine neighboring positions
                    for (int j2 = 0; j2 < dirs.length; j2++) {
                        // if (!mines[uI + 1][uJ + 1])
                        counts[i + dirs[j2][0] + 1][j + dirs[j2][1] + 1]++;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mines[i + 1][j + 1])
                    System.out.printf("*  ");
                else
                    System.out.printf("%d  ", counts[i + 1][j + 1]);
            }
            System.out.printf("\n");
        }
    }
}