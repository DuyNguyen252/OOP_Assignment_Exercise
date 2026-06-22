package main.java.com.service;

import main.java.com.model.*;


import java.time.LocalDate;
import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books;
    private ArrayList<Reader> readers;
    private ArrayList<BorrowSlip> borrowSlips;
    private LateFeePolicy    feePolicy;  

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
        this.borrowSlips = new ArrayList<>();
        feePolicy = new StandardFeePolicy();  
    }

    // Quản lý sách
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void getBooks() {
        for (Book book : books) {
            System.out.println("Book: " + book.getTitle());
        }
    }

    // Quản lý độc giả
    public void addReader(Reader reader) {
        readers.add(reader);
        System.out.println("Reader: " + reader.getFullName());
    }

    public void getReaders() {
        for (Reader reader : readers) {
            System.out.println("Registered reader: " + reader.getFullName());
        }
    }

    // Quản lý mượn sách
    public void borrowBook(Librarian librarian, Reader reader, Book book, int slipId, String borrowDate,
            String dueDate) {
        BorrowSlip slip = librarian.borrowBook(reader, book, slipId, borrowDate, dueDate);
        if (slip != null) {
            borrowSlips.add(slip);
            System.out.println("Borrowed book: " + book.getTitle() + " by " + reader.getFullName());
        }
    }

    // Tìm kiếm theo tên sách
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Không tìm thấy sách
    }

    // thống sách quá hạn
    public void listOverdueBooks() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Overdue Books:");
        for (BorrowSlip slip : borrowSlips) {
            LocalDate dueDate = LocalDate.parse(slip.getDueDate());
            if (currentDate.isAfter(dueDate)) {
                System.out.println("Sách: " + slip.getBook().getTitle() + ", Người mượn: "
                        + slip.getReader().getFullName() + ", Ngày đến hạn: " + slip.getDueDate());
            }
        }
    }

    public void printAllReaders() {
        System.out.println("Danh sach doc gia (" + readers.size() + " nguoi):");
        for (Reader r : readers) {
            System.out.println(r.getInfo());
        }
    }

    public double calculateTotalLateFee(int daysLate) {
        double total = 0;
        for (Reader r : readers) {
            total += r.calculateFine(0, daysLate); // Giả sử borrowDate là 0 để tính phí trễ
        }
        return total;
    }

    public Reader findReaderByName(String keyword) {
        for (Reader r : readers) {
            if (r.getFullName().toLowerCase().contains(keyword.toLowerCase())) {
                return r;
            }
        }
        return null;
    }

    public void printSeniorReaders() {
        System.out.println("===DOC GIA NGUOI CAO TUOI===");
        int count = 0;
        for (Reader r : readers) {
            if (r instanceof SeniorReader) {
                SeniorReader sr = (SeniorReader) r;
                System.out.println(sr.getInfo());
                System.out.println("Ma the NCT" + sr.getSeniorCardNumber()); // method riêng
                count++;
            }
        }
        if (count == 0)
            System.out.println("(Chua coc doc gia NCT)");

    }

    // Bước 1: Định nghĩa interface Strategy
    public interface LateFeePolicy {
        double applyPolicy(double baseFee);

        String getPolicyName();
    }

    // Bước 2: Cài đặt các chính sách cụ thể
    // Chính sách A: Tính phí đầy đủ (bình thường)
    public class StandardFeePolicy implements LateFeePolicy {
        @Override
        public double applyPolicy(double baseFee) {
            return baseFee;
        }

        @Override
        public String getPolicyName() {
            return "Phi phat tieu chuan (100%)";
        }
    }

    // Chính sách B: Tháng từ thiện — giảm 50% phí phạt
public class CharityFeePolicy implements LateFeePolicy {
    @Override
    public double applyPolicy(double baseFee) { return baseFee * 0.5; }
    @Override
        public String getPolicyName() { return "Thang tu thien — giam 50%"; }
}
 
// Chính sách C: Tháng khai trương — miễn phí phạt
public static class WaivedFeePolicy implements LateFeePolicy {
    @Override
    public double applyPolicy(double baseFee) { return 0; }
    @Override
    public String getPolicyName() { return "Mien phi phat (thang khai truong)"; }
}
 
// Bước 3: Library giữ strategy bằng Composition

   
 
    // Hoán đổi chính sách phí — không sửa code Library, chỉ inject strategy mới
    public void setFeePolicy(LateFeePolicy policy) {
        this.feePolicy = policy;
        System.out.println("Cap nhat chinh sach phi phat: " + policy.getPolicyName());
    }
 
    // Tính tổng phí phạt có áp dụng chính sách hiện tại
    public double calculateFine(int borrowDate, int dueDate) {
        double total = 0;
        for (Reader r : readers) {
            double baseFee      = r.calculateFine(borrowDate, dueDate); // dynamic binding
            double adjustedFee  = feePolicy.applyPolicy(baseFee);
            System.out.printf("  %-20s | Base: %6.0f | Sau CS: %6.0f VND%n",
                              r.getFullName(), baseFee, adjustedFee);
            total += adjustedFee;
        }
        System.out.printf("Tong phi phat (%s): %.0f VND%n",
                          feePolicy.getPolicyName(), total);
        return total;
    }
}




