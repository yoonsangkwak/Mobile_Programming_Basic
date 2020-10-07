package week5;

import java.util.Scanner;

public class MultiTest {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("성적을 입력하세요 : ");
        int grade = stdin.nextInt();

        if (grade >= 90) {
            System.out.println("A학점");
        } else if (grade >= 80) {
            System.out.println("B학점");
        } else if (grade >= 70) {
            System.out.println("C학점");
        } else if (grade >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점점");
       }
    }
}
