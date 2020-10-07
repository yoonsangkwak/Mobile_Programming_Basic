package week5;

import java.util.Scanner;

public class SwitchTest2 {
    public static void main(String[] args) {
        // 봄(3~5월), 여름(6~8월), 가을(9~11월), 겨울(12~2월)
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄 입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름 입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을 입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울 입니다.");
                break;
            default:
                System.out.println("입력한 값은 1월부터 12월 사이의 값이 아닙니다.");
                break;
        }
    }
}
