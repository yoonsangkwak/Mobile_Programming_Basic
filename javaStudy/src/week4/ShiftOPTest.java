package week4;

import java.util.Scanner;

public class ShiftOPTest {
    public static void main(String[] args) {
        // 시프트연산자 : <<, >>, >>>
        // 피연산자가 2개 필요, 이항 연산자

        // a << n : a를 좌측으로 n번 이동, 비트단위 이동
        // a >> n : 비트 단위로 우측 이동 (부호비트는 이동되지 않음, 음수일때 수행하더라도 양수안됨)
        // a >>> n : 비트 단위로 우측 이동 (부호비트 고려하지 않음, 음수일때 수행하면 양수가됨)

        // 2 << 3 => 10(2) -> 10000(16) : 2의 3승과 같은 의미
        // 8 >> 2 => 1000(8) -> 0010(2) : 2의 2승으로 나눈값

        /*
        int a = 2;
        int b = 8;
        System.out.println("a : " + Integer.toBinaryString(a));
        System.out.println("a << 3 : " + Integer.toBinaryString(a << 3));

        System.out.println("b : " + Integer.toBinaryString(b));
        System.out.println("b >> 2 : " + Integer.toBinaryString(b >> 2));
        */

        Scanner stdin = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력 : ");

        int a = stdin.nextInt();
        int b = stdin.nextInt();

        System.out.println("a : " + Integer.toBinaryString(a));
        System.out.println("b : " + Integer.toBinaryString(b));

        System.out.println("a << 2 : " + (a << 2) + " : " + Integer.toBinaryString(a << 2));
        System.out.println("a >> 2 : " + (a >> 2) + " : " + Integer.toBinaryString(a >> 2));

        System.out.println("b << 2 : " + (b << 2) + " : " + Integer.toBinaryString(b << 2));
        System.out.println("b >> 2 : " + (b >> 2) + " : " + Integer.toBinaryString(b >> 2));
        System.out.println("b >>> 2 : " + (b >>> 2) + " : " + Integer.toBinaryString(b >>> 2));

    }
}
