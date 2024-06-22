package method;

public class MethodCasting {
    public static void main(String[] args) {
        double num = 1.5;
        printNum((int)num); //명시적 형변환을 통해 double을 int로 변환
    }

    public static void printNum(int num) {
        System.out.println("숫자는 : " + num);
    }
}
