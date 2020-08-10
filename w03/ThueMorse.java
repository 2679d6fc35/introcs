public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // For now let length of tms(Thue-Morse sequence) 2^n
        boolean[] tms = new boolean[n];

        int m = 0;
        while (Math.pow(2, m) < n) {
            m++;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = (int) Math.pow(2, i - 1); j < Math.pow(2, i) && j < n; j++) {
                tms[j] = !tms[j - (int) Math.pow(2, i - 1)];
            }
        }

        // for (int i = 0; i < tms.length; i++) {
        // if (tms[i])
        // System.out.print("1 ");
        // else
        // System.out.print("0 ");
        // }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tms[i] == tms[j])
                    System.out.print("+ ");
                else
                    System.out.print("- ");
            }
            System.out.printf("\n");
        }
    }
}