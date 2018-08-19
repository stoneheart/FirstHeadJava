public class Foo5 {
    static final int x = 12;

    public void go(final int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo5 one = new Foo5();
        final int x = 10;
        one.go(x);
    }
}
