package week3;

public class CastingTest {
    public static void main(String[] args) {
        byte b = 120;
        int i = b;  // b : 8bit, i : 32bit => 확대 형변환
        System.out.println("확대 형변환: " + i);

        int j = 259;
        double d = 259.428;
        System.out.println("축소 형변환 : ");

        b = (byte) j;  // b : 8bit, j : 32bit
        System.out.println("int 259를 byte로 : " + b);  // 256 => 0, 257 => 1

        i = (int) d; // 실수 => 정수
        System.out.println("double 259.428을 int로 : " + i);

        b = (byte) d;
        System.out.println("double 259.428을 byte로 : " + b);
    }
}
