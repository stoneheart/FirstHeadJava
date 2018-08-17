public class UseADuck2 {
    public static void main(String[] args) {
        Duck2 d = new Duck2(15);
        System.out.println("Size of the duck is " + d.size);

        Duck2 d2 = new Duck2();
        System.out.println("Size of the default duck is " + d2.size);
    }
}
