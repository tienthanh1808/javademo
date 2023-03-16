import java.util.Scanner;

public class slide34 {

    public static void main(String[] args) {
        double x1, x2, denta;
        System.out.println(" nhap so nguyen a:");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextInt();
        System.out.println(" nhap so nguyen b:");
        float b = scanner.nextInt();
        System.out.println(" nhap so nguyen c:");
        float c = scanner.nextInt();
        if (a == 0) {
            x1 = (-c) / b;
        }
        denta = b * b - 4 * a * c;
        if (denta < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else {
            if (denta == 0) {
                x1 = x2 = (-b) / (2 * a);
                System.out.println("phuong trinh co nghiem kep x1,x2 =" + x1);
            } else {
                System.out.println("phuong trinh co 2  nghiem  ");
                x1 = ((-b) - Math.sqrt(denta)) / (2 * a);
                x2 = ((-b) + Math.sqrt(denta)) / (2 * a);
                System.out.println("phuong trinh co nghiem  x1 =" + x1);
                System.out.println("phuong trinh co nghiem x2 =" + x2);
            }

        }
    }

}
