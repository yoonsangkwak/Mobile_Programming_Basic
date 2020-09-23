package week4;

public class LogicalOPTest {
    public static void main(String[] args) {
        // &&, ||, !

        // && : 피연산자 2개가 필요, 둘 다 true이면 true이고 하나라도 false이면 false
        // true && true => true, false && true => false, true && false => false, false && false => false

        // || : 피연산자 2개가 필요, 하나 이상의 값이 true인 경우 true
        // true || true => true, true || false => true, false || true => true, false || false => false

        // ! : 단항연산자, 피연산자 1개가 필요
        // !true => false, !false => true

        boolean flag;
        flag = 30 < 20;
        // flag = 30 && 20; // 사용이 불가능
        flag = 30 < 20 || 50 > 20; // 30 < 20 => false, 50 > 20 => true
        System.out.println("flag : " + flag);

        flag = 20 + 30 < 20 * 2; // 50 < 40, 산술연산자가 우선순위 더 높음
        System.out.println("flag : " + flag);

        flag = !flag;   // flag = 20 + 30 || 20 * 2;
        System.out.println("flag : " + flag);

        System.out.println();
        boolean result;
        result = (20 > 10) || (30 > 40); // true || false => true
        System.out.println("(20 > 10) || (30 > 40) = " + result);

        result = (20 > 10) && (30 > 40); // true && false => false
        System.out.println("(20 > 10) && (30 > 40) = " + result);

        result = !result;
        System.out.println("!result : " + result);

        System.out.println("(20 > 10) || (30 > 40) = " + ((20 > 10) || (30 > 40)));
        System.out.println("(20 > 10) && (30 > 40) = " + ((20 > 10) && (30 > 40)));

        // 관게연산자, 논리연산자 (조건문에서 조합해서 사용됩니다.)
    }
}
