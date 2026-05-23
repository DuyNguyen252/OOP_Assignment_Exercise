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

    public double price() {
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
    //
    


    
}