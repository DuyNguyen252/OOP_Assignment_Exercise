package main.java.com.app;

import main.java.com.model.*;
import main.java.com.service.*;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng thủ thư
        Librarian librarian = new Librarian();

        // Tạo một số sách
        Book book1 = new Book(1, "Nghĩ giàu làm giàu", "napoleon hill", "1937", 100);
        Book book2 = new Book(2, "Đọc vị bất kỳ ai", "Lieberman", "2024", 50);
        // Book book3 = new Book(3, "Biệt kích lính dù", "Stephen Ambrose", "2001", 150);
        // Book book4 = new Book(4, "The Prince (Quân vương)", "Niccolo Machiavelli", "1532", 120);

        // Tạo một số độc giả
        // Reader reader1 = new Reader(1,
        //         "Thầy Phúc",
        //         "alice@example.com",
        //         Reader.TypeOfReader.GiangVien,
        //         "2024-06-01");

        // Reader reader2 = new Reader(2,
        //         "Andy",
        //         "bob@example.com",
        //         Reader.TypeOfReader.SinhVien,
        //         "2024-06-01");

        Student reader3 = new Student(3,
                "UTE",
                "bob@example.com",
                Reader.TypeOfReader.SinhVien,
                "2024-06-01",
                "SinhVien03",
                "SinhVien");

        Lecturer reader4 = new Lecturer(4,
                "UTE-Lecturer",
                "bob@example.com",
                Reader.TypeOfReader.GiangVien,
                "2024-06-01",
                "GiangVien",
                "GiangVien");
        


        // Hiển thị thong tin reader1 mượn sách và trả sách
        System.out.println("\n");
        // System.out.println("Thông tin độc giả:" + reader1.getInfo());
        System.out.println("Thông tin sách trước khi mượn:" + book1.getInfo());
        // BorrowSlip slip1 = librarian.borrowBook(reader1, book1, 1, "2024-06-01", "2024-06-12");
        // System.out.println("Thông tin phiếu mượn:" + slip1.getInfo());
        System.out.println("Thông tin sách sau khi mượn:" + book1.getInfo());
        System.out.println("Độc giả trả sách:");
        // librarian.returnBook(slip1, "2024-06-12"); // Trả sách muộn
        System.out.println("Thông tin sách sau khi trả:" + book1.getInfo());
        System.out.println("-----------------------------------------------");

        // Hiển thị thong tin reader2 mượn sách và trả sách
        System.out.println("\n");
        // System.out.println("Thông tin độc giả: " + reader2.getInfo());
        System.out.println("Thông tin sách trước khi mượn: " + book2.getInfo());
        // BorrowSlip slip2 = librarian.borrowBook(reader2, book2, 2, "2024-06-01", "2026-06-04");
        // System.out.println("Thông tin phiếu mượn: " + slip2.getInfo());
        System.out.println("Thông tin sách sau khi mượn: " + book2.getInfo());
        System.out.println("Độc giả trả sách: ");
        // librarian.returnBook(slip2, "2026-05-26"); // Trả sách đúng hạn
        System.out.println("Thông tin sách sau khi trả: " + book2.getInfo());
        System.out.println("-----------------------------------------------");

        // Hiển thị thong tin reader3 mượn sách và trả sách Phuong Thuc Extends
        System.out.println("\n");
        System.out.println("Thông tin độc giả:" + reader3.getInfo());
        System.out.println("Thông tin sách trước khi mượn:" + book1.getInfo());
        BorrowSlip slip3 = librarian.borrowBook(reader3, book1, 1, "2024-06-01", "2024-06-12");
        System.out.println("Thông tin phiếu mượn:" + slip3.getInfo());
        System.out.println("Thông tin sách sau khi mượn:" + book1.getInfo());
        System.out.println("Độc giả trả sách:");
        // librarian.returnBook(slip1, "2024-06-12"); // Trả sách muộn
        System.out.println("Thông tin sách sau khi trả:" + book1.getInfo());
        System.out.println("-----------------------------------------------");

        // Hiển thị thong tin reader3 mượn sách và trả sách Phuong Thuc Extends
        System.out.println("\n");
        System.out.println("Thông tin độc giả:" + reader4.getInfo());
        System.out.println("Thông tin sách trước khi mượn:" + book1.getInfo());
        BorrowSlip slip4 = librarian.borrowBook(reader4, book1, 1, "2024-06-01", "2024-06-12");
        System.out.println("Thông tin phiếu mượn:" + slip4.getInfo());
        System.out.println("Thông tin sách sau khi mượn:" + book1.getInfo());
        System.out.println("Độc giả trả sách:");
        librarian.returnBook(slip4, "2024-06-12"); // Trả sách muộn
        System.out.println("Thông tin sách sau khi trả:" + book1.getInfo());
        System.out.println("-----------------------------------------------");

        // tìm kiếm sách theo tên
        System.out.println("\n");
        System.out.println("Tìm kiếm sách theo tên:");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        Book searchResult = library.searchBookByTitle("Nghĩ giàu làm giàu");
        if (searchResult != null) {
            System.out.println("Tìm thấy sách: " + searchResult.getInfo());
        } else {
            System.out.println("Không tìm thấy sách.");
        }
        Book searchResult2 = library.searchBookByTitle("Đọc vị bất kỳ ai");
        if (searchResult2 != null) {
            System.out.println("Tìm thấy sách: " + searchResult2.getInfo());
        } else {
            System.out.println("Không tìm thấy sách.");
        }

        // quản lý thêm sách và độc giả
        System.err.println("\n");
        System.out.println("Quản lý sách và độc giả:");
        library.addBook(new Book(3, "Sách mới", "Tác giả mới", "2024", 30));
        System.out.println("Danh sách sách:");
        library.getBooks();

        System.err.println("\n");
        // library.registerReader(
                // new Reader(3, "Độc giả mới", "newreader@example.com", Reader.TypeOfReader.SinhVien, "2024-06-01"));
        System.out.println("Danh sách độc giả:");
        library.getReaders();

        // quản lý mượn sách
        System.err.println("\n");
        System.out.println("Quản lý mượn sách:");
        // library.borrowBook(librarian, reader1, book1, 7, "2024-06-01", "2024-06-10"); // Mượn sách với ngày đến hạn đã
        // library.borrowBook(librarian, reader2, book2, 8, "2024-06-01", "2024-06-15"); // Mượn sách với ngày đến hạn chưa
        library.listOverdueBooks(); // Hiển thị sách quá hạn

        // test getMaxBorrow
        System.err.println("\n");
        Student st = new Student(5, "Nguyen Anh Duy", "bob@example.com", Reader.TypeOfReader.SinhVien, "2024-06-01", null, null);
        System.out.println(st.getMaxBorrow());// 3

        Lecturer lt = new Lecturer(6, "GiangVienHCMUTE", "bob@example.com", Reader.TypeOfReader.GiangVien, "2024-06-01", null, null);
        System.out.println(lt.getMaxBorrow());// 5


        // test toString
        System.out.println(st.toString());
        System.out.println(lt.toString());

        //test calculateFine
        System.out.println("Tiền phạt của sinh viên: " + st.calculateFine(10, 15)); // 10000 VND
        System.out.println("Tiền phạt của giảng viên: " + lt.calculateFine(10, 15)); // 5000 VND


        // test abstract method getInfo
        System.out.println("Thông tin sinh viên: " + st.getInfo());
        System.out.println("Thông tin giảng viên: " + lt.getInfo());



        System.out.println("\n");
        System.out.println("---------------------Assignament06-----------------------");
        //Assignament06
        //Tạo thư viện thêm 3 loại sach
        library.addReader(new StudentReader("001", "NguyenThanhTai", "SV"));
        library.addReader(new FacultyReader("002", "NguyenAnhDuy", "GV"));
        library.addReader(new SeniorReader("003", "Andromeda", "NCT"));

        //Yeu cầu 2.1
        library.printAllReaders();
        //3 dòng output,

        // Yều cầu 2.2
        double total = library.calculateTotalLateFee(5);
        System.out.printf("Tong hinh phat qua 5 ngay %.0f VND %n",total);

        //2.3
        Reader found = library.findReaderByName("NguyenAndy");
        if(found != null) {
            System.out.println(found.getInfo());
            System.out.println(found.getMaxBorrow());
        
        }


        //Yêu cầu 2.4:
        library.printSeniorReaders();
        


    }
}



