package main.java.com.app;

import main.java.com.model.*;
import main.java.com.service.*;

public class Main {
    public static void main(String[] args) {
        Borrowable book1 = new Book(1, "Clean Code", "Robert Martin");
        Borrowable book2 = new Book(2, "Design Patterns", "GoF");

        book1.borrowBy("R001", "2024-09-01");
        System.out.println("Available: " + book2.isAvailable()); // true

        // Dung static method cua interface
        System.out.println(Borrowable.isValidBorrowDuration(10)); // true
        System.out.println(Borrowable.isValidBorrowDuration(20)); // false

        // Dung default method
        System.out.println(book1.calculateFine(3)); // 15000.0

        book1.returnBook("2024-09-15");
    }
}
