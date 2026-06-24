package main.java.com.model;

public class Book implements Borrowable {
    private int bookId;
    private String title;
    private String author;
    private String yearOfPublication;
    private int totalBooks;
    private int decreaseStock;
    private boolean isReferenceOnly;
    private String currentBorrowerId;
    private String borrowDate;

    // Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.currentBorrowerId = null;
    }

    // Getters and Setters

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public void setTotalBooks(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    public int getDecreaseStock() {
        return decreaseStock;
    }

    public void setDecreaseStock(int decreaseStock) {
        this.decreaseStock = decreaseStock;
    }

    public boolean getIsReferenceOnly() {
        return isReferenceOnly;
    }

    public void setIsReferenceOnly(boolean isReferenceOnly) {
        this.isReferenceOnly = isReferenceOnly;
    }

    // Method
    public String getInfo() {
        return "Book ID: " + bookId
                + ", Title: " + title
                + ", Author: " + author
                + ", Year of Publication: " + yearOfPublication
                + ", Total Books: " + totalBooks
                + ", decreaseStock:" + decreaseStock
                + ", isReferenceOnly" + isReferenceOnly
                + ", currentBorrowerId" + currentBorrowerId
                + ", borrowDate" + borrowDate;

    }

    @Override
    public void borrowBy(String readerId, String date) {
        if (!isAvailable()) {
            System.out.println("Book '" + title + "' is not available.");
            return;
        }
        this.currentBorrowerId = readerId;
        this.borrowDate = date;
        System.out.println("Book '" + title + "' borrowed by " + readerId);

    }

    @Override
    public void returnBook(String date) {
        System.out.println("Book '" + title + "' returned on " + date);
        this.currentBorrowerId = null;
        this.borrowDate = null;
    }

    @Override
    public boolean isAvailable() {
        return currentBorrowerId == null;
    }

    @Override
    public String getBorrowerId() {
        return currentBorrowerId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
