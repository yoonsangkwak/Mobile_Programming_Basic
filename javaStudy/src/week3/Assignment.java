package week3;

public class Assignment {
    public static void main(String[] args) {
        // 3주차 과제는 산술연산자
        // 산술연산자 : +, -, *, /, %, ++, -- (단항연산자)

        // 산술연산자 7개를 가지고 자동형변환(5개)과 명시적 형변환(5개)을 총 10개를 출력하는 프로그램을 만들어 보시오.

        byte a1 = 120;
        int b1 = 9;

        int c1 = a1 - b1;
        byte d1 = (byte) (a1 + b1);

        System.out.println("a1 - b1를 int로 나타낸 값 : " + c1);
        System.out.println("a1 + b1를 byte로 나타낸 값 : " + d1);

        int a2 = 30;
        double b2 = 25.0;

        double c2 = a2 / b2;
        byte d2 = (byte) (a2 * b2);

        System.out.println("a2 / b2를 double로 나타낸 값 : " + c2);
        System.out.println("a2 * b2를 byte로 나타낸 값 : " + d2);

        int a3 = 50;
        short b3 = 12;

        int c3 = a3 % b3;
        byte d3 = (byte) (a3 / b3);

        System.out.println("a3 % b3를 int로 나타낸 값 : " + c3);
        System.out.println("a3 / b3를 byte로 나타낸 값 : " + d3);

        int a4 = 20;
        int b4 = 5;

        long c4 = a4 * b4;
        byte d4 = (byte) (a4 / b4);

        System.out.println("a4 * b4를 long로 나타낸 값 : " + c4);
        System.out.println("a4 / b4를 byte로 나타낸 값 : " + d4);

        byte a5 = 127;
        int b5 = 127;

        int c5 = --a5;
        byte d5 = (byte) ++b5;

        System.out.println("--a5를 int로 나타낸 값 : " + c5);
        System.out.println("++b5를 byte로 나타낸 값 : " + d5);
    }
}
