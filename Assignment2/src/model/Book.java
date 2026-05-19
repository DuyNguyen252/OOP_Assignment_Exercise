package model;

public class Book {

    String title;
    String author;
    int year;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.year = 2000;
        this.price = 0;
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 2026;
        this.price = 100000;
    }

    public void displayInfo() {
        System.out.println("title: " + title + ", author: " + author + ", year: " + year + ", price: $" + price);
        System.out.print("\n");
    }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }
}
