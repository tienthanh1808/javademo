import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        try {
            int a;
            int b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao so a");
            a = sc.nextInt();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao so b");
            b = sc.nextInt();
            System.out.printf("%d/%d=%d", a, b, a / b);

        } catch (Exception e) {
            System.out.println("loi = ex");
        } finally {
            System.out.println("nhap dung nhu dinh dang");
        }

    }
}
