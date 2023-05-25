package BaiThucHanh;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua LinkedList ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu" + i + ": ");
            Integer node = scanner.nextInt();
            linkedList.add(node);
        }

        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (linkedList.get(i) % 2 == 0) {
                sum += linkedList.get(i);
                count++;
            }
        }

        Object tbCong = (double) sum / count;
        System.out.print("Trung binh cong cua cac so chan la: " + tbCong);
    }

}
