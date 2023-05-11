package Lists;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Student> arrList = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua ArrayList");
        int n = sc.nextLine();
        Student.Themthongtin(arrList, n);
        Student.Suathongtin(arrList, 0);
        Student.Inthongtin(arrList);
    }

}
