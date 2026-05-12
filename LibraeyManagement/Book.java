package LibraeyManagement;

public class Book {
    String title;
    String author;
    String publisher;
    double price;
    boolean available;

    public void printInfor() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);

    }

    public double getPrice() {
        return price;
    }

    public double caculateDiscount(double percent) {
        // return price + (price * percent / 100); // deu duoc
        return price - (price * percent / 100);
    }

}
