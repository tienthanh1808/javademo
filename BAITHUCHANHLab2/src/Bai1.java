import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("nhap vao so a: ");
        int a = sc.nextInt();
        System.out.println("nhap vao so b: ");
        int b = sc.nextInt();
        // 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư của 2 số đó.
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);

        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);

        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);

        float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " +
                decimalFormat.format(thuong)); // làm tròn thương đến 2 chữ số thập phân

        int phanDu = a % b;
        System.out.println(a + " % " + b + " = " + phanDu);
        // 2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
        System.out.println("ket qua bang hai so" + a + " và " +
                b + " là " + (a == b));
        System.out.println("ket qua so sanh khong bang hai so " + a + " và " +
                b + " là " + (a != b));
        System.out.println("ket qua lon hon hai so" + a + " và " +
                b + " là " + (a > b));
        System.out.println("ket qua lon hon hoac bang hai so " + a + " và " +
                b + " là " + (a >= b));
        System.out.println("ket qua so sanh nho hon hai so " + a + " và " +
                b + " là " + (a < b));
        System.out.println("Ket qua nho hon hoac bang hai so " + a + " và " +
                b + " là " + (a <= b));

    }

}