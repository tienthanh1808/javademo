import java.util.Scanner;

public class HinhTruTron {
    float banKinh;
    final float PI = 3.14f;
    float chuVi;
    float dienTichHaiDay;
    float dienTichToanPhan;
    float chieuCao;
    float theTich;

    void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.err.print("Nhap Ban Kinh = ");
        banKinh = sc.nextFloat();

    }

    void nhapChieuCao() {
        Scanner sc = new Scanner(System.in);
        System.err.print("Nhap Chieu Cao = ");
        banKinh = sc.nextFloat();

    }

    float tinhChuVi() {
        return chuVi = 2 * PI * banKinh * chieuCao;
    }

    float tinhDienTichHaiDay() {
        return dienTichHaiDay = 2 * PI * banKinh * banKinh;
    }

    float tinhDienTichToanPHan() {
        return dienTichToanPhan = 2 * PI * banKinh + (banKinh + chieuCao);

    }

    float tinhTheTich() {
        return theTich = PI * banKinh * banKinh * chieuCao;

    }

    void inThongTin() {
        System.out.printf(
                "Hinh tru tron co: banKinh = %f; chieuCao = %f; chuVi = %f; dienTichHaiDay = %f;dienTichToanPhan = %f; theTich = %f",
                banKinh, chieuCao,
                tinhChuVi(), tinhDienTichHaiDay(), tinhDienTichToanPHan(), tinhTheTich());
    }
}