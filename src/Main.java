import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int year;

        Scanner inp =new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = inp.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " Bir Artık Yıldır!");
        }
        else {
            System.out.println(year + " Bir Artık Yıl Değildir!");
        }
    }
}
