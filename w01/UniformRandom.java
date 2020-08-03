public class UniformRandom {
    public static void main(String[] args) {
        double n1 = Math.random();
        double n2 = Math.random();
        double n3 = Math.random();
        double n4 = Math.random();
        double n5 = Math.random();

        double ave = (n1 + n2 + n3 + n4 + n5) / 5;

        double max12 = Math.max(n1, n2);
        double max34 = Math.max(n3, n4);
        double max1234 = Math.max(max12, max34);
        double max = Math.max(max1234, n5);

        double min12 = Math.min(n1, n2);
        double min34 = Math.min(n3, n4);
        double min1234 = Math.min(min12, min34);
        double min = Math.min(min1234, n5);

        System.out.println("n1  : " + n1);
        System.out.println("n2  : " + n2);
        System.out.println("n3  : " + n3);
        System.out.println("n4  : " + n4);
        System.out.println("n5  : " + n5);

        System.out.println("ave : " + ave);
        System.out.println("min : " + min);
        System.out.println("max : " + max);
    }
}