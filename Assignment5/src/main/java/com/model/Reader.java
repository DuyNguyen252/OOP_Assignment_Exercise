package main.java.com.model;


    public abstract class Reader {
    private int readerId;
    private String fullName;
    private String Email;
    public enum TypeOfReader { GiangVien, SinhVien }
    private String registerDate;
    private TypeOfReader TypeOfReader;
    
    // public abstract void Readers();
    
//constructor
    public Reader(int readerId, String fullName, String Email, TypeOfReader TypeOfReader, String registerDate) {
        this.readerId = readerId;
        this.fullName = fullName;
        this.Email = Email;
        this.TypeOfReader = TypeOfReader;
        this.registerDate = registerDate;
    }

//getter va setter
    public int getReaderId() {
        return readerId;
    }
    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }  

    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRegisterDate() {
        return registerDate;
    }
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public TypeOfReader get_type() {
        return TypeOfReader;
    }
    public void set_type(TypeOfReader TypeOfReader) {
        this.TypeOfReader = TypeOfReader;
    }

    //method
    // public String getInfo() {
    //     return "ID: " + readerId
    //         + ", Name: " + fullName
    //         + ", Email: " + Email
    //         + ", Type: " + TypeOfReader
    //         + ", Register Date: " + registerDate;
    // }



    

    public abstract int getMaxBorrow();
    public abstract double calculateFine(int borrowDate, int dueDate);
    public abstract String getInfo();


}
