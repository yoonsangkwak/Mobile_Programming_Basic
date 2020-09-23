package week4;

import java.util.Scanner;

public class TernaryOPTest {
    public static void main(String[] args) {
        // 삼항연산자 : 피연산자 3개를 가진 연산자
        // 수식 1 ? 수식 2 : 수식 3; => true, false
        // true이면 수식2를 가지고 false이면 수식3을 가짐

        /*
        boolean flag;
        int a = 11;
        flag = a >= 10 ? true : false;
        System.out.println("flag : " + flag);

        int count = 10;
        System.out.println(count != 10 ? "10이 아님" : "10을 가짐");
         */

        Scanner stdin = new Scanner(System.in);
        System.out.println("한개의 숫자 입력 : ");

        int a = stdin.nextInt();

        boolean flag;
        flag = (a % 2 == 0) ? true : false;
        System.out.print("a가 짝수 입니까? ");
        System.out.println(flag);

        // 산술연산자 >> 시프트연산자 > 관계연산자 > 비트연산자
        // b = a-4+5*2/2;
    }
}
