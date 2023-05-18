package Sets;

import java.util.Scanner;
import java.util.HashSet;
import Lists.Student;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> arrList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu: ");
        int n = sc.nextInt();
        Student.Themthongtin(arrList, n);
        Student.Suathongtin(arrList, 0);
        Student.Inthongtin(arrList);
    }
}