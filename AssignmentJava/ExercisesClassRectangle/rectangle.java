package AssignmentJava.ExercisesClassRectangle;

public class rectangle {
    double width, height;

    public void printInfo() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + (width * height));
        System.out.println("Perimeter: " + 2 * (width + height));
        System.out.println("-----------------------------");
    }
    public void isSquare() {
        if (width == height) {
            System.out.println("No la hinh vuong.");
        } else {
            System.out.println("No khong phai hinh vuong.");
        }
        System.out.println("-----------------------------");
    }
}
