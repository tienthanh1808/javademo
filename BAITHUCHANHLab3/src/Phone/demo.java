package Phone;

public class demo {
    public static void main(String[] args) {
        danhba db = new danhba();
        db.Insert(null);
        db.Update("Thanh", " 012345678 ");
        db.SeachByName("Fanh", "0359054801");
        db.Delete("Fanh");

    }
}
