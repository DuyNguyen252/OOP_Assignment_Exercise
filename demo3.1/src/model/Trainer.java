package model;

public class Trainer extends Member {
    public Trainer(int memberId, String fullName, String phone, String registerDate, Membership membership) {
        super(memberId, fullName, phone, registerDate, membership);
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInfo'");
    }
    
    @Override
    public double calculateMonthlyFee() {
        // chi phi va phu thu them cho pt/thang
        return getMembership().getPrice() + 500000; // gia thue goi tap + phu thu
    }
}