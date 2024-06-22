package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
     sum(1,2,3);
     sum(15,25,35);
    }

    public static void sum(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        System.out.println("평균값은 : " + avg);
    }
}
