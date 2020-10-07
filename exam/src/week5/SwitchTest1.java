package week5;

import java.util.Scanner;

public class SwitchTest1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int number = stdin.nextInt();

        switch (number) {
            case 0:
                System.out.println("없음");
                break;
            case 1:
            case 2:
                System.out.println("하나 또는 둘");
                break;
            default:
                System.out.println("많음");
                break;
        }
    }
}
