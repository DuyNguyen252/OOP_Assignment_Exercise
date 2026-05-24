package service;

import model.Member;
import java.util.ArrayList;


public class GymManager {
    private ArrayList<Member> members;

    private static int totalMember = 0;

    public GymManager() {
        members = new ArrayList<>();
    }

    // phuong thuc nghiep vu
    public void addMember(Member member) {
        members.add(member);
        totalMember++;
        System.out.println("Da them hoi vien: " + member.getFullName());
    }

    public void showAllMembers() {
        if (members.isEmpty()) {
            System.out.println("Khong co hoi vien nao.");
            return;
        }
        System.out.println("Danh sach hoi vien:");
        for (Member member : members) {
            System.out.println(member.getInfo());
        }
    }

    // tim kiem hoi vien theo ten (soi khop gan dung kh phan biet chu hoa hay chu thuong)
    public Member findByName(String name) {
        for (Member member : members) {
            if (member.getFullName().toLowerCase().contains(name.toLowerCase())) {
                return member;
            }
        }
        return null;
    }

    // Phuong thuc tinh
    public static int getTotalMember() {
        return totalMember;
    }
}
