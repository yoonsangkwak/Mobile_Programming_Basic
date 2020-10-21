import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int inputN1 = stdin.nextInt();
        int inputN2 = stdin.nextInt();

        System.out.println(inputN1 + inputN2);
        System.out.println(inputN1 - inputN2);
        System.out.println(inputN1 + inputN2);
        System.out.println((double) inputN1 / inputN2);
        System.out.println(inputN1 % inputN2);
    }
}
