package service;

public class BankAccount {
    private String tenTk;
    private int stk;
    private double soDu;

    public BankAccount(String tenTk, int stk, double soDu) {
        this.tenTk = tenTk;
        this.stk = stk;
        this.soDu = soDu;

        if (soDu < 0) {
            this.soDu = 0;
            System.out.println("So du khong hop le. Gan bang 0");
        } else {
            System.out.println("So du cua tai khoan " + tenTk + " la: " + soDu);
        }
    }

    public String getTenTk() {
        return tenTk;
    }

    public int getStk() {
        return stk;
    }

    public double getBalance() {
        return soDu;
    }

    public void setTenTk(String tenTk) {

        if (tenTk != null && !tenTk.trim().isEmpty()) {
            this.tenTk = tenTk;
        } else {
            System.out.println("Ten khong hop le");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            soDu += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= soDu) {
            soDu -= amount;
        }
    }


    public void displayInfo() {
      
        // Kiểm tra nếu STK có từ 4 số trở lên mới cắt được 4 số cuối
        String hiddenAccount = "****" + String.valueOf(stk).substring(String.valueOf(stk).length() - 4);
        System.out.println("----Thong tin tai khoan----");
        System.out.println("Ten tai khoan: " + tenTk);
        System.out.println("4 chu so cuoi cua so tai khoan: " + hiddenAccount);
        System.out.println("So du: " + soDu);
        System.out.println("\n");
    }
}