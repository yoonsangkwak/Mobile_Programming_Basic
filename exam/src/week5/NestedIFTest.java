package week5;

import java.util.Scanner;

public class NestedIFTest {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("성적을 입력하시오 : ");
        int grade = stdin.nextInt();

        if (grade >= 80) {
            System.out.println("우수 학점군에 속합니다.");
            if (grade >= 90) {
                System.out.println("A 학점입니다.");
            } else {
                System.out.println("B 학점입니다.");
            }
        } else {
            if (grade >= 60) {
                System.out.println("보통 학점군에 속합니다.");
                if (grade >= 70) {
                    System.out.println("C 학점입니다.");
                } else {
                    System.out.println("D 학점입니다.");
                }
            } else {
                System.out.println("학점 취득 실패하셨습니다.");
            }
        }
    }
}
