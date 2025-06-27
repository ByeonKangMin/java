package a5_claas;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankObjeck = new BankAccount("111-222-333","스티브",10000);
        System.out.println(bankObjeck);
        //정상
        if (bankObjeck.deposit(2000)){
            System.out.println(bankObjeck);
            System.out.println("입금성공");
            System.out.println(bankObjeck);
        }
        //오류
        if (bankObjeck.deposit(0)) {
            System.out.println(bankObjeck);
            System.out.println("입금성공");
            System.out.println(bankObjeck);
        }
        //정상
        if (bankObjeck.withdraw(3000)) {
            System.out.println(bankObjeck);
            System.out.println("출금성공");
            System.out.println(bankObjeck);
        }
        //오류
        if (bankObjeck.withdraw(15000)) {
            System.out.println(bankObjeck);
            System.out.println("출금성공");
            System.out.println(bankObjeck);
        }
    }
}
