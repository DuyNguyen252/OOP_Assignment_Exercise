package service;

import java.time.LocalDate;
import java.util.ArrayList;

import main.java.com.model.Book;
import model.Reader;
import model.BorrowSlip;

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

}