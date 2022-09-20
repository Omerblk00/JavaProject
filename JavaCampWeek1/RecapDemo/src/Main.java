public class Main {
    public static void main(String[] args) {
        int numberone = 251;
        int numbertwo = 134;
        int numberthree = 151;
        int numberfour = 211;
        int biggest = numberone;

        if (biggest < numbertwo) {
            biggest = numbertwo;
        }
        if (biggest < numberthree) {
            biggest = numberthree;
        }
        if (biggest < numberfour) {
            biggest = numberfour;
        }
            System.out.println("Maximum Number :" + biggest);
        }
    }
