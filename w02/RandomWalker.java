public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        while (Math.abs(x)+Math.abs(y)<r)
        {
            System.out.printf("(%d, %d)\n", x, y);
            double rand = Math.random();
            if (rand<0.25)
            {
                x += 1;
            } else if (rand<0.5)
            {
                x -= 1;
            } else if (rand<0.75)
            {
                y += 1;
            } else
            {
                y -= 1;
            }
            steps += 1;
        }
        System.out.printf("steps = %d", steps);
    }
}