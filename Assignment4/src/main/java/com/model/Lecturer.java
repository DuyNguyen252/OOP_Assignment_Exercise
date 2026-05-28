package main.java.com.model;

public class Lecturer extends Reader {
    private String lecturerEx;

    public Lecturer(int readerId, String fullName, String email,
            TypeOfReader TypeOfReader,
            String registerDate,
            String studentCode, String lecturerEx) {

        super(readerId,
                fullName,
                email,
                TypeOfReader,
                registerDate);

        this.lecturerEx = lecturerEx;
    }

    public String getLecturerEx() { return lecturerEx; }

    @Override
    public String toString() {
        return super.toString() + "| GiangVien" + lecturerEx;
    }

    @Override
    public int getMaxBorrow() {
        return 5;    
    }
}
