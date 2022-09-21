public class Main {
    public static void main(String[] args) {

        double[] mylıst = {6.2, 3.1, 4.5, 2.3};
        double total = 0;
        double maxnumber = mylıst[0];
        for (double number : mylıst) {
            if (maxnumber < number) {
                maxnumber = number;
            }

            total = total + number;
            System.out.println(number);
        }
        System.out.println("Total :" + total);
        System.out.println("Max Number :" + maxnumber);

    }
}