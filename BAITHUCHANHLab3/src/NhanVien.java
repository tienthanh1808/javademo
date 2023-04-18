import java.util.Scanner;

public class NhanVien {
    public static void main(String[] args) throws Exception {
        NhanVien nv = new NhanVien();
        nv.Tuoi = 30;
        nv.HeSoLuong = 10;
        nv.inThongTin();
    }

    String HoVaTen;
    float HeSoLuong;
    int Tuoi;
    float TienLuong;
    final float luongCoBan = 1490000f;

    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ten: ");
        HoVaTen = sc.nextLine();
        System.out.print("nhap vao tuoi: ");
        Tuoi = sc.nextInt();
        System.out.print("nhap vao he so luong: ");
        HeSoLuong = sc.nextFloat();
    }

    float tinhTienLuong() {
        return HeSoLuong * luongCoBan;
    }

    void inThongTin() {
        System.out.printf(" HoVaTen = %s ; Tuoi = %d ", HoVaTen, Tuoi);
        System.out.println();
        System.out.printf(" HeSoLuong = %f", HeSoLuong);
        System.out.println();
        System.out.printf(" TienLuong = %f", tinhTienLuong());
    }
}