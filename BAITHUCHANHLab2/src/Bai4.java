import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int so;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri so nguyen tu 1 den 12:");
        so = sc.nextInt();
        switch (so) {
            case 1:
                System.out.println("Thang một");
                break;
            case 2:
                System.out.println("Thang hai");
                break;
            case 3:
                System.out.println("Thang ba");
                break;
            case 4:
                System.out.println("Thang tu");
                break;
            case 5:
                System.out.println("Thang nam");
                break;
            case 6:
                System.out.println("Thang sau");
                break;
            case 7:
                System.out.println("Thang bay");
                break;
            case 8:
                System.out.println("Thang tam");
                break;
            case 9:
                System.out.println("Thang chin");
                break;
            case 10:
                System.out.println("Thang muoi");
                break;
            case 11:
                System.out.println("Thang muoi mot");
                break;
            case 12:
                System.out.println("Thang muoi hai");
                break;
            default:
                System.out.println("khong phai ngay trong thang");
                break;
        }
    }
}