package main.java.com.model;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String yearOfPublication;
    private int totalBooks;
    private int decreaseStock;
    private boolean isReferenceOnly;


    // Constructor
    public Book(int bookId, String title, String author, String yearOfPublication, int totalBooks, int decreaseStock, boolean isReferenceOnly) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.totalBooks = totalBooks;
        this.decreaseStock= decreaseStock;
        this.isReferenceOnly = isReferenceOnly;
    }

    // Getters and Setters
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
            + ", isReferenceOnly" + isReferenceOnly;

    }
}
