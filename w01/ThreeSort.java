public class ThreeSort {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        int sum = n1 + n2 + n3;

        int max12 = Math.max(n1, n2);
        int max = Math.max(max12, n3);

        int min12 = Math.min(n1, n2);
        int min = Math.min(min12, n3);

        System.out.println(min);
        System.out.println(sum - min - max);
        System.out.println(max);
    }
}