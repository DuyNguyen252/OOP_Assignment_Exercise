package model;

import main.java.com.model.Book;

public class BorrowSlip {
    private int slipId;
    private Reader reader;
    private Book book;
    private String borrowDate;
    private String dueDate;

    // Constructor
    public BorrowSlip(int slipId, Reader reader, Book book, String borrowDate, String dueDate) {
        this.slipId = slipId;
        this.reader = reader;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    // Getters and Setters
    public int getSlipId() {
        return slipId;
    }

    public void setSlipId(int slipId) {
        this.slipId = slipId;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // Method
    public String getInfo() {
        return "Borrow Slip ID: " + slipId
                + ", Reader: " + reader.getFullName()
                + ", Book: " + book.getTitle()
                + ", Borrow Date: " + borrowDate
                + ", Due Date: " + dueDate;
    }
}