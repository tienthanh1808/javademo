import java.util.Scanner;

public class slide40 {
    public static void maid(String[] args) {

        Scanner sc = new Scanner(System.in);
        int so;
        System.out.println("Nhap vao gia tri so nguyen tu 1 den 7");
        so = sc.nextInt();
        switch (so) {
            case 1:
                System.out.println("chu nhat");
                break;
            case 2:
                System.out.println("thu 2");
                break;
            case 3:
                System.out.println("thu 3");
                break;
            case 4:
                System.out.println("thu 4");
                break;
            case 5:
                System.out.println("thu 5");
                break;
            case 6:
                System.out.println("thu 6");
                break;
            case 7:
                System.out.println("thu 7");
                break;
            default:
                System.out.println("khong phai ngay trong tuan");
                break;

        }
    }
}
