package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    private float chieuCao;

    public HinhTru() {
        this.setTen("HinhTru");
    }

    public float getChieuCao() {
        return this.chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.println("Chiều Cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        setTheTich(getDienTich() * getChieuCao());
    }
}
