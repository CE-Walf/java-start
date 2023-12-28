package operator;

public class Operator2 {
    public static void main(String[] args) {

        // 문자열과 문자열 더하기 1
        String result1 = "hello " + "world";
        System.out.println(result1); // 출력 : hello world

        // 문자열과 문자열 더하기 2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2); // 출력 : string1string2

        // 문자열과 숫자 더하기 1
        // Java에서는 String 타입과 다른 타입을 더하는 경우 그 대상을 문자열로 변경한다.
        String result3 = "a + b = " + 10;
        System.out.println(result3); // 출력 : a + b = 10

        // 문자열과 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4); // 출력 : a + b = 20
    }
}
