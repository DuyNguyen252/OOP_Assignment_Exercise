// package main.java.com.model;

// public class Student extends Reader {
//     private String studentEx;

//     public Student(int readerId, String fullName, String email,
//             TypeOfReader TypeOfReader,
//             String registerDate,
//             String studentCode, String studentEx, int currentBorrowCount) {

//         super(readerId,
//                 fullName,
//                 email,
//                 TypeOfReader,
//                 registerDate,
//                 currentBorrowCount);

//         this.studentEx = studentEx;
//     }

//     public String getStudentEx() { return studentEx; }


    
//     // @Override
//     // public String toString() {
//     //     return super.getInfo() + "| SinhVien" + studentEx;
//     // }

//     @Override
//     public int getMaxBorrow() {
//         return 3;
//     }

//     @Override
//     public double calculateFine(int borrowDate, int dueDate) {
//         return dueDate > borrowDate ? (dueDate - borrowDate) * 2000 : 0.0; // Ví dụ: 2000 VND/ngày trễq
//     }

//     @Override
//     public String getInfo() {
//         return "ID: " + getReaderId()
//             + ", Name: " + getFullName()
//             + ", Email: " + getEmail()
//             + ", Type: " + get_type()
//             + ", Register Date: " + getRegisterDate()
//             + "| SinhVien" + studentEx;
//     }

//     // ... các field và method hiện có ...

//     @Override
//     protected boolean checkSpecialCondition(Book book) {
//         // Sinh viên không được mượn sách tham khảo hiếm (referenceOnly = true)
//         return !book.getIsReferenceOnly();
//     }

//     @Override
//     protected String getSpecialConditionMessage() {
//         return "Sach tham khao chi doc tai cho — sinh vien khong duoc mang ve";
//     }


// }
