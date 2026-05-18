package demo1;

public class Car2 {
    public static void main(String[] args) {
        Car car1 = new Car("29A-12345", "Đỏ");
        Car car2 = new Car("29A-12346", "Xanh");

        car1.displayInfo();
        car2.displayInfo();
        car1.accelerate(40);
        car2.accelerate(60);
        car1.brake(15);

        car1.displayInfo();
        car2.displayInfo();
    }
}
