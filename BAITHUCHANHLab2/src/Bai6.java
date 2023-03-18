import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 1;
        int giaithua = 1;
        do {
            System.out.println("nhap vao n: ");
            number = sc.nextInt();
        } while (number < 1);

        while (number > 0) {
            giaithua *= number;
            number--;
        }
        System.out.println(number + "! = " + giaithua);
    }
}
