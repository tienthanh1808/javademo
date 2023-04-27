package shapes;

import java.util.Scanner;

public class HinhHoc {
    private final float PI = 3.14f;
    private String ten;
    private float chuVi;
    private float dienTich;
    private float theTich;

    public float getPI() {
        return this.PI;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getChuVi() {
        return this.chuVi;
    }

    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }

    public float getDienTich() {
        return this.dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public float getTheTich() {
        return this.theTich;
    }

    public void setTheTich(float theTich) {
        this.theTich = theTich;
    }

    public void xuatTen() {
        System.out.println("\n\n=====" + ten + " =====");
    }

    public void inChuVi() {
        System.out.println("Chu vi=" + chuVi);
    }

    public void inDienTich() {
        System.out.println("Diện Tích=" + dienTich);

    }

    public void inTheTich() {
        System.out.println("Thể Tích=" + theTich);
    }
}
