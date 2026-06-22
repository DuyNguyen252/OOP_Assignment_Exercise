// package main.java.com.model;

// public class Lecturer extends Reader {
//     private String lecturerEx;

//     public Lecturer(int readerId, String fullName, String email,
//             TypeOfReader TypeOfReader,
//             String registerDate,
//             String studentCode, String lecturerEx) {

//         super(readerId,
//                 fullName,
//                 email,
//                 TypeOfReader,
//                 registerDate);

//         this.lecturerEx = lecturerEx;
//     }

//     public String getLecturerEx() {
//         return lecturerEx;
//     }

//     // @Override
//     // public String toString() {
//     //     return super.getInfo() + "| GiangVien" + lecturerEx;
//     // }

//     @Override
//     public int getMaxBorrow() {
//         return 5;
//     }

//     @Override
//     public double calculateFine(int borrowDate, int dueDate) {
//         return dueDate > borrowDate ? (dueDate - borrowDate) * 1000 : 0.0; // Ví dụ: 2000 VND/ngày trễ
//     }

//     @Override
//     public String getInfo() {
//         return "ID: " + getReaderId()
//             + ", Name: " + getFullName()
//             + ", Email: " + getEmail()
//             + ", Type: " + get_type()
//             + ", Register Date: " + getRegisterDate()
//             + "| GiangVien" + lecturerEx;
//     }
// }
