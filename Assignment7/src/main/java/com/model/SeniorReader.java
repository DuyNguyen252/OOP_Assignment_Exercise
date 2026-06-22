package main.java.com.model;

public class SeniorReader extends Reader {
    private String seniorCardNumber;

    public SeniorReader(String readerId, String fullName, String seniorCardNumber, int currentBorrowCount) {
        super(Integer.parseInt(readerId), fullName, "", TypeOfReader.GiangVien, "", currentBorrowCount); // Giả sử SeniorReader cũng là GiangVien
        this.seniorCardNumber = seniorCardNumber;
    }

    public String getSeniorCardNumber() {
        return seniorCardNumber;
    }

    @Override
    public double calculateFine(int borrowDate, int dueDate) {
        return 0.0; // Chinh sách mien phí phạt cho SeniorReader
    }

    @Override
    public int getMaxBorrow() {
        return Integer.MAX_VALUE; // khong gioi han so lan muon sach
    }

    @Override
    public String getInfo() {
        return "| Ma the: " + seniorCardNumber
                + "[ " + getFullName() + " - Mien phi phat]";
    }

    @Override
    protected boolean checkSpecialCondition(Book book) {
        return true;
    }

    @Override
    protected String getSpecialConditionMessage() {
        return "";
    }

    @Override
    protected void onBorrowSuccess(Book book) {
        super.onBorrowSuccess(book); // In thông báo thông thường
        System.out.println("  -> Da ghi nhan: Nguoi cao tuoi — khong thu phi phat");
    }


}
