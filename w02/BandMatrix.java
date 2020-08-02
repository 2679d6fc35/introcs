public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i-j)<=width)
                {
                    System.out.printf("* ");
                } else {
                    System.out.printf("0 ");
                }
            }
            System.out.printf("\n");
        }
    }
}