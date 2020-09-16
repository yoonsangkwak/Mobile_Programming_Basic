package week3;

public class ArithmeticOPTest3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println((++a + ++a)); // 11 + 12

        a = 10;
        System.out.println(++a - ++a); // 11 - 12, 초기화 안하면 13 - 14

        a = 10;
        System.out.println(a++ + a++); // 10 + 11 , a = 12됨

        a = 10;
        System.out.println(a++ - a++); // 10 - 11 , a = 12됨

        a = 10;
        System.out.println(++a + a++); // 11 + 11 , a = 12됨

        // ++
        // -- a = a - 1

        a = 10;
        System.out.println(--a + --a); // 9 + 8
    }
}
