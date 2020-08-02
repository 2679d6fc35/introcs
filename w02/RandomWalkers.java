public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double aveSteps = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int steps = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                double rand = Math.random();
                if (rand < 0.25) {
                    x += 1;
                } else if (rand < 0.5) {
                    x -= 1;
                } else if (rand < 0.75) {
                    y += 1;
                } else {
                    y -= 1;
                }
                steps += 1;
            }
            aveSteps = aveSteps * i / (i + 1) + ((double) steps) / (i + 1);
            // System.out.print(steps + " " + aveSteps + "\n");
        }
        System.out.printf("average number of steps = %f", aveSteps);
    }
}