package service;
import model.Book;
import model.BorrowSlip;
import model.Reader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Librarian {



    
    public BorrowSlip borrowBook(Reader reader, Book book, int slipId, String borrowDate, String dueDate) {

        // Mượn sách
        if (book.getTotalBooks() > 0) {
            book.setTotalBooks(book.getTotalBooks() - 1);
            BorrowSlip slip = new BorrowSlip(slipId, reader, book, borrowDate, dueDate);
            return slip;
        } else {
            System.out.println("Sách đã hết: " + book.getTitle());
            return null;
        }
    }

    // trả sách và tính phạt
    public void returnBook(BorrowSlip slip, String dueDate) {
        // Cập nhật lại số lượng sách
        Book book = slip.getBook();
        book.setTotalBooks(book.getTotalBooks() + 1);

        // Tính số ngày trễ
        // Tính tiền phạt nếu có
        LocalDate currentDate = LocalDate.now();
        LocalDate due = LocalDate.parse(dueDate);

        long daysLate = ChronoUnit.DAYS.between(due, currentDate);
        if (daysLate > 0) {
            double fine = daysLate * 5000; // Ví dụ: 5000 VND/ngày trễ
            System.out.println("Trả sách muộn " + daysLate + " ngày. Phạt: " + fine + " VND");
        } else {
            System.out.println("Trả sách đúng hạn. Không có phạt.");
        }
    }

}