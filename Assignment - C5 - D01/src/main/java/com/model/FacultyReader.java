package main.java.com.model;



public class FacultyReader extends Reader {
    private String facultyCardNumber;

    public FacultyReader(String readerId, String fullName, String facultyCardNumber, int currentBorrowCount) {
        super(Integer.parseInt(readerId), fullName, "", TypeOfReader.GiangVien, "", currentBorrowCount);
        this.facultyCardNumber = facultyCardNumber;
    }

    public String getFacultyCardNumber() {
        return facultyCardNumber;
    }

    @Override
    public double calculateFine(int borrowDate, int dueDate) {
        return 1000.0 * (dueDate - borrowDate);
    }

    @Override
    public int getMaxBorrow() {
        return 5;
    }

    @Override
    public String getInfo() {
        return "| Ma the: " + facultyCardNumber
                + "[ " + getFullName() + " - Tien phat cua giang vien ]";
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
