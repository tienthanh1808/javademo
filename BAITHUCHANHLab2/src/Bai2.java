import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println(" Nhap mot so nguyen duong n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(" Day là so chan");
        } else {
            System.out.println("Day là so le");
        }
    }
}
