package demo1;
public class Car{
    // thuoc tinh
    private String licensePlate;
    private String color;
    private int speed;

    
    public Car(String licensePlate, String color) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.speed = 0;
    }

    // phuong thuc (methods)
    public void accelerate(int delta) {
        speed += delta;
        System.out.println(licensePlate + " Tang toc len " + speed + " km/h");
    }

    public void brake(int delta) {
        speed = Math.max(0, speed - delta);
        System.out.println(licensePlate + " Giam toc xuong con " + speed + " km/h");
    }

    public void displayInfo() {
        System.out.println("Xe " + licensePlate + " mau " + color + " dang chay voi toc do " + speed + " km/h");
    
    }
}
