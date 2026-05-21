package com.gym.model;

public class Member {
    private String memberId;
    private String fullName;
    private String phone;
    private String registerDate;
    private Membership membership; // <-- LIEN KET (Assosiation) toi lop Membership

    // Constructor

    public Member(String memberId, String fullName, String phone,  String registerDate, Membership membership) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.phone = phone;
        this.registerDate = registerDate;
        this.membership = membership;
    }

    // ----- Getter / Setter -----
    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getRegisterDate() { return registerDate; }
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public Membership getMembership() { return membership; }
    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public String getInfo() {
        String mName = (membership == null)
                ? "Chua dang ky goi"
                : membership.getPackageName();
        return "Ma HV: " + memberId
                + " | Ten: " + fullName
                + " | SDT: " + phone
                + " | Ngay DK: " + registerDate
                + " | Goi: " + mName;
    }
}


