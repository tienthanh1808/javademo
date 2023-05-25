package Lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public String Fullname;
    public int Age;

    public void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ten: ");
        Fullname = sc.nextLine();
        System.out.print("nhap vao tuoi: ");
        Age = sc.nextInt();
    }

   public void static Themthongtin(List<Student> list, int n){
        for(int i = 0; i < n; i++){
            Student std = new Student();
            std.Nhapthongtin();
            list.add(std);
        }
           
    }

   public void static Suathongtin(List<Student> list, int n){
        
         for (int i = 0; i < arr.size(); i++){

            if(arr.get(i).Fullname.eqals(fName)){
                Student std = new Student();
                std.Nhapthongtin();
                arr.set(i, std);
            }
         }
        }

    public static void Inthongtin(Set<Student> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("Sinh vien: %s, tuoi: %d", arr.get(i).FullName, arr.get(i).Age);
        }
    }
}
