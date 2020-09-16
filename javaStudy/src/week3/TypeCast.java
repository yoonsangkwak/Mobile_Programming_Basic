package week3;

import java.util.Scanner;

public class TypeCast {
    public static void main(String[] args) {
        /*
        int avg = 9/2;  // 9 int, 2 int, 4.5 => 실수형(정수) 4
        double dAvg = 9/2;  // (정수 / 정수) = 정수, 4.5 => 4
        double dAvg2 = 9/2.0;   // (정수 / 실수) = 실수, 4.5
        double dAvg3 = 9.0/2;   // (실수 / 정수) = 실수, 4.5
        double dAvg4 = 9.0/2.0;   // (실수 / 실수) = 실수, 4.5
        int iavg = (int) (9.0/2.0);   // (실수 / 실수) = 실수, 4.5 => 4

        System.out.println("avg : " + avg);
        System.out.println("dAvg : " + dAvg);
        System.out.println("dAvg2 : " + dAvg2);
        System.out.println("dAvg3 : " + dAvg3);
        System.out.println("dAvg4 : " + dAvg4);
        System.out.println("iavg : " + iavg);
         */

        // 생성자
        // 클래스 => 클래스명 접근이름(객체) = new 클래스명(System.in)

        Scanner stdin = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력 : ");
        int first = stdin.nextInt();

        System.out.println("두 번째 정수를 입력 : ");
        int second = stdin.nextInt();

        double avg1 = (first + second) / 2;
        System.out.println("정수 연산 : 평균은 (" + first + "+" + second + ")/2.0 = " + avg1 + "입니다.");

        double avg2 = (first + second) / 2.0;
        System.out.println("정수 연산 : 평균은 (" + first + "+" + second + ")/2.0 = " + avg2 + "입니다.");

        // 확대 형변환인 경우 자동 형변환이 되고
        // 축소 형변환인 경우 명시적인 형변환을 해야 한다.

        // byte => int 확대 형변환, 자동으로 형변환됨

        // int => byte 축소 형변환
    }
}
