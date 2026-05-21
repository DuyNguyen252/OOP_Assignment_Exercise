package com.gym.model;

public class Membership {
    // --- Thuộc tính: private --> tính gói
    private String packageId;
    private String packageName;
    private double price;
    private  int durationDays;

    // --- Hàm tạo (Constructors)
    public Membership(String packageId, String packageName, double price, int durationDays) {
        this.packageId = packageId;
        this.packageName = packageName;
        this.price = price;
        this.durationDays = durationDays;
    }

    // -- Getters/Setters ---
    public String getPackageId() { return packageId; }
    public void setPackageId(String packageId) { this.packageId = packageId; }

    public String getPackageName() { return packageName; }
    public void setPackageName(String packageName) { this.packageName = packageName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getDurationDays() { return durationDays; }
    public void setDurationDays(int durationDays) { this.durationDays = durationDays; }

    // --- Logic nghiệp vụ ---
    // Trả về true nếu như gói tập đã hết hạn so với số ngày đã sử dụng
    public boolean isExpired(int daysUsed) {
        return daysUsed > durationDays;
    }

    public String getInfo() {
        return "[ "+ packageId + ", " + packageName + ", " + price + ", " + durationDays + "]";
    }
}
