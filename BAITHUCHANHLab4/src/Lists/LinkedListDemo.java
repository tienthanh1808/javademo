package Lists;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> arrList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu: ");
        int n = sc.nextInt();
        Student.Themthongtin(arrList, n);
        Student.Suathongtin(arrList, 0);
        Student.Inthongtin(arrrList);
    }

}
    
}
