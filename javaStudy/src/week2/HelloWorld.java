package week2;

public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello World!!!");

        //  int x = 3;
        //  int y = 5;
        //  System.out.println("x + y : " + (x+y));

        // 변수명을 만들수 있는데 => 식별자 (메소드, 상수, 변수명, 배열 등)
        // 문자, 숫자, 특수문자(_, $ => 사용)
        // 첫번째 문자로는 숫자를 사용할 수 없다.
        // 예약어를 식별자로 사용할 수 없다.
        // 식별자는 길이 제한을 두지 않는다.

        /*
        int x;
        x = 3;
        x = 7;

        if (x < 8) {
            // 참인 문장
        } else {
            // 거짓 문장장
        }
       System.out.println(x);
        */

        // 식별자 사용할 때 일반적인 관례
        // 클래스 이름 => 단어의 첫 번째는 대문자로 한다.
        // 메소드나 변수, 배열, 문자열 => 첫글자는 소문자로 사용 helloworld
        // 상수 => HELLOWORLD 상수는 항상 대문자

        // 기본 자료형 : byte, short, int, long, char, float, double, boolean
        // 참조 자료형 : 클래스형, 인터페이스형, 배열형, 열거형

        // 정수형 : byte(8bit), short(16bit), int(32bit), long(64bit), char(8bit)
        // 실수형 : float, double
        // 논리형 : boolean

        /*
        byte a = (byte) 128; // 기본적인 모두 int
        System.out.println("128을 저장한 byte 값은 : " + a);
        byte b = (byte) 256;
        System.out.println("256을 저장한 byte 값은 " + b);

        char x = 'a';
        char y = 'A';
        System.out.println("a 문자의 정수 : " + (int) x);
        System.out.println("b 문자의 정수 : " + (int) y);

        int x1 = 0;

        // 실수형으로 데이터 저장할 때
        // 실수형 : float, double

        float x2 = 0.54333f;
        System.out.println(x2);

        double x3 = 0.454533;
        System.out.println(x3);

        // 논리형 boolean => true : 1, false : 0
        boolean a2 = true;
        System.out.println("boolean a2의 값 : " + a2);
        boolean b2 = 10 > 20; // false : >, <, >=, <=, ==, !=
        System.out.println("boolean b2의 값 : " + b2);
        boolean c2 = a2;
        System.out.println("boolean c2의 값 : " + c2);
         */

        // 상수 : 변하지 않는 값을 저장하는 변수
        // 리터럴 : 값 자체
        final int MAX = 100;
        System.out.println("MAX : " + MAX);
        final double PI;
        PI = 3.14;
        System.out.println("PI : " + PI);

        float y4 = 3.0f;
        int x4 = 7;
        x4 = 8;
        x4 = 9;
        System.out.printf("정수 : %d, 실수 : %f, 더블형 : %f", x4, y4, PI);

        // 2주차 과제
        // 정수형 : byte(8bit), short(16bit), int(32bit), long(64bit), char(8bit)
        // 실수형 : float, double
        // 논리형 : boolean

        // 8개의 데이터 타입에 대해 변수 선언하고 값을 대입해서 출력하는 java 파일 만들기
    }
}
