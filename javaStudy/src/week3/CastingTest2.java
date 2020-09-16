package week3;

public class CastingTest2 {
    public static void main(String[] args) {
        int i = '1'; // 문자 => 정수 ASCII 코드표, 문자 1 => 49
        int j = 'A'; // A => 65
        int k = '1' + 'A';

        System.out.println("\'1\' = " + i);
        System.out.println("\'A\' = " + j);
        System.out.println("\'1\' + \'A\' = " + k);

        int l = 66;
        System.out.println("10진수 66에 해당되는 아스키코드 문자는 " + (char) l + "입니다.");
    }
}
