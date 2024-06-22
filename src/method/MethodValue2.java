package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("changeNum 호출 전, num1 = " + num1);
        num1 = changeNum(num1);
        System.out.println("changeNum 호출 후 num1 = " + num1);
    }
    public static int changeNum(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
