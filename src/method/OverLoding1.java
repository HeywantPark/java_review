package method;

public class OverLoding1 {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(sub(5,1,2));

    }
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }
    public static int sub(int a, int b, int c) {
        System.out.println("2번 호출");
        return a - b - c;
    }
}
