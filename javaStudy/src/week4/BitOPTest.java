package week4;

public class BitOPTest {
    public static void main(String[] args) {
        // 논리 연산자 : &&, ||, ! => true, false

        // 비트 연산자 : &, |, ^, ~ => 1, 0
        // 수를 입력하면 => 메모리 저장이되요 => 비트 단위로 저장되요 => 비트 단위로 연산 수행

        // & : 피연산자 2개, 1,0으로 표기가 되는 데이터 => 피연산자 2개가 모두 1일때만 해당 결과가 true
        // | :  "   => 피연산자 중 1개 이상이 1일 때 결과가 true를 가지고 둘 다 false일 때 결과는 false다
        // ~ : 1 => 0, 0 => 1로 바꿔주는 것
        // ^ : 피연산자 2개, 2개의 값이 같으면 false, 2개의 값이 다르면 true 값을 가짐
        // 1 ^ 1 => 0, 1 ^ 0 => 1

        int a = 14;
        int b = 11;
        System.out.println("a : " + Integer.toBinaryString(a));
        System.out.println("b : " + Integer.toBinaryString(b));
        System.out.println("a & b : " + Integer.toBinaryString(a & b));
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + Integer.toBinaryString(a | b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + Integer.toBinaryString(a ^ b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~b : " + Integer.toBinaryString(~b));
        System.out.println("~b : " + (~b));
    }
}
