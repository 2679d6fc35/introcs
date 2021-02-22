public class HelloGoodbye {
    public static void main(String[] args) {
        String p1 = args[0];
        String p2 = args[1];
        System.out.printf("Hello %s and %s.\n", p1, p2);
        System.out.printf("Goodbye %s and %s.", p2, p1);
    }
}