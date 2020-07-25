public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean A = a * a == b * b + c * c;
        boolean B = b * b == c * c + a * a;
        boolean C = c * c == a * a + b * b;

        boolean x = b + c > a;
        boolean y = c + a > b;
        boolean z = a + b > c;

        boolean ABC = A || B || C;
        boolean xyz = x && y && z;

        System.out.print(ABC && xyz);
    }
}