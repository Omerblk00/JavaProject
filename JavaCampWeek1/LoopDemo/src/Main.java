public class Main {
    public static void main(String[] args) {

        //For cycle
        for (int i = 0; i <= 20; i += 2) {
                 System.out.println(i);
        }System.out.println("The end of the for cycle has come.");

        //while the cycle
        int i = 0;
        while (i <= 15) {
                 System.out.println(i);
        i += 3;
        }System.out.println("While the end of the cycle has come.");

        //Do While
        int t = 0;
        do {
                 System.out.println(t);
        t += 5;
        } while (t <= 20);
        System.out.println("The end of the do while cycle is reached");
    }
}