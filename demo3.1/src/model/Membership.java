package model;

public class Membership {
    //// Thuộc tính private --> tinh gói
    private String packageId;
    private String packageName;
    private double price;
    private int durationDays; // in months

    // ---Ham tao constructor
    public Membership(String packageId, String packageName, double price, int durationDays) {
        this.packageId = packageId;
        this.packageName = packageName;
        this.price = price;
        this.durationDays = durationDays;
    }

    //// ---Ham getter and setter
    public String getPackageId() {
        return packageId;
    }
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getDurationDays() {
        return durationDays;
    }
    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    /// logic nghiep vu
    // tra ve gia tri true neu nhu goi tap het han so voi ngay da su dung
    public boolean isExpired(int daysUsed) {
        // boolean expired = daysUsed > durationDays;
        return daysUsed > durationDays;
    }
    
    public String getInfo() {
        return "[ "+ packageId +", " + packageName + "," + price + "," + durationDays + " ]";
    }

    
}