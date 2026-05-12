package AssignmentJava.ExercisesClassBook;

public class Main {
    String title;
    String author;
    double price;
    boolean inStock;

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Dac Nhan Tam";
        b1.author = "Dale Carnegie";
        b1.price = 100;
        b1.inStock = true;
        b1.applyDiscount(10);
        b1.printInfo();

        Book b2 = new Book();
        b2.title = "Nha Gia Kim";
        b2.author = "Paulo Coelho";
        b2.price = 150;
        b2.inStock = false;
        b2.applyDiscount(10);
        b2.printInfo();

        Book b3 = new Book();
        b3.title = "Tu Duy Nhanh Va Cham";
        b3.author = "Linh Pham";
        b3.price = 120;
        b3.inStock = true;
        b3.applyDiscount(10 );
        b3.printInfo();
    }
}
