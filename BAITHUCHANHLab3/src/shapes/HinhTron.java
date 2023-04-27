package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    private float banKinh;

    public HinhTron() {
        this.setTen("Hinh Tron");

    }

    public float getBanKinh() {
        return this.banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public void nhapBanKinh() {
        System.out.println("Bán Kính = ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
        setBanKinh(banKinh);

    }

    public void tinhChuVi() {
        setChuVi(2 * getPI() * getBanKinh());
    }

    public void tinhDienTich() {
        setDienTich(getPI() * getBanKinh() * getBanKinh());
    }
}
