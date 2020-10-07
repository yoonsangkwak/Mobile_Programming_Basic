package week5;

import java.util.Scanner;

public class SwitchTest3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        char grade = stdin.next().charAt(0);

        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("우수 학점군에 속합니다.");
                break;
            case 'C':
            case 'D':
                System.out.println("보통 학점군에 속합니다.");
                break;
            case 'F':
                System.out.println("학점 취득 실패하셨습니다.");
                break;
            default:
                System.out.println("학점을 잘못 입력하셨습니다.");
                break;
        }
    }
}
