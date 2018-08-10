public class Mix4 {
    int counter = 0;
    public static void main(String[] args) {
        int thresh1 = Integer.parseInt(args[0].trim());
        int thresh2 = Integer.parseInt(args[1].trim());

        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;

        while (x < thresh1) {
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x, thresh2);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }

    public int maybeNew(int index, int upper) {
        if (index < upper) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
