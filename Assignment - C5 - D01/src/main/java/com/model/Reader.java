package main.java.com.model;


    public abstract class Reader {
    protected int readerId;
    protected String fullName;
    private String Email;
    public enum TypeOfReader { GiangVien, SinhVien }
    private String registerDate;
    private TypeOfReader TypeOfReader;
    protected int currentBorrowCount;
    
    // public abstract void Readers();
    
//constructor
    public Reader(int readerId, String fullName, String Email, TypeOfReader TypeOfReader, String registerDate, int currentBorrowCount) {
        this.readerId = readerId;
        this.fullName = fullName;
        this.Email = Email;
        this.TypeOfReader = TypeOfReader;
        this.registerDate = registerDate;
        this.currentBorrowCount = currentBorrowCount;
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

    public int getCurrentBorrowCount() {
        return currentBorrowCount;
    }

    public void setCurrentBorrowCount(int currentBorrowCount) {
        this.currentBorrowCount = currentBorrowCount;
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

    // Template Method: quy trình cho mượn chuẩn (4 bước cố định)
    public final BorrowResult processBorrow(Book book) {
        // Bước 1: kiểm tra độc giả còn quyền mượn không (cố định)
        if (!checkBorrowQuota()) {
            return new BorrowResult(false, "Da dat gioi han muon: " + getMaxBorrow() + " cuon");
        }
        // Bước 2: kiểm tra điều kiện đặc thù của từng loại độc giả (abstract)
        if (!checkSpecialCondition(book)) {
            return new BorrowResult(false, getSpecialConditionMessage());
        }
        // Bước 3: trừ tồn kho sách (cố định)
        book.getDecreaseStock();
        currentBorrowCount++;
        // Bước 4: ghi nhận và thông báo (có thể override — Hook method)
        onBorrowSuccess(book);
        return new BorrowResult(true, "Muon thanh cong: " + book.getTitle());
    }
        // Bước 1 — cố định, dùng chung:
    private boolean checkBorrowQuota() {
        return currentBorrowCount < getMaxBorrow();
    }
 
    // Bước 2 — abstract: mỗi loại độc giả tự định nghĩa điều kiện đặc thù
    protected abstract boolean checkSpecialCondition(Book book);
    protected abstract String  getSpecialConditionMessage();
 
    // Bước 4 — Hook: có thể override để thêm hành động sau khi mượn thành công
    protected void onBorrowSuccess(Book book) {
        System.out.println(getFullName() + " muon: " + book.getTitle());
    }
 


 
// Lớp hỗ trợ để trả về kết quả giao dịch (rõ ràng hơn dùng boolean thuần):
    public class BorrowResult {
      private boolean success;
      private String  message;
      public BorrowResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
       public boolean isSuccess() { return success; }
       public String  getMessage() { return message; }
    }

}
    
   


    

    


