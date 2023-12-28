package operator;

import java.sql.SQLOutput;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: And 연산");
        System.out.println(true && true); // 출력 : true
        System.out.println(true && false); // 출력 : false
        System.out.println(false && false); // 출력 : false

        System.out.println("||: OR 연산");
        System.out.println(true || true); // 출력 : true
        System.out.println(true || false); // 출력 : true
        System.out.println(false || false); // 출력 : false

        System.out.println("! 연산");
        System.out.println(!true); // 출력 : false
        System.out.println(!false); // 출력 : true

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // 출력 : false
        System.out.println(a || b); // 출력 : true
        System.out.println(!a); // 출력 : false
        System.out.println(!b); // 출력 : true


    }
}
