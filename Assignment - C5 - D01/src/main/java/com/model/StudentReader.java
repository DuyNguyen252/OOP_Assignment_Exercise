// package main.java.com.model;

// public class StudentReader extends Reader {
//     private String studentCardNumber;

//     public StudentReader(String readerId, String fullName, String studentCardNumber, int currentBorrowCount) {
//         super(Integer.parseInt(readerId), fullName, "",TypeOfReader.SinhVien,"", currentBorrowCount);
//         this.studentCardNumber = studentCardNumber;
//     }

//     public String getStudentCardNumber() {
//         return studentCardNumber;
//     }

//     @Override
//     public double calculateFine(int borrowDate, int dueDate) {
//         return 2000.0*(dueDate - borrowDate);
//     }

//     @Override
//     public int getMaxBorrow() {
//         return 3;
//     }

//     @Override
//     public String getInfo() {
//         return "| Ma the: " + studentCardNumber
//                 + "[ "+ getFullName() +" - Tien phat cua sinh vien ]";
//     }

//     @Override
//     protected boolean checkSpecialCondition(Book book) {
//         return true;
//     }

//     @Override
//     protected String getSpecialConditionMessage() {
//         return "";
//     }

//     @Override
//     protected void onBorrowSuccess(Book book) {
//         super.onBorrowSuccess(book); // In thông báo thông thường
//         System.out.println("  -> Da ghi nhan: Nguoi cao tuoi — khong thu phi phat");
//     }
// }
