package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    private float dai;
    private float rong;

    public HinhChuNhat() {
        this.setTen(" HinhChuNhat");

    }

    public float getDai() {
        return this.dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return this.rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    public void nhapChieuDai() {
        System.out.println("Chiều Dài = ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();

    }

    public void nhapChieuRong() {
        System.out.println("Chiều Rộng = ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }

    public void tinhChuVi() {
        setChuVi(2 * (dai + rong));
    }

    public void tinhDienTich() {
        setDienTich(dai * rong);
    }
}
