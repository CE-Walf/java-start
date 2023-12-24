package variable;

public class Var8 {
    public static void main(String[] args) {
        // 다양한 숫자 타입

        // 정수 (long은 뒤에 'L' 붙여주기)
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32768 ~ 32767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수 (float은 뒤에 'f' 붙여주기)
        float f = 10.0f;
        double d = 10.0; // double이 더 큰 범위의 실수 사용 가능

        // 정수 리터럴은 int를 기본으로 사용, 그러므로 숫자가 int의 범위를 넘어가면 L을 붙여 리터럴을 long으로 변경해야함.
        // 실수 리터럴은 double을 기본으로 사용

    }
}
