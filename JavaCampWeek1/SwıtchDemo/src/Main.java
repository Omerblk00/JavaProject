public class Main {
    public static void main(String[] args) {
        char grade = 'M';
        switch (grade) {
            case 'A':
                System.out.println("Başarılı : Geçtiniz");
                break;

            case 'B':
                System.out.println("Çok İyi  : Geçtiniz");
                break;

            case 'C':
                System.out.println("İyi  : Geçtiniz");
                break;

            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;

            case 'E':
                System.out.println("Mallesef Kaldınız");
                break;

            default:
                System.out.println("Geçersiz Not!!");

        }


    }
}