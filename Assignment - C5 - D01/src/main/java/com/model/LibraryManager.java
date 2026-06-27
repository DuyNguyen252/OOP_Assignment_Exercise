package main.java.com.model;

import java.util.*;

import main.java.com.model.Reader.TypeOfReader;

public class LibraryManager {
    public void processAllBorrowable(List<Borrowable> items) {
        System.out.println("=== BORROWABLE ITEM STATUS ===");
        for (Borrowable item : items) {
            String s = item.isAvailable()
                    ? "Available"
                    : "Borrowed by " + item.getBorrowerId();
            System.out.println("  -> " + s);
        }
    }

    public void notifyAll(List<Notifiable> users, String message) {
        System.out.println("=== SENDING NOTIFICATIONS ===");
        for (Notifiable user : users) {
            user.sendNotification(message);
        }
    }

    public static void main(String[] args) {
        LibraryManager mgr = new LibraryManager();

        List<Borrowable> items = new ArrayList<>();
        Book b1 = new Book(1001, "Clean Code", "Robert Martin", "2008", 10, 0, false);
        Book b2 = new Book(1002, "Design Patterns", "GoF", "1994", 5, 0, false);
        // b1.borrowBy("R001", "2024-09-01");
        items.add(b1);
        items.add(b2);
        mgr.processAllBorrowable(items);

        List<Notifiable> readers = new ArrayList<>();
        Reader r1 = new Reader(2001, "Nguyen Van A", "A", "anguyen@gmail.com", TypeOfReader.SinhVien, "2024-09-01", 0);
        Reader r2 = new Reader(2002, "Tran Thi B", "B", "btran@gmail.com", TypeOfReader.GiangVien, "2024-09-02", 0);

        mgr.notifyAll(readers, "Thu vien se dong cua ngay 20/9.");
    }

}
