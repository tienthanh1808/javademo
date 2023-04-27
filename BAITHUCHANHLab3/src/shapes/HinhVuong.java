package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        this.setTen("HinhVuong");
    }

    public float getCanh() {
        return this.canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }

    public void nhapCanh() {
        System.out.println("Cạnh = ");
        Scanner scanner = new Scanner(System.in);
        Cạnh = scanner.nextFloat();
        setCanh(Cạnh);
    }
}
