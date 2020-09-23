package week4;

public class ShiftOPTest2 {
    public static void main(String[] args) {
        // 단축배정연산자 => 배정연산자와 다른 연산자를 같이 사용하는것
        // = (산술연산자, 관계연산자, 논리연산자...)

        // x = 4;
        // x = x + 7; => x += 7;

        // +, -, *, /, %, &, |, ^, <<, >>, >>>

        int a = 10;
        System.out.println("a : " + a);

        a += 4; // a = a + 4
        System.out.println("a += 4 : " + a);

        a %= 4; // a = a % 4
        System.out.println("a %= 4 : " + a);

        a <<= 4; // a = a << 4
        System.out.println("a <<= 4 : " + a);

        boolean b = false;
        b &= a > 2; // b = b & (a > 2) , 0 & 1 => 0
        System.out.println("b &= a > 2 : " + b);
    }
}
