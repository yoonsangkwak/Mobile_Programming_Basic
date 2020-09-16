package week3;

public class ArithmeticOPTest1 {
    public static void main(String[] args) {
        int a = 5, b = 2;
        int sum = a + b;
        System.out.println("a + b = " + sum);

        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("a - b = " + sub); // 3
        System.out.println("a * b = " + mul); // 10
        System.out.println("a / b = " + div); // 2
        System.out.println("a % b = " + mod); // 1

        int c = ++a; // 전위 증가 연산자, 1을 더해서 자기 자신의 공간에 저장
        System.out.println("a의 전위 증가 연산 : " + c);

        int d = b++;
        System.out.println("b의 후위 증가 연산 : " + d); // 2
        System.out.println("b의 값? : " + b);
    }
}
