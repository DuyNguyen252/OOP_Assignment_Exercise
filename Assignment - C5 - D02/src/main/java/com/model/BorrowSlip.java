package main.java.com.model;

public class BorrowSlip implements Returnable {
    private int slipId;
    private Reader reader;
    private String readerId;
    private Book book;
    private String borrowDate;
    private String bookId;
    private String dueDate;
    private String returnDate;

    // Constructor
    public BorrowSlip(int slipId, Reader reader, String readerId, Book book, String bookId, String borrowDate, String dueDate) {
        this.slipId = slipId;
        this.reader = reader;
        this.readerId = readerId;
        this.bookId = bookId;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    

    // Getters and Setters
    public String getReaderId() {
        return readerId;
    }
    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

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

    @Override
    public void confirmReturn(String date) {
        this.returnDate = date;
        System.out.println("Slip " + slipId + " confirmed return on " + date);
    }

    @Override
    public String getReturnDate() {
        return returnDate;
    }

    @Override
    public boolean isReturned() {
        return returnDate != null;
    }


    


}