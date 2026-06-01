package model;

public abstract class Member {
    private int memberId;
    private String fullName;
    private String phone;
    private String registerDate;
    private Membership membership; // Lien ket (association) voi lop  lien ket Membership

    // constructor
    public Member(int memberId, String fullName, String phone, String registerDate, Membership membership) {
       this.memberId = memberId;
       this.fullName = fullName;
       this.phone = phone;
       this.registerDate = registerDate;
       this.membership = membership;
    }

    //getter va setter
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }  

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegisterDate() {
        return registerDate;
    }
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public Membership getMembership() {
        return membership;
    }
    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    // public String getInfo() {
    //     String mName = (membership== null)
    //         ? "Chua dang ky goi tap"
    //         : membership.getPackageName();
    //     return "AnDy: " + memberId
    //         + ", " + fullName
    //         + ", " + phone
    //         + ", " + registerDate
    //         + ", " + mName;
    // }


    public abstract String getInfo();
    public abstract double calculateMonthlyFee();



    @Override
    public String toString() {
        return "Member [memberId=" + memberId + ", fullName=" + fullName + ", phone=" + phone + ", registerDate="
                + registerDate + ", membership=" + membership.getPackageName() + "]";
    }
}
