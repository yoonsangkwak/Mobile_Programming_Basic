import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("A값을 입력하시오 : ");
        int A = stdin.nextInt();
        System.out.print("B값을 입력하시오 : ");
        int B = stdin.nextInt();
        System.out.print("연산자를 입력(+,-,*,/) : ");
        String operator = stdin.next();
        if (operator.equals("+")) {
            System.out.println(A + operator + B + " = " + (A + B));
        } else if (operator.equals("-")) {
            System.out.println(A + operator + B + " = " + (A - B));
        } else if (operator.equals("*")) {
            System.out.println(A + operator + B + " = " + (A * B));
        } else if (operator.equals("/")) {
            double answer = (double) A / B;
            System.out.println(A + operator + B + " = " + String.format("%.2f", answer));
        } else {
            System.out.println("연산자에러");
        }
    }
}
