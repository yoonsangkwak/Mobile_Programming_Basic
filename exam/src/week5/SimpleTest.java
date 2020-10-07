package week5;

import java.util.Scanner;

public class SimpleTest {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int count = stdin.nextInt();

        if (count > 0) {
            System.out.println("입력된 값은 양수 입니다.");
            System.out.println("하나 더 출력");
        }

        System.out.println("if문과 상관없는 문장");

        // 문장의 종료는 ;

        // if 조건식이 거짓일 때 수행
        // if (조건식)
        //      문장1;
        // else
        //      문장2;
    }
}
