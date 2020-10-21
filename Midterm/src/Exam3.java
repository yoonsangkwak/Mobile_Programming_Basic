import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("input a : ");
        int a = stdin.nextInt();
        System.out.print("input b : ");
        int b = stdin.nextInt();

        int answer = (a > b) ? a : b;

        System.out.println("큰 수 : " + answer);
    }
}
