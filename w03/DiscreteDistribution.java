public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] a = new int[n];
        int[] s = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        // System.out.println(n);
        // for (int i = 0; i < n; i++) {
        // System.out.println(a[i]);
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                s[i] += a[j];
            }
        }

        // for (int i = 0; i < n + 1; i++) {
        // System.out.println(s[i]);
        // }

        for (int i = 0; i < m; i++) {
            int r = (int) Math.floor(Math.random() * (s[n] - 1));
            for (int j = 0; j < n; j++) {
                if (r >= s[j] && r < s[j + 1]) {
                    System.out.print((j + 1) + " ");
                    break;
                }
            }
            if (i % 25 == 0 && i > 0)
                System.out.print("\n");
        }
    }
}