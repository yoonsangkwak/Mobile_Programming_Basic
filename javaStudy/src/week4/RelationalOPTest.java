package week4;

public class RelationalOPTest {
    public static void main(String[] args) {
        // 관계연산자 : >, >=, <, <=, ==, !=

        byte a = 20;
        double d = 3.14;
        boolean flag;

        flag = a > d; // true : 1, false : 0
        System.out.println("a가 d보다 큰가? " + flag);

        flag = a == 20.0f;
        System.out.println("a가 20.0f와 같은가? " + flag);

        flag = 10 != 10.0f;
        System.out.println("10이 10.0f와 같지 않은가? " + flag);

        flag = 10 <= 20;
        System.out.println("10이 20보다 작거나 같은가? " + flag);
        System.out.println("10이 20보다 작거나 같은가? " + (10 <= 20));
        System.out.println("10이 20보다 큰가? " + (10 > 20));
    }
}
