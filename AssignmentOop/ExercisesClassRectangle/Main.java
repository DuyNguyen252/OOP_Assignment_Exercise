package AssignmentOop.ExercisesClassRectangle;

public class Main {
    double width, height;

    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.width = 5;
        r1.height = 10;
        r1.printInfo();
        r1.isSquare();

        rectangle r2 = new rectangle();
        r2.width = 7;
        r2.height = 7;
        r2.printInfo();
        r2.isSquare();

        rectangle r3 = new rectangle();
        r3.width = 4;
        r3.height = 6;
        r3.printInfo();
        r3.isSquare();
    }

}
