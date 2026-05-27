package model;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String yearOfPublication;
    private int totalBooks;


    // Constructor
    public Book(int bookId, String title, String author, String yearOfPublication, int totalBooks) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.totalBooks = totalBooks;
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

    // Method
    public String getInfo() {
        return "Book ID: " + bookId
            + ", Title: " + title
            + ", Author: " + author
            + ", Year of Publication: " + yearOfPublication
            + ", Total Books: " + totalBooks;
    }
}
