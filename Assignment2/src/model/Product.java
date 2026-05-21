package model;

import util.ProductValidator;

public class Product {

    // Thuộc tính
    private String productCode;
    private String name;
    private double price;
    private int quantity;

    // Static
    private static int counter = 1;
    private static int totalProducts = 0;
    private static double totalRevenue = 0;

    // Constructor không tham số
    public Product() {
        productCode = String.format("P-%04d", counter++);
        name = "Unknown";
        price = 0;
        quantity = 0;

        totalProducts++;
    }

    // Constructor 2 tham số
    public Product(String name, double price) {
        productCode = String.format("P-%04d", counter++);

        setName(name);
        setPrice(price);

        quantity = 0;

        totalProducts++;
    }

    // Constructor 3 tham số
    public Product(String name, double price, int quantity) {
        productCode = String.format("P-%04d", counter++);

        setName(name);
        setPrice(price);
        setQuantity(quantity);

        totalProducts++;
    }

    // Getter
    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter
    public void setName(String name) {
        if (ProductValidator.isValidName(name)) {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (ProductValidator.isValidPrice(price)) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (ProductValidator.isValidQuantity(quantity)) {
            this.quantity = quantity;
        }
    }

    // Bán sản phẩm
    public void sell(int amount) {

        if (amount > 0 && amount <= quantity) {

            quantity = quantity - amount;

            totalRevenue = totalRevenue + amount * price;

            System.out.println("Ban hang thanh cong");
        } else {
            System.out.println("Khong du hang");
        }
    }

    // Nhập thêm hàng
    public void restock(int amount) {

        if (amount > 0) {

            quantity = quantity + amount;

            System.out.println("Nhap hang thanh cong");
        }
    }

    // Hiển thị thông tin
    public void displayInfo() {

        System.out.println("Ma SP: " + productCode);
        System.out.println("Ten SP: " + name);
        System.out.println("Gia: " + price);
        System.out.println("So luong: " + quantity);

        System.out.println("-------------------");
    }

    // Static methods
    public static int getTotalProducts() {
        return totalProducts;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public static String getStoreReport() {

        return "Tong san pham: " + totalProducts +
                "\nTong doanh thu: " + totalRevenue;
    }
}