package Phone;

import java.util.Scanner;

public class danhba {
    public String ten;
    public int soDienThoai;

    public void NhapThongTin();

    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten:");
        ten = sc.nextLine();
        System.out.print("Nhap vao so dien thoai:");
        soDienThoai = sc.nextInt();

    }

    public void Insert(danhba arr[]) {
        for (int i = 0; i < arr.length; i++) {
            danhba db = new danhba();
            db.NhapThongTin();
            arr[i] = db;
        }
    }

    public void Update(danhba arr[]) {
        String str;
        System.out.println("Nhap vao ten nguoi muon cap nhat so dien thoai");
        String Fullname = sc.nextLine();
        boolean kt = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].Fullname.equals(str)) {
                System.out.println("Nhap vao so dien thoai");
                int sdt = sc.nextInt();
                arr[i].soDienThoai = sdt;
                kt = true;
            }
        }
    }

    public void Dalete(danhba arr[]) {
        System.out.println("Nhap vao ten muon xoa");
        String str = sc.nextLine();
        boolean kt = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].ten.equals(str)) {
                arr[i] = null;
                System.out.println("Xoa thanh cong");
                kt = true;

            }
            if (kt == false)
                System.out.println("Khong tim thay ten trong danh ba");
        }

    }

    public void SearchByName(danhba arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten muon tim");
        String str = sc.nextLine();
        boolean kt = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].ten.equals(str)) {
                System.out.printf("So dien thoai cua %s la: %s\n", arr[i].ten, arr[i].soDienThoai);
                kt = true;
            }
        }
        if (kt == false)
            System.out.println("Khong tim thay ten trong danh ba");
    }
}
