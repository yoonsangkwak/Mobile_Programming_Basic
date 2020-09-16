package week3;

public class CastingTest3 {
    public static void main(String[] args) {
        long l = 1234567890123456789L;
        float f = l;
        double d = l;

        System.out.println("원래의 long 값 : " + l);
        System.out.println("long >> float으로 변환값 : " + f);
        System.out.println("long >> double으로 변환값 : " + d);

        long fl = (long) f;
        long dl = (long) d;

        System.out.println("long >> float >> long 변환 : " + fl);
        System.out.println("long >> double >> long 변환 : " + dl);

        // 수식 => 연산자와 피연산자로 구성
        // 연산자 : 산술연산자, 관계연산자, 논리연산자, 비트연산자 등등...
        // 피연산자 : 변수, 리터럴, 상수

        // 연산자 3가지
        // 단항 연산자, 이항 연산자, 삼항 연산자
        // 부호, ++, -- : 단항 연산자
        // +, * : 이항 연산자
        // 피연산자가 3개 필요한거 (삼항 연산자)   count > 0 => 0 else 1

        // 산술연산자 : +, -, *, /, %, ++, --
    }
}
