import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) {
        int tong = 0;
        System.out.println(" Nhap mot so nguyen duong n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            tong = tong + n % 10;
            n = n / 10;
        }
        System.out.println("Tong cac chu so:" + tong);
    }

}