package service;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
    public boolean isSquare() {
        return width == height;
  }

  public void displayInfo() {
      System.out.println("Hình chữ nhật: width = " + width + ", height = " + height);
      System.out.println("Diện tích: " + getArea());
      System.out.println("Chu vi: " + getPerimeter());
      System.out.println("Là hình vuông: " + isSquare());
      System.out.print("\n");
  }


}
