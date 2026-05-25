import service.Librarian;
import model.Book;
import model.Reader;
import model.BorrowSlip;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng thủ thư
        Librarian librarian = new Librarian();

        // Tạo một số sách
        Book book1 = new Book(1, "Nghĩ giàu làm giàu", "napoleon hill", "1937", 100);
        Book book2 = new Book(2, "Đọc vị bất kỳ ai", "Lieberman", "2024", 50);

        // Tạo một số độc giả
        Reader reader1 = new Reader(1,
                "Thầy Phúc",
                "alice@example.com",
                Reader.TypeOfReader.GiaoVien,
                "2024-06-01");
        Reader reader2 = new Reader(2,
                "Andy",
                "bob@example.com",
                Reader.TypeOfReader.SinhVien,
                "2024-06-01");

        // Độc giả mượn sách
        System.out.println("\n");
        System.out.println("Độc giả mượn sách:");
        BorrowSlip slip1 = librarian.borrowBook(reader1, book1, 1, "2024-06-01", "2024-06-10");
        BorrowSlip slip2 = librarian.borrowBook(reader2, book2, 2, "2024-06-01", "2024-06-05");

        // // Độc giả trả sách
        // System.out.println("\n");
        // System.out.println("Độc giả trả sách:");
        // librarian.returnBook(slip1, "2024-06-12"); // Trả sách muộn
        // librarian.returnBook(slip2, "2024-06-04"); // Trả sách đúng hạn

        // // Hiển thị thông tin sách và độc giả sau khi mượn và trả sách
        // System.out.println("\n");
        // System.out.println("Thông tin sách và độc giả:");
        // System.out.println(book1.getInfo());
        // System.out.println(book2.getInfo());
        // System.out.println(reader1.getInfo());
        // System.out.println(reader2.getInfo());

        // // Hiển thị thông tin phiếu mượn
        // System.out.println("\n");
        // System.out.println("Thông tin phiếu mượn:");
        // System.out.println(slip1.getInfo());
        // System.out.println(slip2.getInfo());

    }
}
