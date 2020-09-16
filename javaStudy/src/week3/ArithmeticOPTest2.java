package week3;

public class ArithmeticOPTest2 {
    public static void main(String[] args) {
        byte a = 127, b = 2;
        byte c = (byte) (a * b); // byte 연산 byte 결과 => int (32) 254, 256 => 0, 255 => -1
        System.out.println("a * b의 결과를 byte로 변환 : " + c); // -2

        int d = a * b;
        System.out.println("a * b의 결과를 int로 변환 : " + d);

        int i = 1000000, j = 1000000;
        long m = i * j; // 정수 * 정수 => int형
        System.out.println("백만 * 백만의 결과를 int로 : " + m);

        m = (long) i * j; // 정수(long) * 정수(int) => 정수(long)
        System.out.println("백만 * 백만의 결과를 long로 : " + m);

        m = (long) i * (long) j;
        System.out.println("백만 * 백만의 결과를 long로 : " + m);
    }
}
