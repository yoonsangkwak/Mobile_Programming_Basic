import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Input Character : ");
        String str = stdin.next();
        char ch = str.charAt(0);
        if (Character.isUpperCase(ch) == true) {
            System.out.println("result : " + str.toLowerCase());
        } else if (Character.isLowerCase(ch) == true) {
            System.out.println("result : " + str.toUpperCase());
        } else {
            System.out.println("입력데이터오류");
        }
    }
}
