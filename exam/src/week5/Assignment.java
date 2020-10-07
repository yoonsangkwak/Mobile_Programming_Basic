package week5;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // 연속적인 if, 중첩 if
        // A+, A, B+, B, C+, C, D+, D, F // 각 1점씩
        // A+ : 95 <= x <= 100
        // A : 90 <= x < 95
        // B+ : 85 <= x < 90
        // ...

        Scanner stdin = new Scanner(System.in);
        int score = stdin.nextInt();

        if (score >= 90 && score <= 100) {
            if (score >= 95) {
                System.out.println("A+");
            } else {
                System.out.println("A");
            }
        } else if (score >= 80 && score < 90) {
            if (score >= 85) {
                System.out.println("B+");
            } else {
                System.out.println("B");
            }
        } else if (score >= 70 && score < 80) {
            if (score >= 75) {
                System.out.println("C+");
            } else {
                System.out.println("C");
            }
        } else if (score >= 60 && score < 70) {
            if (score >= 65) {
                System.out.println("D+");
            } else {
                System.out.println("D");
            }
        } else if (score < 60 && score >= 0) {
            System.out.println("F");
        } else {
            System.out.println("값을 잘못 입력하셨습니다.");
        }
    }
}
