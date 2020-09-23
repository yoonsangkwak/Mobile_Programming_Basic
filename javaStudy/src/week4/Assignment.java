package week4;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // 과제
        // 여러분이 값을 입력하여 메모리에 저장할 수 있는 정수형 변수 2개를 만듭니다.
        // 결과값을 저장할 수 있는 boolean형 변수 1개, 정수형 변수 1개를 만듭니다.

        // 정수 2개를 입력해서 시프트 연산 (<<, >>) 2개를 이용한 수식을 만들고 수식의 결과 값을 출력하고
        // 정수 2개를 입력받은 변수를 이용해서 관계연산자와 논리연산자를 같이 사용해서 수식 4개를 만들고 결과를 저장해서 각각의 값을 출력
        // 정수 2개를 입력받은 변수를 이용해서 비트연산자를 사용하여 수식 4개를 만들고 각각의 결과를 정수형 데이터에 저장하여 결과를 출력

        System.out.println("두 개의 정수를 입력하세요 : ");
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt();
        int b = stdin.nextInt();

        boolean flag;
        int result;

        result = a << b;
        System.out.println("a << b : " + result);
        result = a >> b;
        System.out.println("a >> b : " + result);

        flag = (a > b) && (a == b);
        System.out.println("(a > b) && (a == b) : " + flag);
        flag = (a != b) || (a <= b);
        System.out.println("(a != b) || (a <= b) : " + flag);
        flag = (a < b) || (a == b);
        System.out.println("(a < b) || (a == b) : " + flag);
        flag = !(a == b);
        System.out.println("!(a == b) : " + flag);

        result = a & b;
        System.out.println("a & b : " + result + " : " +Integer.toBinaryString(result));
        result = a | b;
        System.out.println("a | b : " + result + " : " +Integer.toBinaryString(result));
        result = a ^ b;
        System.out.println("a ^ b : " + result + " : " +Integer.toBinaryString(result));
        result = ~b;
        System.out.println("~b : " + result + " : " + Integer.toBinaryString(result));
    }
}
