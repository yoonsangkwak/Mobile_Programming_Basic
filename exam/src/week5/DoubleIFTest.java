package week5;

import java.util.Scanner;

public class DoubleIFTest {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("성적을 입력하시오 : ");
        int grade = stdin.nextInt();

        if (grade >= 90) {
            System.out.println("입력된 학점 : " + grade);
            System.out.println("A학점 취득성공");
        } else {
            System.out.println("A학점 취득을 위한 필요 점수 : " + (90 - grade));
            System.out.println("A학점 취득실패");
        }
        System.out.println("프로그램 종료");

        // 연속적인 if문 - 다중 if문
        // 90 >= A , 80 <= x < 90 : B , 70 <= x < 80 : C, 60 <= x < 70 : D

    }
}
