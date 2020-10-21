import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("중간고사를 입력하시오 : ");
        int midterm = stdin.nextInt();
        System.out.print("기말고사를 입력하시오 : ");
        int finalterm = stdin.nextInt();
        System.out.print("레포트고사를 입력하시오 : ");
        int report = stdin.nextInt();
        System.out.print("출석고사를 입력하시오 : ");
        int attendance = stdin.nextInt();

        double score = ((midterm + finalterm) / 2 * 0.6) + (report * 0.2) + (attendance * 0.2);
        System.out.println("중간고사 : " + midterm);
        System.out.println("기말고사 : " + finalterm);
        System.out.println("레포트 : " + report);
        System.out.println("출석 : " + attendance);
        System.out.println("성적 = " + String.format("%.2f", score));

        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        String evaluation;
        switch (grade) {
            case "A":
            case "B":
                evaluation = "excellent";
                break;
            case "C":
            case "D":
                evaluation = "good";
                break;
            default:
                evaluation = "poor";
                break;
        }
        System.out.println("학점 = " + grade);
        System.out.println("평가 = " + evaluation);
    }
}
