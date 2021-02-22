public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int N = n + 1;
        int[] counts = new int[N];
        double[] fractions = new double[N];

        for (int i = 0; i < trials; i++) {
            int count = 0;
            int[] birthday = new int[n];
            int r = (int) (Math.random() * (n - 1));
            while (birthday[r] == 0) {
                birthday[r]++;
                r = (int) (Math.random() * (n - 1));
                count++;
            }
            counts[count]++;
        }

        for (int i = 0; i < N; i++) {
            // Calculate fractions
            for (int j = 0; j <= i; j++) {
                fractions[i] += counts[j];
            }
            fractions[i] /= trials;

            System.out.printf("%d\t%d\t%f\n", i + 1, counts[i], fractions[i]);
            if (fractions[i] > 0.5)
                break;
        }
    }
}