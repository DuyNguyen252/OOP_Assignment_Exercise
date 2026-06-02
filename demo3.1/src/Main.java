import service.GymManager;
import model.Member;
import model.Membership;


public class Main {

    public static void main(String[] args) {
        // tao doi tuong quan ly
        GymManager manager = new GymManager();

        // tao cac goi tap
        Membership monthly = new Membership(
            "MBS01", 
            "Goi Thang",
            50000, 
            30
            );
        Membership yearly = new Membership(
            "MBS02",
            "Goi Nam",
            6000000,
            365
            );
        


        // tao cac hoi vien
        // Member member1 = new Member(
        //     1,
        //     "AnDy",
        //     "0123456789",
        //     "2024-06-01",
        //     monthly
        // );

        // Member member2 = new Member(
        //         2,
        //         "Binh",
        //         "0123456789",
        //         "2024-06-01",
        //         yearly);

        // them hoi vien vao he thong quan ly
        // manager.addMember(member1);
        // manager.addMember(member2);

        // su dung cac chuc nang cua quan ly
        System.out.println("\n");
        manager.showAllMembers();

        // tim kiem hoi vien theo ten
        String searchName = "AnDy";
        String searchName2 = "Huy";
        Member foundMember = manager.findByName(searchName);
        Member foundMember2 = manager.findByName(searchName2);
        if (foundMember != null) {
            System.out.println("Da tim thay hoi vien: " + foundMember.getFullName());
        } else {
            System.out.println("Khong tim thay hoi vien co ten: " + searchName);
        }
        if (foundMember2 != null) {
            System.out.println("Da tim thay hoi vien: " + foundMember2.getFullName());
        } else {
            System.out.println("Khong tim thay hoi vien co ten: " + searchName2);
        }


        // hien thi tong so hoi vien
        System.out.println("Tong so hoi vien: " + GymManager.getTotalMember());

        // cap nhat thong tin hoi vien
            // member1.setPhone("0987654321");
            // System.out.println("Thong tin hoi vien sau khi cap nhat:");
            // System.out.println(member1.getInfo());

        // kiem tra lien ket giua hoi vien va goi tap
        System.out.println("\n");
        System.out.println("Thong tin goi tap cua hoi vien " );
        boolean expired1 = monthly.isExpired(45);
        if (expired1) {
            System.out.println("Goi tap " + monthly.getPackageName() + " da het han.");
        } else {
            System.out.println("Goi tap " + monthly.getPackageName() + " con han.");
        }

        boolean expired2 = monthly.isExpired(15);
        if (expired2) {
            System.out.println("Goi tap " + monthly.getPackageName() + " da het han.");
        } else {
            System.out.println("Goi tap " + monthly.getPackageName() + " con han.");
        }

        boolean expired3 = yearly.isExpired(200);
        if (expired3) {
            System.out.println("Goi tap " + yearly.getPackageName() + " da het han.");
        } else {
            System.out.println("Goi tap " + yearly.getPackageName() + " con han.");
        }
        
        boolean expired4 = yearly.isExpired(400);
        if (expired4) {
            System.out.println("Goi tap " + yearly.getPackageName() + " da het han.");
        } else {
            System.out.println("Goi tap " + yearly.getPackageName() + " con han.");
        }   
        // System.out.println("Goi tap " + monthly.getPackageName() + " da het han: " + isExpired1);
        // System.out.println("Goi tap " + monthly.getPackageName() + " da het han: " + isExpired2);
        // System.out.println("Goi tap " + yearly.getPackageName() + " da het  han: " + isExpired3);
        // System.out.println("Goi tap " + yearly.getPackageName() + " da het han: " + isExpired4); 

    }
}