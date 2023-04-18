import java.util.Scanner;

import shapes.HinhChuNhat;
import shapes.HinhTru;
import shapes.HinhTron;
import shapes.HinhVuong;

public class App {
    public static void main(String[] args) {
        // Hình Tròn
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
        // Hình Trụ
        HinhTru ht1 = new HinhTru();
        ht1.xuatTen();
        ht1.nhapChieuCao();
        ht1.tinhTheTich();
        ht1.inTheTich();
        // Hình Chữ Nhật
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
        // Hình Vuông
        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();

    }
}
