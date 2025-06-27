package a5_claas;

public class BankAccount {
    //필드
    String accountNumber;      //계좌번호
    String ownerName;       //예금주
    double balance;           //잔액

    //생성자
    public BankAccount() {
    }
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //매서드
    public boolean deposit(double amount){      //입금
        if(amount<=0) {
            System.out.println("입금액에 오류가 있습니다");
            return false;
        }else {
            this.balance = this.balance + amount;
            return true;
        }
    }
    public boolean withdraw(double amount){     //출금
        if(amount<=0) {
            System.out.println("출금액에 오류가 있습니다");
            return false;
        } else if (amount > this.balance) {
            System.out.println("출금액이 잔액보다 큽니다");
            return  false;
        } else {
            this.balance = this.balance - amount;
            return true;
        }
    }
    @Override
    public String toString() {
        return accountNumber + " " + ownerName + " " +balance;
    }
}
