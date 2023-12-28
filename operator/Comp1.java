package operator;

import java.sql.SQLOutput;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); // 출력 : false
        System.out.println(a != b); // 출력 : true
        System.out.println(a > b); // 출력 : false
        System.out.println(a < b); // 출력 : true
        System.out.println(a >= b); // 출력 : false
        System.out.println(a <= b); // 출력 : true

        // 결과를 boolean 변수에 담을 수 있음
        boolean result = a == b;
        System.out.println(result); // 출력 : false
    }
}
