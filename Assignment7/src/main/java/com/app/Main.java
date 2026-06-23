package main.java.com.app;

import main.java.com.model.*;
import main.java.com.service.*;
import main.java.com.service.Library.CharityFeePolicy;
import main.java.com.service.Library.WaivedFeePolicy;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng thủ thư
        Library library = new Library();

        library.addReader(new StudentReader("SV01", "Nguyen Van A", "SINH_VIEN", 3));
        library.addReader(new FacultyReader("GV01", "Tran Thi B", "GIANG_VIEN", 5));
        library.addReader(new SeniorReader("CC01", "Le Van C", "CC2024", 0));

        // Tháng bình thường:
        System.out.println("=== Thang binh thuong ===");
        library.calculateTotalLateFee(7);

        // Tháng từ thiện — chỉ đổi policy, không sửa code Library
        library.setFeePolicy(new CharityFeePolicy());
        System.out.println("\n=== Thang tu thien ===");
        library.calculateTotalLateFee(7);

        // Tháng khai trương — miễn phí
        library.setFeePolicy(new WaivedFeePolicy());
        System.out.println("\n=== Thang khai truong ===");
        library.calculateTotalLateFee(7);

    }
}

/// Yeu cau 3:
/*
 * 1.
 * [Library] HAS-A [Book]
 * [Library] HAS-A [Reader]
 * [Library] HAS-A [BorrowSlip]
 * [Library] HAS-A [LateFeePolicy]
 * 
 * 2.
 * [Student / Faculty / SeniorReader] IS-A [Reader]
 * [Standard / Charity / WaivedFeePolicy] IS-A [LateFeePolicy]
 * 
 */
