package main.java.com.model;

public class SeniorReader extends Reader {
    private String seniorCardNumber;

    public SeniorReader(String readerId, String fullName, String seniorCardNumber) {
        super(Integer.parseInt(readerId), fullName, "", TypeOfReader.GiangVien, ""); // Giả sử SeniorReader cũng là GiangVien
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
        return getInfo()
                + "| Ma the: " + seniorCardNumber
                + "[NCT - Mien phi phat]";
    }

}
