package com.gym.service;

import com.gym.model.Member;

import java.util.ArrayList;

public class GymManager {
    private ArrayList<Member> members;

    private static int totalMembers = 0;

    public GymManager() {
        members = new ArrayList<>();
    }

    // Them hoi vien
    public void addMember(Member m) {
        members.add(m);
        totalMembers++;
        System.out.println("Da them hoi vien: " + m.getFullName());
    }

    public void showAllMembers() {
        if (members.isEmpty()) {
            System.out.println("Chua co hoi vien nao");
            return;
        }
        System.out.println("========Danh sach hoi vien ========");
        for (Member m : members) {
            System.out.println(m.getInfo());
        }
    }

    // Tim kiem hoi vien: theo ten (so khop gan dung, khong phan biet chu hoa/thuong)
    public Member findByName(String name) {
        for (Member m : members) {
            if (m.getFullName().toLowerCase().contains(name.toLowerCase())) {
                return m;
            }
        }
        return null;
    }

    // --- Phuong thuc TINH ---
    public static int getTotalMembers() {
        return totalMembers;
    }
}

