package main.java.com.model;

public class FacultyReader extends Reader {
    private String facultyCardNumber;

    public FacultyReader(String readerId, String fullName, String facultyCardNumber) {
        super(Integer.parseInt(readerId), fullName, "", TypeOfReader.GiangVien, "");
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
                + "[TypeOrder - Tien phat cua giang vien ]";
    }

}
