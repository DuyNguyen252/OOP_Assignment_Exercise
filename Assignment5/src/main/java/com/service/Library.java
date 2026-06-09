package main.java.com.service;

import main.java.com.model.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books;
    private ArrayList<Reader> readers;
    private ArrayList<BorrowSlip> borrowSlips;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
        this.borrowSlips = new ArrayList<>();
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
    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Registered reader: " + reader.getFullName());
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

    public void showAllBooks() {
        System.out.println("=== DANH SACH SACH ===");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
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

    public void showLateFees(int borrowDate, int dueDate) {
        int daysLate = dueDate - borrowDate;
        System.out.println("=== PHI PHAT TRE HAN === (" + daysLate + " ngày trễ)");
        for (Reader r : readers) {
            System.out.printf(" %-25s | Fee: %,.0f VND%n",
                    r.getFullName(), r.calculateFine(borrowDate, dueDate));
        }
        
    }

    public void showAllReaders() {
        System.out.println("=== DANH SACH DOC GIA ===");
        for (Reader r : readers) {
            System.out.println(r.getInfo()); // Đa hình: tự gọi đúng lớp con
        }
    }

}