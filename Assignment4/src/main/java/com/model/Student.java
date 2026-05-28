package main.java.com.model;

public class Student extends Reader {
    private String studentEx;

    public Student(int readerId, String fullName, String email,
            TypeOfReader TypeOfReader,
            String registerDate,
            String studentCode, String studentEx) {

        super(readerId,
                fullName,
                email,
                TypeOfReader,
                registerDate);

        this.studentEx = studentEx;
    }

    public String getStudentEx() { return studentEx; }

    @Override
    public String toString() {
        return super.toString() + "| SinhVien" + studentEx;
    }

    @Override
    public int getMaxBorrow() {
        return 3;
    }

}
