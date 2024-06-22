package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        int depositAmount = 1000;
        balance += depositAmount;
        System.out.printf(depositAmount + "원을 입금하셨습니다. 현재 잔액은 : " + balance);
        System.out.println();

        int withdrawAmount = 5000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액은 : " + balance);
        } else {
            System.out.println(withdrawAmount + "원을 출금하려하였으나 잔액이 부족합니다. (부족금액 : " + (withdrawAmount - balance) + ")");
        }
        System.out.println("현재 잔액은 : " + balance);

    }
}
