package week5;

import java.util.Scanner;

public class SimpleTest {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int count = stdin.nextInt();

        if (count > 0)
            System.out.println("입력된 값은 양수 입니다.");

        // 문장의 종료는 ;
    }
}
