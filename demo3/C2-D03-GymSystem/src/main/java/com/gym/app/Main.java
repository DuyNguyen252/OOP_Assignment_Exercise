package com.gym.app;

import com.gym.model.Member;
import com.gym.model.Membership;
import com.gym.service.GymManager;

public class Main {
    public static void main(String[] args) {

        // 1. Tao doi tuong quan ly
        GymManager manager = new GymManager();

        // 2. Tao cac goi tap (Membership)
        Membership monthly = new Membership(
                "MBSH01",
                "Goi thang",
                500000,
                30
                );
        Membership yearly = new Membership(
                "MBSH02",
                "Goi nam",
                5000000,
                365
        );

        // 3. Members
        Member m1 = new Member(
                "HV001",
                "Nguyen Van An",
                "09011111111",
                "02/05/2026",
                monthly
        );

        Member m2 = new Member(
                "HV002",
                "Tran Van Binh",
                "09022222222",
                "02/05/2026",
                yearly
        );

        // 4. Them hoi vien vao he thong
        manager.addMember(m1);
        manager.addMember(m2);

        // 5. Su dung cac chuc nang
        System.out.println();
        manager.showAllMembers();

        // 6. Tim kiem hoi vien
        System.out.println();
        Member found = manager.findByName("abc");
        if (found != null) {
            System.out.println("Tim thay: " + found.getInfo());
        } else {
            System.out.println("Khong tim thay hoi vien");
        }

        // 7. Kiem tra het han
        System.out.println();
        boolean expired = monthly.isExpired(45);
        if (expired) {
            System.out.println("Goi thang nay da het han");
        } else {
            System.out.println("Goi tap van con han");
        }
    }
}
