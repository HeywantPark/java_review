package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;
        balance = depositAmount(balance,1000);
        balance = withdrawAmount(balance,1000);
        System.out.println("최종 잔액은 : " + balance);
    }

    public static int depositAmount(int balance ,int Amount) {

        if (Amount > 0) {
            balance += Amount;
            System.out.printf(Amount + "원을 입금하셨습니다. 현재 잔액은 : " + balance);
            System.out.println();
        } else {
            System.out.println("마이너스 금액은 입급할 수 없습니다.");
        }
        return balance;
    }

    public static int withdrawAmount(int balance, int Amount) {
        if (balance >= Amount) {
            balance -= Amount;
            System.out.println(Amount + "원을 출금하였습니다. 현재 잔액은 : " + balance);
        } else {
            System.out.println(Amount + "원을 출금하려하였으나 잔액이 부족합니다. (부족금액 : " + (Amount - balance) + ")");
        }
        return balance;
    }
}
