package main.java.com.model;

public class StudentReader extends Reader {
    private String studentCardNumber;

    public StudentReader(String readerId, String fullName, String studentCardNumber) {
        super(Integer.parseInt(readerId), fullName, "", TypeOfReader.SinhVien, "");
        this.studentCardNumber = studentCardNumber;
    }

    public String getStudentCardNumber() {
        return studentCardNumber;
    }

    @Override
    public double calculateFine(int borrowDate, int dueDate) {
        return 2000.0 * (dueDate - borrowDate);
    }

    @Override
    public int getMaxBorrow() {
        return 3;
    }

    @Override
    public String getInfo() {
        return "| Ma the: " + studentCardNumber
                + "[ " + getFullName() + " - Tien phat cua sinh vien ]";
    }
}
