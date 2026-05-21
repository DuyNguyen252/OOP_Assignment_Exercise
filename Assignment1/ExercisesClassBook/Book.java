package Assignment1.ExercisesClassBook;

public class Book {
    String title;
    String author;
    double price;
    boolean inStock;

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("In Stock: " + inStock);
        System.out.println("-----------------------------");
    }

    public void applyDiscount(double percent) {
    price = price - (price * percent / 100);
    }
}
