package Assignment1.ExercisesClassCricle;

public class circle {
    double radius;

    public void printInfo() {
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
        System.out.println("------------------------------");
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

}
