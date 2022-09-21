public class Main {
    public static void main(String[] args) {

        int x = 12;
        int y = 123;
        int z = 14;
        int t = 78;
        int maxnumber = x;

        if (maxnumber < y) {
            maxnumber = y;
        }
        if (maxnumber < z) {
            maxnumber = z;
        }
        if (maxnumber < t) {
            maxnumber = t;
        }
        System.out.println("Maxnumber :"+maxnumber);
    }
}