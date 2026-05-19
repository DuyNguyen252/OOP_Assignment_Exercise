import model.Book;
import model.Employee;
import model.BankAccount;

public class Main {
    public static void main(String[] args) {
        // Bài 1
        Book book1 = new Book();
        Book book2 = new Book(
                "Tap code",
                "ABC",
                2008,
                350000);

        Book book3 = new Book("Luyen code", "CBA");

        book1.applyDiscount(10);
        book2.applyDiscount(15);
        book3.applyDiscount(20);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        // Bài 2
        model.Rectangle rectangle1 = new model.Rectangle();
        model.Rectangle rectangle2 = new model.Rectangle(4, 5);

        rectangle1.displayInfo();
        rectangle2.displayInfo();

        // //Bài 3
        BankAccount account1 = new BankAccount("Nguyen Anh Duy", 123456789, 1000000);
        
           // Hiển thị thông tin
        account1.displayInfo();

        // Nạp tiền
        account1.deposit(500);

        System.out.println("Sau khi nap tien:");
        account1.displayInfo();

        // Rút tiền
        account1.withdraw(300);

        System.out.println("Sau khi rut tien:");
        account1.displayInfo();

        // Test lỗi
        account1.deposit(-100);

        account1.withdraw(5000);
        System.out.println("Sau khi nap tien khong hop le va rut tien khong hop le:");    
        account1.displayInfo();


        //Bài 4
        Employee e1 = new Employee("An", 1000);
        Employee e2 = new Employee("Binh", 2000);
        Employee e3 = new Employee("Cuong", 3000);

        System.out.println(e1.getId());
        System.out.println(e2.getId());
        System.out.println(e3.getId());

        System.out.println("Tong nhan vien: "
                + Employee.getEmployeeCount());

        System.out.println("Tong luong: "
                + Employee.getTotalSalary());

        System.out.println("Luong trung binh: "
                + Employee.getAverageSalary());

        // đổi lương
        e1.setSalary(5000);

        System.out.println("Tong luong moi: "
                + Employee.getTotalSalary());
    }
}
